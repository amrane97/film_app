
package com.tp2.language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class LanguageController {

    @Autowired
    private LanguageServiceImpl languageService;

    @GetMapping("/findLang/{id}")
    public Optional<LanguageEntity> findById(@PathVariable int id) {
        return languageService.findLanguageById(id);
    }

    @PostMapping("/saveLang")
    public void save(@RequestBody LanguageEntity l) {
        languageService.saveLanguage(l);
    }

    @GetMapping("/findAllLang")
    public List<LanguageEntity> findAll() {
        return languageService.findAllLanguages();
    }
}
