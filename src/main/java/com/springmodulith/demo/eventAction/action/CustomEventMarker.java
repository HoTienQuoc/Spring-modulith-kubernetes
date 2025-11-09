package com.springmodulith.demo.eventAction.action;

import java.lang.annotation.*;

/**
 * @author : Ezekiel Eromosei
 * @code @created : 31 May, 2024
 */

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomEventMarker {

    Action eventAction();
}
