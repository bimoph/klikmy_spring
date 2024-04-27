


package klikmy.repo.klikmylink.service;


import klikmy.repo.klikmylink.model.Theme;

import klikmy.repo.klikmylink.repository.ThemeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class ThemeService {

    @Autowired
    private  ThemeRepository themeRepository;

    public Theme addTheme(Theme ca) {
        return themeRepository.save(ca);
    }
}
