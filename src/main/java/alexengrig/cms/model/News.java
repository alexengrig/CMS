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

}
