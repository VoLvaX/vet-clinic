package main.java.com.magicvet.model;

import java.util.Objects;

public class Client {

    private String firstName;
    private String secondName;
    private String email;
    private pet pet;

    @Override
    public String toString() {
        return "Client {"
                + "\n\tfirstName = " + firstName
                + ", secondName = " + secondName
                + ", email = " + email
                + ",\n\tpet = " + pet
                + "\n}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(firstName, client.firstName)
                && Objects.equals(secondName, client.secondName)
                && Objects.equals(email, client.email)
                && Objects.equals(pet, client.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, email, pet);
    }

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


