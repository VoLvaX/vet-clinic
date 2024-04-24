package main.java.com.magicvet.model;

public class Client {

    private String firstName;
    private String secondName;
    private String email;
    private pet pet;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public main.java.com.magicvet.model.pet getPet() {
        return pet;
    }

    public void setPet(main.java.com.magicvet.model.pet pet) {
        this.pet = pet;
    }
}


