package alexengrig.cms.model;

import lombok.Data;

@Data
public class User {

    private Long id;

    private String identity;

    private String name;

    private Role role;

}
