package klikmy.repo.klikmylink.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;
import klikmy.repo.klikmylink.model.Education;

@Repository
@Transactional
public interface EducationRepository  extends JpaRepository<Education, Long>  {
    
}
