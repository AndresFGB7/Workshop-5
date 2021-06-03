package resources.pojos;

public class VisitType {

    private String type;
    private Integer totalVisits;

    public VisitType() {


    }

    public VisitType (Integer totalVisits, String type) {
        //este es para contar las visitas de type
        this.totalVisits = totalVisits;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getTotalVisits() {
        return totalVisits;
    }

    public void setTotalVisits(Integer totalVisits) {
        this.totalVisits = totalVisits;
    }
}
