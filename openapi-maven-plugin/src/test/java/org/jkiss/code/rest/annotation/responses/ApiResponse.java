package org.jkiss.code.rest.annotation.responses;

import org.jkiss.code.rest.annotation.media.Content;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.ANNOTATION_TYPE })
public @interface ApiResponse {

	String responseCode() default "default";

	String description() default "";

	Content[] content() default {};
}
