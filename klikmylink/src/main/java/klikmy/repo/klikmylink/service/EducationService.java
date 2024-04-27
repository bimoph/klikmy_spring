package klikmy.repo.klikmylink.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import klikmy.repo.klikmylink.model.Education;
import klikmy.repo.klikmylink.repository.EducationRepository;

@Service
@Transactional
public class EducationService {
    @Autowired
    private EducationRepository educationRepository;

    public Education addEducation (Education education){
       return educationRepository.save(education);
    }

}
