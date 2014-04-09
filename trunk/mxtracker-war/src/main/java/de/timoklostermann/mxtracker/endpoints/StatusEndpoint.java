package de.timoklostermann.mxtracker.endpoints;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.Named;
import com.google.api.server.spi.config.Nullable;
import com.google.inject.Inject;

import de.timoklostermann.mxtracker.converter.StatusConverter;
import de.timoklostermann.mxtracker.dao.StatusDAO;
import de.timoklostermann.mxtracker.dto.StatusDTO;
import de.timoklostermann.mxtracker.enums.StatusEnum;

@Api(name = "status", version = "v1")
public class StatusEndpoint {

	@Inject
	private StatusDAO statusDAO;
	
	@Inject
	private StatusConverter statusConverter;
	
	public StatusDTO getStatus() {
		StatusDTO status = new StatusDTO();
		statusConverter.convert(status, statusDAO.getLatestStatus());
		return status;
	}

	public void open(@Nullable @Named("message") String message) {
		statusDAO.open(message);
	}

	public void close(@Nullable @Named("message") String message) {
		statusDAO.close(message);
	}
}
