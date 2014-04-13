package de.timoklostermann.mxtracker.endpoints;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.Named;
import com.google.api.server.spi.config.Nullable;
import com.google.api.server.spi.response.UnauthorizedException;
import com.google.appengine.api.users.User;
import com.google.inject.Inject;

import de.timoklostermann.mxtracker.configuration.Constants;
import de.timoklostermann.mxtracker.converter.StatusConverter;
import de.timoklostermann.mxtracker.dao.StatusDAO;
import de.timoklostermann.mxtracker.dto.StatusDTO;

@Api(
	name = "mxtracker",
	version = "v1",
	scopes = {Constants.EMAIL_SCOPE},
	clientIds = {Constants.ANDROID_CLIENT_ID, Constants.API_EXPLORER_CLIENT_ID},
	audiences = {Constants.ANDROID_AUDIENCE}
)
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

	@ApiMethod(name = "status.open", path="status/open")
	public void open(@Nullable @Named("message") String message, User user) throws UnauthorizedException {
		if (user == null) {
			// code 401
			throw new UnauthorizedException("Authorization required");
		}
		
		statusDAO.open(message);
	}

	@ApiMethod(name = "status.close", path="status/close")
	public void close(@Nullable @Named("message") String message, User user) throws UnauthorizedException {
		if (user == null) {
			// code 401
			throw new UnauthorizedException("Authorization required");
		}
		
		statusDAO.close(message);
	}
}
