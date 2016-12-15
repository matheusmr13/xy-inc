package br.com.cyop.exception;

import javax.ws.rs.core.Response;

public class InvalidFieldTypeExceptionMapper implements javax.ws.rs.ext.ExceptionMapper<NotFoundException> {

	@Override
	public Response toResponse(NotFoundException exception) {
		exception.printStackTrace();
		return Response.status(Response.Status.FORBIDDEN).build();
	}

}