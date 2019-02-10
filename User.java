public class User {
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String passWord;
    private String address;
    private String city;
    private String zipCode;
    private String streetNumber;

    public user(String userName, String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName =  userName;
    }
    //public setters
    public void setEmail(String email) {this.email = email;}
    public void setPassWord(String passWord) {this.passWord = passWord;}
    public void setCity(Stirng city) {this.city = city;}
    public void setzipCode(String zipCode) {this.zipCode = zipCode;}
    public void setStreetNumber(String streetNumber) {this.streetNumber =streetNumber;}

    private void setAddress(String city, String zipcode, String streetNumber) {
        this.address = city + "-" + zipcode + "-" + streetNumber;
    }
    
    //public getters
    public String getFullName() {return this.fistName + " " + this.lastName;}
    public String getEmail() {return this.email;}
    public String getAddress() {return this.address;} 

}