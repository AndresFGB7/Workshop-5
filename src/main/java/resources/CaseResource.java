package resources;

import resources.pojos.Case;
import resources.pojos.Vet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/pet/{pet_id}/cases/{case_id}")
public class CaseResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("pet_id") Integer Petid, @PathParam("case_id") Integer Caseid, Case cas) {
        return Response.ok()
                .entity(cas)
                .build();
    }
    @DELETE
    public Response delete(@PathParam("pet_id") Integer Petid, @PathParam("case_id") Integer Caseid) {

        return Response.noContent()
                .build();
    }
}
