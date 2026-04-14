package io.cloudbeaver.model.api.annotation.enums;

public enum Explode {
	TRUE("true"),
	FALSE("false"),
	DEFAULT("default");

	private final String value;

	Explode(final String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}
}
