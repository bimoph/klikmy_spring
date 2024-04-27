package klikmy.repo.klikmylink.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "template")
public class Template {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "idCategory")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "theme_id", referencedColumnName = "idTheme")
    private Theme theme;

    private String contributor;
    private Double price;


    @ManyToMany(mappedBy = "templates")
    private List<Cv> cvs;
}