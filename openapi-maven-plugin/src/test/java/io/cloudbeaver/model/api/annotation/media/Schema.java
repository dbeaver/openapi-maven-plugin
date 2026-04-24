package io.cloudbeaver.model.api.annotation.media;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE })
public @interface Schema {

	String description() default "";

	String example() default "";

	String type() default "";

	Class<?> implementation() default Void.class;

	boolean required() default false;
}
