
package com.tp2.language;

import java.util.List;
import java.util.Optional;

public interface LanguageService {

    void saveLanguage(LanguageEntity language);

    Optional findLanguageById(int id);

    List<LanguageEntity> findAllLanguages ();
}