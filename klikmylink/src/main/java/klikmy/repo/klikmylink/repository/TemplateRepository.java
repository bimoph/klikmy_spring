package klikmy.repo.klikmylink.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;
// import klikmy.repo.klikmylink.model.Education;
import klikmy.repo.klikmylink.model.Template;
// import klikmy.repo.klikmylink.model.Theme;

@Repository
@Transactional
public interface TemplateRepository  extends JpaRepository<Template, Long> {
    Optional<Template> findById(Long idTemplate);
}
