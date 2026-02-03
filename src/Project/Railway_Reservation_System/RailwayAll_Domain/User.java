package Project.Railway_Reservation_System.RailwayAll_Domain;

public class User {
    private String Name;
    private String UserName;
    private String Mobile_No;
    private String password;

    public User(String Name , String UserName, String Mobile_No,String password ) {
        this.Name = Name;
        this.UserName = UserName;
        this.Mobile_No = Mobile_No;
        this.password = password;
    }

    public String getName() {
        return Name;
    }

    public String getUserName() {
        return UserName;
    }

    public String getPassword(){
        return password;
    }
}
