package org.jkiss.code.rest.annotation;

import org.jkiss.code.rest.annotation.enums.Explode;
import org.jkiss.code.rest.annotation.enums.ParameterIn;
import org.jkiss.code.rest.annotation.enums.ParameterStyle;
import org.jkiss.code.rest.annotation.media.ArraySchema;
import org.jkiss.code.rest.annotation.media.Schema;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Repeatable(Parameters.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.PARAMETER, ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE })
public @interface Parameter {

	String name() default "";

	String description() default "";

	boolean required() default false;

	String example() default "";

	ParameterIn in() default ParameterIn.DEFAULT;

	Schema schema() default @Schema;

	ArraySchema array() default @ArraySchema;

	ParameterStyle style() default ParameterStyle.DEFAULT;

	Explode explode() default Explode.DEFAULT;

	boolean hidden() default false;
}
