package klikmy.repo.klikmylink.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import klikmy.repo.klikmylink.dto.request.CreateCvRequestDTO;
import klikmy.repo.klikmylink.model.Cv;
import klikmy.repo.klikmylink.model.Template;
import klikmy.repo.klikmylink.repository.CvRepository;
import klikmy.repo.klikmylink.repository.TemplateRepository;
import jakarta.transaction.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service
@Transactional
public class CvService {

    @Autowired
    private CvRepository cvRepository;
    @Autowired
    private TemplateRepository templateRepository; 

    public Cv addCv(CreateCvRequestDTO dto) {
        Cv newCv = new Cv();
        newCv.setFirstName(dto.getFirstName());
        newCv.setLastName(dto.getLastName());
        newCv.setPhotoProfile(dto.getPhotoProfile());
        newCv.setSummary(dto.getSummary());
        newCv.setTitle(dto.getTitle());
        newCv.setUserUrl(dto.getUserUrl());
        newCv.setEmail(dto.getEmail());
        newCv.setPhoneNumber(dto.getPhoneNumber());
        newCv.setLinkedinLink(dto.getLinkedinLink());
        newCv.setInstagramLink(dto.getInstagramLink());
        newCv.setGithubLink(dto.getGithubLink());

        List<Template> listTemplate = new ArrayList<>();
        for (Long idTemplate : dto.getIdTemplate()) {
            listTemplate.add(templateRepository.findById(idTemplate).orElseThrow());
        }
        newCv.setTemplates(listTemplate);
        newCv.setExperiences(dto.getExperiences());
        newCv.setEducations(dto.getEducations());
        newCv.setSkills(dto.getSkills());
        newCv.setCertificates(dto.getCertificates());
        newCv.setProjects(dto.getProjects());
        return cvRepository.save(newCv);
    }
}
