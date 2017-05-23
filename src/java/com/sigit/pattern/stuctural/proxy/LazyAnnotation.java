package com.sigit.pattern.stuctural.proxy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/22/2017.
 *         Copyright 2017
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface LazyAnnotation {
}
