package klikmy.repo.klikmylink.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import klikmy.repo.klikmylink.model.Cv;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public interface CvRepository extends JpaRepository<Cv, Long> {
    Cv findByUserUrl (String url);
}