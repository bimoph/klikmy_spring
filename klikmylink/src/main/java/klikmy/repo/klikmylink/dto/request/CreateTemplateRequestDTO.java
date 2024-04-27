package klikmy.repo.klikmylink.dto.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateTemplateRequestDTO {
    private String name;
    private String contributor;
    private Double price;
    private long idCategory;
    private long idTheme;
}
