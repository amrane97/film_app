
package com.tp2.language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LanguageServiceImpl implements LanguageService {

    @Autowired
    private Languageblabla lb;


    @Override
    public void saveLanguage(LanguageEntity l) {
        lb.save(l);
    }

    @Override
    public Optional findLanguageById(int id) {
        return lb.findById(id);
    }

    @Override
    public List<LanguageEntity> findAllLanguages() {
        return lb.findAll();
    }
}
