
package klikmy.repo.klikmylink.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import klikmy.repo.klikmylink.model.Theme;

import klikmy.repo.klikmylink.service.ThemeService;

@RestController
@RequestMapping("/api/theme")
public class ThemeRestController {
    
    @Autowired
    private ThemeService themeService;

    @PostMapping(value = "")
    public ResponseEntity<Theme> addTheme(@RequestBody Theme ed) {
        Theme newEd = themeService.addTheme(ed);
        return ResponseEntity.ok(newEd);
    }
}
