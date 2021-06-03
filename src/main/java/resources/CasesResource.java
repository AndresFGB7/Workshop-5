package resources;

import resources.pojos.Case;
import resources.pojos.CaseType;
import resources.pojos.TotalCases;
import resources.pojos.Vet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Path("cases")
public class CasesResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {

        List<Case> cases = new ArrayList<Case>();
        cases.add(new Case(1, "2021-05-31", "robo", "me robaron mi perro", 1));


        return Response.ok()
                .entity(cases)
                .build();
    }


    @GET
    @Path("/cases")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listCasesByType() {

        List<CaseType> casesByType = new ArrayList<CaseType>();

        casesByType.add(new CaseType("Perdida", 30));
        casesByType.add(new CaseType("robo ", 12));
        casesByType.add(new CaseType("fallecimiento", 40));

        TotalCases totalCasesByType = new TotalCases( casesByType , 82);

        return Response.ok()
                .entity(totalCasesByType)
                .build();
    }


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(Case cases) {

        cases.setCase_id(2);
        return Response.status(Response.Status.CREATED)
                .entity(cases)
                .build();
    }
}
