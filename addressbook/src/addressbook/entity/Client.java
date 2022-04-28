package addressbook.entity;

public class Client {
    private int id;
    private String clientName;
    private String clientEmail;
    private String clientPhone;

    public Client() {

    }

    public Client(int id, String clientName, String clientEmail, String clientPhone) {
        this.id = id;
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.clientPhone = clientPhone;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClientName() {
        return this.clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientEmail() {
        return this.clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getClientPhone() {
        return this.clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", customerName='" + getClientName() + "'" +
                ", customerEmail='" + getClientEmail() + "'" +
                ", customerPhone='" + getClientPhone() + "'" +
                "}";
    }

}