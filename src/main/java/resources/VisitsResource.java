package resources;

import resources.pojos.Pet;
import resources.pojos.Visit;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/vets/{vet_id}/pet/{pet_id}/visit")
public class VisitsResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(@PathParam("vet_id") Integer Vid, @PathParam("pet_id") Integer Pid ) {

        List<Visit> visitsList = new ArrayList<Visit>();

        visitsList.add(new Visit(1, "2001-02-25", "vacunacion", "la primera vacuna del gato", 1, 1));
        visitsList.add(new Visit(2, "2020-05-10", "microchip", "le implementaran el microchip al animal", Vid, Pid));
        visitsList.add(new Visit(3, "2021-05-31", "urgencias", "el animal sufrio un grave accidente y es llevado al hopital de inmediato", 2, 2));

        return Response.ok()
                .entity(visitsList)
                .build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(@PathParam("vet_id") Integer Vid, @PathParam("pet_id") Integer Pid , Visit visit) {

          visit.setVet_id(3);
        return Response.status(Response.Status.CREATED)
                .entity(visit)
                .build();
    }
}
