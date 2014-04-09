package de.timoklostermann.mxtracker.enums;

public enum StatusEnum {

	OPEN("open"),
	CLOSED("closed");
	
	private String name;
	
	private StatusEnum(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}
