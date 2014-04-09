package de.timoklostermann.mxtracker.dto;

import de.timoklostermann.mxtracker.enums.StatusEnum;

public class StatusDTO extends MessageDTO {

	private StatusEnum status;
	
	public StatusDTO() {};
	
	public StatusDTO(StatusEnum status, String message) {
		super(message);
		this.status = status;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}
	
}
