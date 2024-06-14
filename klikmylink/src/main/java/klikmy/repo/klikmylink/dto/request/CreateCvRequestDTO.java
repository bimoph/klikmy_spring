package klikmy.repo.klikmylink.dto.request;

import java.util.List;

import klikmy.repo.klikmylink.model.Certificate;
import klikmy.repo.klikmylink.model.Education;
import klikmy.repo.klikmylink.model.Experience;
import klikmy.repo.klikmylink.model.Project;
import klikmy.repo.klikmylink.model.Skill;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateCvRequestDTO {
    private String firstName;
    private String lastName;
    private String photoProfile;
    private String title;
    private String summary;
    private String userUrl;
    private String email;
    private String phoneNumber;
    private String whatsapp;
    private String tiktok;
    private String twitter;
    private String linkedinLink;
    private String instagramLink;
    private String githubLink;

    private List<String> userIs;

    private List<Long> idTemplate;
    private List<Experience> experiences;
    private List<Education> educations;
    private List<Skill> skills;
    private List<Certificate> certificates;
    private List<Project> projects;
}



// @ManyToMany(cascade = CascadeType.ALL)
// @JoinTable(
//     name = "cv_template",
//     joinColumns = @JoinColumn(name = "cv_id"),
//     inverseJoinColumns = @JoinColumn(name = "template_id")
// )
// private List<Template> templates;

// @OneToMany(cascade = CascadeType.ALL)
// @JoinColumn(name = "cv_id") // foreign key in Experience table
// private List<Experience> experiences;

// @OneToMany(cascade = CascadeType.ALL)
// @JoinColumn(name = "cv_id") // foreign key in Education table
// private List<Education> educations;

// @OneToMany(cascade = CascadeType.ALL)
// @JoinColumn(name = "cv_id") // foreign key in Skill table
// private List<Skill> skills;

// @OneToMany(cascade = CascadeType.ALL)
// @JoinColumn(name = "cv_id") // foreign key in Certificate table
// private List<Certificate> certificates;

// @OneToMany(cascade = CascadeType.ALL)
// @JoinColumn(name = "cv_id") // foreign key in Project table
// private List<Project> projects;