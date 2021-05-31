package resources;

import resources.pojos.Pet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("Owner/{owner_id}/pet/{pet_id}")


public class PetResource {

        @PUT
        @Produces(MediaType.APPLICATION_JSON)
        public Response modify(@PathParam("owner_id") Integer id ,@PathParam("pet_id") Integer petid, Pet pet) {
            return Response.ok()
                    .entity(pet)
                    .build();
        }
        @DELETE
        public Response delete(@PathParam("owner_id") Integer id, @PathParam("pet_id") Integer petid) {

            return Response.noContent()
                    .build();
        }
    }

