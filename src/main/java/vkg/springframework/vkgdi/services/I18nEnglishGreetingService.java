package vkg.springframework.vkgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import vkg.springframework.vkgdi.repositories.EnglishGreetingRepository;

@Profile({"EN", "default"})
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService {

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return englishGreetingRepository.getGreeting();
    }
}
