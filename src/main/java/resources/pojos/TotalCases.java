package resources.pojos;

import java.util.List;

public class TotalCases {

    private List<CaseType> caseByType;
    private Integer totalCases;


    public TotalCases (){

    }

    public TotalCases(List<CaseType> casesByType, int totalCases) {
        this.caseByType = casesByType;
        this.totalCases = totalCases;
    }


    public List<CaseType> getCaseByType() {
        return caseByType;
    }

    public void setCaseByType(List<CaseType> caseByType) {
        this.caseByType = caseByType;
    }

    public Integer getTotalCases() {
        return totalCases;
    }

    public void setTotalCases(Integer totalCases) {
        this.totalCases = totalCases;
    }
}
