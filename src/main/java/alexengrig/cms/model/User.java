package alexengrig.cms.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "\"user\"")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String identity;

    private String name;

    private Role role;

}
