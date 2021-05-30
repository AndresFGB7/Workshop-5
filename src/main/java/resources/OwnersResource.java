package resources;

import resources.pojos.Owner;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/User/{username}/Owner")
public class OwnersResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(@PathParam("username") String Username) {

        List<Owner> owners = new ArrayList<Owner>();

        owners.add(new Owner(Username, 1, "cristian", "cdsanchezm@unbosque.edu.co", "barrio los andes"));
        owners.add(new Owner(Username, 2, "andres", "pongan aca sus correos vagos", "suba"));
        owners.add(new Owner(Username, 3, "esteban c", "pongan aca sus correos vagos", "kenedy"));
        owners.add(new Owner(Username, 4, "pau", "pongan aca sus correos vagos", "creo que es cerca de la u"));
        owners.add(new Owner(Username, 5, "esteban u", "pongan aca sus correos vagos", "no se XD"));

        return Response.ok()
                .entity(owners)
                .build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(@PathParam("username") String Username, Owner owner) {

            owner.setPerson_id(6);

        return Response.status(Response.Status.CREATED)
                .entity(owner)
                .build();
    }
}
