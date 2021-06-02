package resources;

import resources.pojos.ComparatorLocation;
import resources.pojos.Owner;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.*;

@Path("Owner")
public class OwnersResource {
    @GET
    @Path("/User/{username}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(@PathParam("username") String Username) {
        List<Owner> owners = new ArrayList<Owner>();
        owners.add(new Owner(Username, 1, "cristian", "cdsanchezm@unbosque.edu.co", "a"));
        owners.add(new Owner(Username, 2, "andres", "pongan aca sus correos vagos", "b"));
        owners.add(new Owner(Username, 3, "esteban c", "pongan aca sus correos vagos", "k"));
        owners.add(new Owner(Username, 4, "pau", "pongan aca sus correos vagos", "c"));
        owners.add(new Owner(Username, 5, "esteban u", "pongan aca sus correos vagos", "l"));
        return Response.ok()
                .entity(owners)
                .build();
    }
    @GET
    @Path("/Location/User/{username}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listz(@PathParam("username") String Username) {
        List<Owner> owners = new ArrayList<Owner>();
        owners.add(new Owner(Username, 1, "cristian", "cdsanchezm@unbosque.edu.co", "a"));
        owners.add(new Owner(Username, 2, "andres", "pongan aca sus correos vagos", "b"));
        owners.add(new Owner(Username, 3, "esteban c", "pongan aca sus correos vagos", "k"));
        owners.add(new Owner(Username, 4, "pau", "pongan aca sus correos vagos", "c"));
        owners.add(new Owner(Username, 5, "esteban u", "pongan aca sus correos vagos", "l"));
        Collections.sort(owners,new ComparatorLocation());
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
