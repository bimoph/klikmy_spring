package klikmy.repo.klikmylink.service;

import klikmy.repo.klikmylink.dto.request.CreateTemplateRequestDTO;
import klikmy.repo.klikmylink.model.Template;
import klikmy.repo.klikmylink.repository.CategoryRepository;
import klikmy.repo.klikmylink.repository.TemplateRepository;
import klikmy.repo.klikmylink.repository.ThemeRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class TemplateService {

    @Autowired
    private  TemplateRepository templateRepository;

    @Autowired
    private ThemeRepository themeRepository;

    @Autowired 
    private CategoryRepository categoryRepository;

    public Template addTemplate(CreateTemplateRequestDTO ca) {
        Template newTemplate = new Template();
        newTemplate.setName(ca.getName());
        newTemplate.setContributor(ca.getContributor());
        newTemplate.setPrice(ca.getPrice());

        newTemplate.setCategory(categoryRepository.findById(ca.getIdCategory()).orElseThrow());

        newTemplate.setTheme(themeRepository.findById(ca.getIdTheme()).orElseThrow());

        return templateRepository.save(newTemplate);
    }

    public List<Template> getAllTemplates() {
        return templateRepository.findAll();
    }
}
