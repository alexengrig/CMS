package alexengrig.cms.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "news")
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String content;

    private User author;

    private Set<User> mandatoryReviewers;

    private Set<Review> reviews;

    private Set<Category> categories;

    private Set<Tag> tags;

    public Review review(User reviewer, String status) {
        final Review review = new Review(reviewer, status);

        this.reviews.add(review);

        return review;
    }

    public Boolean revised() {
        return this.mandatoryReviewers
                .stream()
                .allMatch(reviewer -> this.reviews
                        .stream()
                        .anyMatch(review -> reviewer.equals(review.getReviewer())
                                && "approved".equals(review.getStatus())));
    }

}
