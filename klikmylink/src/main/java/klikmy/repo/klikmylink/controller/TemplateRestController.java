package klikmy.repo.klikmylink.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import klikmy.repo.klikmylink.dto.request.CreateTemplateRequestDTO;
import klikmy.repo.klikmylink.model.Template;
import klikmy.repo.klikmylink.service.TemplateService;

@RestController
@RequestMapping("/api/template")
public class TemplateRestController {
    
    @Autowired
    private TemplateService templateService;

    @PostMapping(value = "")
    public ResponseEntity<Template> addTemplate(@RequestBody CreateTemplateRequestDTO ed) {
        Template newEd = templateService.addTemplate(ed);
        return ResponseEntity.ok(newEd);
    }

    @GetMapping(value = "/all")
    public ResponseEntity<List<Template>> getAllTemplates() {
        List<Template> templates = templateService.getAllTemplates();
        return ResponseEntity.ok(templates);
    }
}
