package com.springmodulith.demo.eventAction;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.modulith.test.ApplicationModuleTest;

import com.springmodulith.demo.eventAction.action.Action;
import com.springmodulith.demo.eventAction.action.RepublishUncompletedEvent;

@ApplicationModuleTest
class EventActionIntegrationTest {

    @Autowired
    RepublishUncompletedEvent republishUncompletedEvent;

    @Test
    void verifyModule() {

    }

    @Test
    void testUncompletedEvent() {

        republishUncompletedEvent.republish(Action.PAYMENT);
    }
}