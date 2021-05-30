package resources;

import resources.pojos.UserApp;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/User/{username}")
public class UserAppResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("username") String id, UserApp usersapp) {
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
