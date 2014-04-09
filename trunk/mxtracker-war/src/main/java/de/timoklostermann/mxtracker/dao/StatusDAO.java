package de.timoklostermann.mxtracker.dao;

import static de.timoklostermann.mxtracker.configuration.OfyService.ofy;

import de.timoklostermann.mxtracker.entity.Status;
import de.timoklostermann.mxtracker.enums.StatusEnum;

public class StatusDAO {

	public Status getLatestStatus() {
		Status status = ofy().load().type(Status.class).order("-created").first().now();
		return status;
	}
	
	public void open(String message) {
		Status status = new Status(StatusEnum.OPEN, message);
		ofy().save().entity(status);
	}
	
	public void close(String message) {
		Status status = new Status(StatusEnum.CLOSED, message);
		ofy().save().entity(status);
	}
	
}
