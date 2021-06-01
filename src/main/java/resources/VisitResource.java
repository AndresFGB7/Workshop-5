package resources;

import resources.pojos.Vet;
import resources.pojos.Visit;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/vets/{vet_id}/pet/{pet_id}/visit/{visit_id}")

public class VisitResource {

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("visit_id") Integer visitid,  Visit vist) {
        return Response.ok()
                .entity(vist)
                .build();
    }
    @DELETE
    public Response delete(@PathParam("visit_id") Integer visitid) {

        return Response.noContent()
                .build();
    }
}
