package resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/authors/{username}")

public class OwnerResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("username") String id, Integer person_id) {
        return Response.ok()
                .entity(id)
                .build();
    }
    @DELETE
    public Response delete(@PathParam("username") String id) {

        return Response.noContent()
                .build();
    }
}
