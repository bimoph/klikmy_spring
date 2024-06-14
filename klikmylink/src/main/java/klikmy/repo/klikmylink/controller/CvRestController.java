package klikmy.repo.klikmylink.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    @PostMapping("/url/{userUrl}")
    public ResponseEntity<String> checkUrlUser(@PathVariable String userUrl) {
        boolean exists = cvService.checkUrl(userUrl);
        if (exists) {
            return ResponseEntity.ok("URL is available");
        } else {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("URL already exists");
        }
    }

    @GetMapping("/url/{userUrl}")
    public ResponseEntity<?> getCvByUserUrl(@PathVariable String userUrl) {
        Cv cv = cvService.getCvByUserUrl(userUrl);
        if (cv != null) {
            return ResponseEntity.ok(cv);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No CV found with the provided URL");
        }
    }

}
