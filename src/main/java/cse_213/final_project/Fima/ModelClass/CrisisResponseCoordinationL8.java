package cse_213.final_project.Fima.ModelClass;

public class CrisisResponseCoordinationL8 {

    public String Situationdetails;

    public CrisisResponseCoordinationL8(String situationdetails) {
        Situationdetails = situationdetails;
    }


    public String getSituationdetails() {
        return Situationdetails;
    }

    public void setSituationdetails(String situationdetails) {
        Situationdetails = situationdetails;
    }

    @Override
    public String toString() {
        return "CrisisResponseCoordinationL8{" +
                "Situationdetails='" + Situationdetails + '\'' +
                '}';
    }
}
