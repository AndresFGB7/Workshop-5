package resources.pojos;

import java.util.List;

public class TotalCases {

    private List<Case> caseByType;
    private Integer totalCases;


    public TotalCases(List<Case> caseByType, Integer totalCases) {
        this.caseByType = caseByType;
        this.totalCases = totalCases;
    }

    public TotalCases (){



    }

    public List<Case> getCaseByType() {
        return caseByType;
    }

    public void setCaseByType(List<Case> caseByType) {
        this.caseByType = caseByType;
    }

    public Integer getTotalCases() {
        return totalCases;
    }

    public void setTotalCases(Integer totalCases) {
        this.totalCases = totalCases;
    }
}
