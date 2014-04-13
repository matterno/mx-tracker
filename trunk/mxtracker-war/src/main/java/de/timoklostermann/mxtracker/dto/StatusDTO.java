package de.timoklostermann.mxtracker.dto;

import java.util.Date;

import de.timoklostermann.mxtracker.enums.StatusEnum;

public class StatusDTO {

	private StatusEnum status;
	private String message;
	private Date created;
	
	public StatusDTO() {};
	
	public StatusDTO(StatusEnum status, String message, Date created) {
		this.message = message;
		this.status = status;
		this.created = created;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
	
}
