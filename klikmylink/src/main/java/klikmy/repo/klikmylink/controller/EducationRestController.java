package klikmy.repo.klikmylink.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import klikmy.repo.klikmylink.model.Cv;
import klikmy.repo.klikmylink.model.Education;
import klikmy.repo.klikmylink.service.CvService;
import klikmy.repo.klikmylink.service.EducationService;

@RestController
@RequestMapping("/api/education")
public class EducationRestController {

    @Autowired
    private EducationService educationService;

    @PostMapping(value = "")
    public ResponseEntity<Education> addEducation(@RequestBody Education ed) {
        Education newEd = educationService.addEducation(ed);
        return ResponseEntity.ok(newEd);
    }
}
