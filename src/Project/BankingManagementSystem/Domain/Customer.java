package Project.BankingManagementSystem.Domain;

import java.security.PublicKey;

public class Customer {
    private String Id;
    private String Name;
    private String Email;

    public Customer(String  Id , String Name, String Email){
        this.Id = Id;
        this.Name = Name;
        this.Email = Email;
    }


    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

}
