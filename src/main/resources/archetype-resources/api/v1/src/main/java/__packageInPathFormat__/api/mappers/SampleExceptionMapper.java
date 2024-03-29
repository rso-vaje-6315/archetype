package ${package}.api.mappers;

import ${package}.lib.exceptions.SampleException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class SampleExceptionMapper implements ExceptionMapper<SampleException> {

    @Override
    public Response toResponse(SampleException exception) {
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(exception.getMessage()).build();
    }

}