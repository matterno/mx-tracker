package de.timoklostermann.mxtracker.converter;

import de.timoklostermann.mxtracker.dto.StatusDTO;
import de.timoklostermann.mxtracker.entity.Status;

public class StatusConverter {

	public void convert(StatusDTO target, Status source) {
		target.setCreated(source.getCreated());
		target.setMessage(source.getMessage());
		target.setStatus(source.getStatus());
	}
	
}
