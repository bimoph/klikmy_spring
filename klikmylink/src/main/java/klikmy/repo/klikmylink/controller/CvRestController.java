package klikmy.repo.klikmylink.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import klikmy.repo.klikmylink.dto.request.CreateCvRequestDTO;
import klikmy.repo.klikmylink.model.Cv;
import klikmy.repo.klikmylink.service.CvService;

@RestController
@RequestMapping("/api/cv")
public class CvRestController {

    @Autowired
    private CvService cvService;

    @PostMapping(value = "")
    public ResponseEntity<Cv> addCv(@RequestBody CreateCvRequestDTO dto) {
        Cv newCv = cvService.addCv(dto);
        return ResponseEntity.ok(newCv);
    }
}
