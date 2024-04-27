package klikmy.repo.klikmylink.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cv")
public class Cv {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;
    private String photoProfile;
    private String title;
    private String summary;
    private String userUrl;
    private String email;
    private String phoneNumber;
    private String linkedinLink;
    private String instagramLink;
    private String githubLink;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "cv_template",
        joinColumns = @JoinColumn(name = "cv_id"),
        inverseJoinColumns = @JoinColumn(name = "template_id")
    )
    private List<Template> templates;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cv_id") // foreign key in Experience table
    private List<Experience> experiences;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cv_id") // foreign key in Education table
    private List<Education> educations;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cv_id") // foreign key in Skill table
    private List<Skill> skills;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cv_id") // foreign key in Certificate table
    private List<Certificate> certificates;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cv_id") // foreign key in Project table
    private List<Project> projects;
}