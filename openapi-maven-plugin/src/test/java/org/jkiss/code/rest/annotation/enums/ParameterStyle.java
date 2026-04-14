package org.jkiss.code.rest.annotation.enums;

public enum ParameterStyle {
	MATRIX("matrix"),
	LABEL("label"),
	FORM("form"),
	SIMPLE("simple"),
	SPACEDELIMITED("spaceDelimited"),
	PIPEDELIMITED("pipeDelimited"),
	DEEPOBJECT("deepObject"),
	DEFAULT("default");

	private final String value;

	ParameterStyle(final String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}
}
