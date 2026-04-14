package io.github.kbuntrock.utils;

import io.github.kbuntrock.reflection.annotation.MergedAnnotation;
import io.github.kbuntrock.reflection.annotation.MergedAnnotations;

public final class OpenApiAnnotationSupport {

	private static final String OPERATION = "org.jkiss.code.rest.annotation.Operation";
	private static final String PARAMETER = "org.jkiss.code.rest.annotation.Parameter";
	private static final String PARAMETERS = "org.jkiss.code.rest.annotation.Parameters";
	private static final String SCHEMA = "org.jkiss.code.rest.annotation.media.Schema";
	private static final String TAG = "org.jkiss.code.rest.annotation.tags.Tag";

	private OpenApiAnnotationSupport() {
	}

	public static MergedAnnotation getOperation(final MergedAnnotations mergedAnnotations) {
		return mergedAnnotations.get(OPERATION);
	}

	public static MergedAnnotation getParameter(final MergedAnnotations mergedAnnotations) {
		return mergedAnnotations.get(PARAMETER);
	}

	public static MergedAnnotation getParameters(final MergedAnnotations mergedAnnotations) {
		return mergedAnnotations.get(PARAMETERS);
	}

	public static MergedAnnotation getSchema(final MergedAnnotations mergedAnnotations) {
		return mergedAnnotations.get(SCHEMA);
	}

	public static MergedAnnotation getTag(final MergedAnnotations mergedAnnotations) {
		return mergedAnnotations.get(TAG);
	}
}
