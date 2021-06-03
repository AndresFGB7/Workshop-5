package resources.pojos;


import java.util.Date;

public class Visit {

    private Integer visit_id;
    private String created_at;
    private String type;
    private String description;
    private Integer vet_id;
    private Integer pet_id;


    public Visit(Integer visit_id, String created_at, String type, String description, Integer vet_id, Integer pet_id) {
        this.visit_id = visit_id;
        this.created_at = created_at;
        this.type = type;
        this.description = description;
        this.vet_id = vet_id;
        this.pet_id = pet_id;
    }

    public Visit() {

    }


    public Integer getVisit_id() {
        return visit_id;
    }

    public void setVisit_id(Integer visit_id) {
        this.visit_id = visit_id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getVet_id() {
        return vet_id;
    }

    public void setVet_id(Integer vet_id) {
        this.vet_id = vet_id;
    }

    public Integer getPet_id() {
        return pet_id;
    }

    public void setPet_id(Integer pet_id) {
        this.pet_id = pet_id;
    }


}
