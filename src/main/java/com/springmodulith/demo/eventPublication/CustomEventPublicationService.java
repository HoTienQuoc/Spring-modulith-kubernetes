package com.springmodulith.demo.eventPublication;

import java.util.List;


public interface CustomEventPublicationService {

    List<CustomEventPublication> getUncompletedEventPublications();
    List<CustomEventPublication> getCompletedEventPublications();
}
