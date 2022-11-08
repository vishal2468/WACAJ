package com.vishal.wacaj.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.security.core.annotation.AuthenticationPrincipal;

@Target({ElementType.PARAMETER})// target tells where the @LoggedInUser annotation can be used
@Retention(RetentionPolicy.RUNTIME) // when will the anotation will be around here during while running of the code
@AuthenticationPrincipal //used to resolve Authentication.getPrincipal() to a method argument.
public @interface LoggedInUser {
    
}
