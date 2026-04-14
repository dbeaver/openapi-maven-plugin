package io.cloudbeaver.model.api.annotation.enums;

public enum ParameterIn {
	DEFAULT("default"),
	QUERY("query"),
	HEADER("header"),
	PATH("path"),
	COOKIE("cookie");

	private final String value;

	ParameterIn(final String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}
}
