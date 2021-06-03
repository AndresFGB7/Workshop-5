package resources.pojos;

import java.util.List;

public class TotalVisits {

    private Integer totalVisits;
    private List<VisitType> visitByType;
    private List<VisitByVet> visitByVet;

    public TotalVisits() {
    }


    public TotalVisits ( List<VisitType> visitByType, List<VisitByVet> visitByVet , Integer totalVisits){

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

    public List<VisitType> getVisitByType() {
        return visitByType;
    }

    public void setVisitByType(List<VisitType> visitByType) {
        this.visitByType = visitByType;
    }

    public List<VisitByVet> getVisitByVet() {
        return visitByVet;
    }

    public void setVisitByVet(List<VisitByVet> visitByVet) {
        this.visitByVet = visitByVet;
    }
}
