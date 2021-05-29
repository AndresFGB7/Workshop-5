package resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/pet/{name}")


public class PetResource {

        @GET
        @Produces(MediaType.APPLICATION_JSON)
        public Response modify(@PathParam("name") String id, Integer person_id) {
            return Response.ok()
                    .entity(id)
                    .build();
        }
        @DELETE
        public Response delete(@PathParam("name") String id) {

            return Response.noContent()
                    .build();
        }
    }

