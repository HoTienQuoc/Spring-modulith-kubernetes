package com.springmodulith.demo.eventAction;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springmodulith.demo.eventAction.action.Action;

import java.util.Optional;


@Repository
public interface EventActionRepository extends CrudRepository<EventAction, Long> {
    Optional<EventAction> getEventActionByAction(Action action);
}
