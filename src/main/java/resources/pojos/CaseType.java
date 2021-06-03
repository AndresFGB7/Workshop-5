package resources.pojos;

public class CaseType {

    private String type;
    private int totalCases;

    public CaseType (){


    }

    public CaseType (String type, int totalCases){
        //este es para obtener las visitas en cases
        this.type = type;
        this.totalCases = totalCases;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTotalCases() {
        return totalCases;
    }

    public void setTotalCases(int totalCases) {
        this.totalCases = totalCases;
    }
}
