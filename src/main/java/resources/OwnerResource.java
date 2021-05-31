package resources;

import resources.pojos.Owner;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/User/{username}/Owner/{person_id}")

public class OwnerResource {
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("username") String Username,  @PathParam("person_id") Integer id, Owner owner) {
        return Response.ok()
                .entity(owner)
                .build();
    }
    @DELETE
    public Response delete( @PathParam("person_id") Integer id) {

        return Response.noContent()
                .build();
    }
}
