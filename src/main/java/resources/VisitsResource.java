package resources;

import resources.pojos.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("visit")
public class VisitsResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {

        List<Visit> visitsList = new ArrayList<Visit>();

        visitsList.add(new Visit(1, "2001-02-25", "vacunacion", "la primera vacuna del gato", 1, 1));
        visitsList.add(new Visit(2, "2020-05-10", "microchip", "le implementaran el microchip al animal", 3, 3));
        visitsList.add(new Visit(3, "2021-05-31", "urgencias", "el animal sufrio un grave accidente y es llevado al hopital de inmediato", 2, 2));

        return Response.ok()
                .entity(visitsList)
                .build();
    }

    @GET
    @Path("/visit")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listTotalVisits () {

        List<VisitType> visitsByType = new ArrayList<>();


        visitsByType.add(new VisitType(20,"Implantacion"));
        visitsByType.add(new VisitType(10 , "Desparasitación"));
        visitsByType.add(new VisitType(18 , "Control"));
        visitsByType.add(new VisitType(8 , "Vacunación"));
        visitsByType.add(new VisitType(1 , "Implantación de microchip"));
        visitsByType.add(new VisitType(12 , "Urgencia"));

        List<VisitByVet> visitsByVet = new ArrayList<>();

        visitsByVet.add(new VisitByVet("Vet.Andres" , 3));
        visitsByVet.add(new VisitByVet("Vet.Paula" , 12));
        visitsByVet.add(new VisitByVet("Vet.Esteban" , 11));
        visitsByVet.add(new VisitByVet("Vet.Cristian" , 20));

        TotalVisits totalVisits = new TotalVisits(visitsByType, visitsByVet ,115);

        return Response.ok()
                .entity(totalVisits)
                .build();
    }


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create( Visit visit) {

          visit.setVet_id(3);
        return Response.status(Response.Status.CREATED)
                .entity(visit)
                .build();
    }
}
