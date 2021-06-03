package resources;

import resources.pojos.Owner;
import resources.pojos.Pet;
import resources.pojos.Vet;
import resources.pojos.Visit;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("Owner/")

public class PetsResource {
    List<Pet> petList = new ArrayList<Pet>();
    List<Visit> visitsList = new ArrayList<Visit>();
    public void data(){
        petList.add(new Pet(1, "1526HA" , "Felix", "Gato", "angola", "PEQUEÑO", "MACHO", "" , 1));
        petList.add(new Pet(2, null , "Bellota", "Perro", "Criollo", "GRANDE", "HEMBRA", "" , 1));
        petList.add(new Pet(3, "091MAL" , "Alex", "Loro", "tricahues", "MEDIANO", "MACHO", "" , 2));
        petList.add(new Pet(4, "001POA" , "Doky", "Tortuga", "Mediterránea", "MEDIANO", "HEMBRA", "" , 2));
        petList.add(new Pet(5, null , "Tobby", "Gato", "angola", "GRANDE", "MACHO", "" , 3));
        petList.add(new Pet(6, null , "Luna", "Perro", "Criollo", "PEQUEÑO", "HEMBRA", "" , 3));
        petList.add(new Pet(7, null , "Motas", "Loro", "tricahues", "GRANDE", "MACHO", "" , 4));
        petList.add(new Pet(8, "728SSA" , "Princesa", "Tortuga", "Mediterránea", "MEDIANO", "HEMBRA", "" ,4));
        petList.add(new Pet(9, "098KPA" , "Baster", "Gato", "angola", "MEDIANO", "MACHO", "" ,5));
        petList.add(new Pet(10, "876GAN" , "Lupe", "Perro", "Criollo", "GRANDE", "HEMBRA", "" ,5));
        petList.add(new Pet(11, "098GJA" , "Tony", "Loro", "tricahues", "PEQUEÑO", "MACHO", "" ,6));
        petList.add(new Pet(12, null , "Lola", "Tortuga", "Mediterránea", "GRANDE", "HEMBRA", "" ,6));
    }
    public void dataVisit(){
        visitsList.add(new Visit(1, "2001-02-25", "vacunacion", "la primera vacuna del gato", 1, 2));
        visitsList.add(new Visit(2, "2020-06-10", "microchip", "le implementaran el microchip al animal", 3, 1));
        visitsList.add(new Visit(3, "2021-05-31", "microchip", "le implementaran el microchip al animal", 2, 3));
        visitsList.add(new Visit(4, "2021-08-15", "microchip", "le implementaran el microchip al animal", 2, 4));
        visitsList.add(new Visit(5, "2021-09-01", "esterilización", "el animal sufrio se esterilizo", 2, 5));
        visitsList.add(new Visit(6, "2021-03-28", "esterilización", "el animal sufrio se esterilizo", 2, 6));
        visitsList.add(new Visit(7, "2021-03-28", "esterilización", "el animal sufrio se esterilizo", 2, 7));
        visitsList.add(new Visit(8, "2021-03-28", "microchip", "le implementaran el microchip al animal", 2, 8));
        visitsList.add(new Visit(9, "2021-03-28", "microchip", "le implementaran el microchip al animal", 2, 9));
        visitsList.add(new Visit(10, "2021-03-28", "microchip", "le implementaran el microchip al animal", 2, 10));
        visitsList.add(new Visit(11, "2021-03-28", "microchip", "le implementaran el microchip al animal", 2, 11));
        visitsList.add(new Visit(12, "2021-03-28", "esterilización", "el animal sufrio se esterilizo", 2, 12));
    }

    @POST
    @Path("{owner_id}/pet")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(@PathParam("owner_id") Integer id , Pet pet) {

        return Response.status(Response.Status.CREATED)
                .entity(pet)
                .build();
    }

    @GET
    @Path("/pet")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listAll() {
        data();
        return Response.ok()
                .entity(petList)
                .build();
    }

    @GET
    @Path("{owner_id}/pet")
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(@PathParam("owner_id") Integer id ) {
        data();
        List<Pet> petList2 = new ArrayList<Pet>();
        for (Pet pet : petList){
            if(pet.getOwner_id().equals(id)){
                petList2.add(pet);
            }
        }
        return Response.ok()
                .entity(petList2)
                .build();
    }

    @GET
    @Path("pet/species/{specie}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listSpecies(@PathParam("specie") String specie ) {
        data();
        List<Pet> petList2 = new ArrayList<Pet>();
        for (Pet pet : petList){
            if(pet.getSpecies().equals(specie)){
                petList2.add(pet);
            }
        }
        return Response.ok()
                .entity(petList2)
                .build();
    }

    @GET
    @Path("pet/race/{race}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listRace(@PathParam("race") String race ) {
        data();
        List<Pet> petList2 = new ArrayList<Pet>();
        for (Pet pet : petList){
            if(pet.getRace().equals(race)){
                petList2.add(pet);
            }
        }
        return Response.ok()
                .entity(petList2)
                .build();
    }

    @GET
    @Path("pet/size/{size}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listSize(@PathParam("size") String size ) {
        data();
        List<Pet> petList2 = new ArrayList<Pet>();
        for (Pet pet : petList){
            if(pet.getSize().equals(size)){
                petList2.add(pet);
            }
        }
        return Response.ok()
                .entity(petList2)
                .build();
    }

    @GET
    @Path("pet/sex/{sex}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listSex(@PathParam("sex") String sex ) {
        data();
        List<Pet> petList2 = new ArrayList<Pet>();
        for (Pet pet : petList){
            if(pet.getSex().equals(sex)){
                petList2.add(pet);
            }
        }
        return Response.ok()
                .entity(petList2)
                .build();
    }

    @GET
    @Path("pet/microchip/{microchip}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listMicrochip(@PathParam("microchip") Boolean microchip ) {
        data();
        dataVisit();
        List<Pet> petList2 = new ArrayList<Pet>();
        for (Pet pet : petList){
            for ( Visit visit : visitsList){
                if(microchip == true) {
                    if(visit.getType().equals("microchip")){
                        if(pet.getPet_id().equals(visit.getPet_id())){
                            petList2.add(pet);
                        }
                    }
                }
                if(microchip == false) {
                    if(!visit.getType().equals("microchip")){
                        if(pet.getPet_id().equals(visit.getPet_id())){
                            petList2.add(pet);
                        }
                    }
                }
            }
        }
        return Response.ok()
                .entity(petList2)
                .build();
    }

    @GET
    @Path("pet/esterilizacion/{esterilizacion}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listEsterilizacion(@PathParam("esterilizacion") Boolean esterilizacion ) {
        data();
        dataVisit();
        List<Pet> petList2 = new ArrayList<Pet>();
        for (Pet pet : petList){
            for ( Visit visit : visitsList){
                if(esterilizacion == true) {
                    if(visit.getType().equals("esterilización")){
                        if(pet.getPet_id().equals(visit.getPet_id())){
                            petList2.add(pet);
                        }
                    }
                }
                if(esterilizacion == false) {
                    if(!visit.getType().equals("esterilización")){
                        if(pet.getPet_id().equals(visit.getPet_id())){
                            petList2.add(pet);
                        }
                    }
                }

            }
        }
        return Response.ok()
                .entity(petList2)
                .build();
    }



}
