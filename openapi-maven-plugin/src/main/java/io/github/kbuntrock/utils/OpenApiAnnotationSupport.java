package io.github.kbuntrock.utils;

import io.github.kbuntrock.reflection.annotation.MergedAnnotation;
import io.github.kbuntrock.reflection.annotation.MergedAnnotations;

public final class OpenApiAnnotationSupport {

	private static final String OPERATION = "io.cloudbeaver.model.api.annotation.Operation";
	private static final String PARAMETER = "io.cloudbeaver.model.api.annotation.Parameter";
	private static final String PARAMETERS = "io.cloudbeaver.model.api.annotation.Parameters";
	private static final String SCHEMA = "io.cloudbeaver.model.api.annotation.media.Schema";
	private static final String TAG = "io.cloudbeaver.model.api.annotation.tags.Tag";

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
