package resources;

import resources.pojos.Vet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/Owner")
public class VetsResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {

        List<Vet> vet = new ArrayList<Vet>();

        return Response.ok()
                .entity(vet)
                .build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(Vet vet) {


        return Response.status(Response.Status.CREATED)
                .entity(vet)
                .build();
    }
}


