package de.timoklostermann.mxtracker.entity;

import com.googlecode.objectify.annotation.Cache;
import com.googlecode.objectify.annotation.EntitySubclass;
import com.googlecode.objectify.annotation.Unindex;

import de.timoklostermann.mxtracker.enums.StatusEnum;

@EntitySubclass(index=true)
@Cache
public class Status extends Message {

	@Unindex StatusEnum status;

	public Status() {};
	
	public Status(StatusEnum status, String message) {
		this.message = message;
		this.status = status;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}
}
