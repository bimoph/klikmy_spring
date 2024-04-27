
package klikmy.repo.klikmylink.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;
import klikmy.repo.klikmylink.model.Category;

@Repository
@Transactional
public interface CategoryRepository  extends JpaRepository<Category, Long> {
    Optional<Category> findById(Long idCategory);
}
