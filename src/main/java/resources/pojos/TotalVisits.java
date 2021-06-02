package resources.pojos;

import java.util.List;

public class TotalVisits {

    private Integer totalVisits;
    private List<Visit> visitByType;
    private List<Visit> visitByVet;

    public TotalVisits() {
    }


    public TotalVisits ( List<Visit> visitByType, List<Visit> visitByVet , Integer totalVisits){

        this.totalVisits = totalVisits;
        this.visitByType = visitByType;
        this.visitByVet = visitByVet;

    }

    public Integer getTotalVisits() {
        return totalVisits;
    }

    public void setTotalVisits(Integer totalVisits) {
        this.totalVisits = totalVisits;
    }

    public List<Visit> getVisitByType() {
        return visitByType;
    }

    public void setVisitByType(List<Visit> visitByType) {
        this.visitByType = visitByType;
    }

    public List<Visit> getVisitByVet() {
        return visitByVet;
    }

    public void setVisitByVet(List<Visit> visitByVet) {
        this.visitByVet = visitByVet;
    }
}
