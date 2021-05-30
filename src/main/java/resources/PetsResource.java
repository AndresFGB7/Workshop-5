package resources;

import resources.pojos.Owner;
import resources.pojos.Pet;
import resources.pojos.Vet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("pet/{pet_id}")

public class PetsResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(@PathParam("pet_id") Integer pet_id ) {

        List<Pet> petList = new ArrayList<Pet>();

        petList.add(new Pet(1, "123ABC" , "Felix", "Gato", "angola", "PEQUEÑO", "MACHO", "" , 1524));
        petList.add(new Pet(2, "12344ABC" , "Bebe", "Perro", "Criollo", "GRANDE", "MACHO", "" , 1524));
        petList.add(new Pet(3, "123ABVVC" , "Doky", "Loro", "Loro", "PEQUEÑO", "HEMBRA", "" , 1524));

        return Response.ok()
                .entity(petList)
                .build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(@PathParam("pet_id") Integer pet_id , Pet pet) {


        return Response.status(Response.Status.CREATED)
                .entity(pet)
                .build();
    }


}
