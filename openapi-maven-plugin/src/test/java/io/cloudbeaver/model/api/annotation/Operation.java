package io.cloudbeaver.model.api.annotation;

import io.cloudbeaver.model.api.annotation.responses.ApiResponse;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Operation {

	String summary() default "";

	String description() default "";

	String operationId() default "";

	String method() default "";

	Parameter[] parameters() default {};

	ApiResponse[] responses() default {};
}
