package resources.pojos;

public class VisitByVet {


    private Integer totalVisitsByVet;
    private String username;

    public VisitByVet (){


    }

    public VisitByVet ( String username ,Integer totalVisitsByVet ){
        //este es para contar las visitas de Vet
        this.totalVisitsByVet = totalVisitsByVet;
        this.username = username;

    }


    public Integer getTotalVisitsByVet() {
        return totalVisitsByVet;
    }

    public void setTotalVisitsByVet(Integer totalVisitsByVet) {
        this.totalVisitsByVet = totalVisitsByVet;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
