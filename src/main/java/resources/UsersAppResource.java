package resources;

import resources.pojos.Owner;
import resources.pojos.UserApp;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/User")
public class UsersAppResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {

        List<UserApp> usersapp = new ArrayList<UserApp>();

        usersapp.add(new UserApp("cdsanchezm", "Cristian123", "cdsanchezm@unbosque.edu.co", "vet"));
        usersapp.add(new UserApp("agalvezb", "Andres123", "escriba sus correos vagos", "Owner"));
        usersapp.add(new UserApp("lcardenasc", "Estebanc123", "escriba sus correos vagos", "Owner"));
        usersapp.add(new UserApp("panayar", "Pau123", "escriba sus correos vagos", "official"));
        usersapp.add(new UserApp("euribec", "Estebanu123", "escriba sus correos vagos", "vet"));

        return Response.ok()
                .entity(usersapp)
                .build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(Owner owner) {

        owner.setUsername("JUANES");

        return Response.status(Response.Status.CREATED)
                .entity(owner)
                .build();
    }
}
