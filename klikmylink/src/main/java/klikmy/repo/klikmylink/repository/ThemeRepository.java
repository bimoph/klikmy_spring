
package klikmy.repo.klikmylink.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;
import klikmy.repo.klikmylink.model.Category;
import klikmy.repo.klikmylink.model.Theme;

@Repository
@Transactional
public interface ThemeRepository  extends JpaRepository<Theme, Long> {
    Optional<Theme> findById(Long idTheme);
}
