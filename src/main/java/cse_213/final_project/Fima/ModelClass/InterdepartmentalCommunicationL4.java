package cse_213.final_project.Fima.ModelClass;

public class InterdepartmentalCommunicationL4 {

    public String massagetitle,sender,receiver;

    public InterdepartmentalCommunicationL4(String massagetitle, String sender, String receiver) {
        this.massagetitle = massagetitle;
        this.sender = sender;
        this.receiver = receiver;
    }

    public String getMassagetitle() {
        return massagetitle;
    }

    public void setMassagetitle(String massagetitle) {
        this.massagetitle = massagetitle;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }


    @Override
    public String toString() {
        return "InterdepartmentalCommunicationL4{" +
                "massagetitle='" + massagetitle + '\'' +
                ", sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                '}';
    }
}
