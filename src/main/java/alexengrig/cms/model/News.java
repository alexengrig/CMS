package alexengrig.cms.model;

import lombok.Data;

import java.util.Set;

@Data
public class News {

    private Long id;

    private String title;

    private String content;

    private User author;

    private Set<User> mandatoryReviewers;

    private Set<Review> reviewers;

    private Set<Category> categories;

    private Set<Tag> tags;

    public Review review(User reviewer, String status) {
        final Review review = new Review(reviewer, status);

        this.reviewers.add(review);

        return review;
    }

}
