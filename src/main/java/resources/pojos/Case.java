package resources.pojos;

import java.util.Date;

public class Case {

    private int case_id;
    private Date Created_at;
    private String type;
    private String description;
    private int pet_id;

    public Case(int case_id, Date created_at, String type, String description, int pet_id) {
        this.case_id = case_id;
        Created_at = created_at;
        this.type = type;
        this.description = description;
        this.pet_id = pet_id;
    }

    public Case () {

    }

    public int getCase_id() {
        return case_id;
    }

    public void setCase_id(int case_id) {
        this.case_id = case_id;
    }

    public Date getCreated_at() {
        return Created_at;
    }

    public void setCreated_at(Date created_at) {
        Created_at = created_at;
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

    public int getPet_id() {
        return pet_id;
    }

    public void setPet_id(int pet_id) {
        this.pet_id = pet_id;
    }
}
