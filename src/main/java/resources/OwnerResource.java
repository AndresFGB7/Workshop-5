package resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/authors/{id}")

public class OwnerResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("id") Integer id, String userName) {

        return Response.ok()
                .entity(userName)
                .build();
    }

}
