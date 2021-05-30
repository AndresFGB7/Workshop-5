package resources;

import resources.pojos.Pet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/Owner/{person_id}/pet/{pet_id}")


public class PetResource {

        @GET
        @Produces(MediaType.APPLICATION_JSON)
        public Response modify(@PathParam("person_id") Integer id, @PathParam("pet_id") Integer Petid, Pet pet) {
            return Response.ok()
                    .entity(pet)
                    .build();
        }
        @DELETE
        public Response delete(@PathParam("person_id") Integer id, @PathParam("pet_id") Integer Petid) {

            return Response.noContent()
                    .build();
        }
    }

