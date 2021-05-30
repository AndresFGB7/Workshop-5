package resources;


import resources.pojos.Vet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/User/{username}/vets/{username}")

public class VetResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("username") String Username, @PathParam("username") String Username2, Vet vet) {
        return Response.ok()
                .entity(vet)
                .build();
    }
    @DELETE
    public Response delete(@PathParam("username") String Username, @PathParam("username") String Username2) {

        return Response.noContent()
                .build();
    }
}



