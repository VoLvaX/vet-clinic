package main.java.com.magicvet.service;

import main.java.com.magicvet.Main;
import main.java.com.magicvet.model.Dog;
import main.java.com.magicvet.model.pet;

public class PetService {

    private static final String DOG_TYPE = "dog";

    public pet regicsetNewPet() {
        pet pet = new pet();

        System.out.print("Type (dog / cat / other): ");
        String type = Main.SCANNER.nextLine();

        if (DOG_TYPE.equals(type)) {
            pet = buildDog();
        } else {
            pet = buildPet(type);

        }
            return pet;

    }

    private Dog buildDog() {
        pet pet = buildPet(DOG_TYPE);
        Dog dog = petToDog(pet);

        System.out.println("Size (xS / S / M / L / xxL): ");
        dog.setSize(Main.SCANNER.nextLine());

        return dog;

    }

    private Dog petToDog(pet pet) {
        Dog dog = new Dog();
        dog.setAge(pet.getAge());
        dog.setName(pet.getName());
        dog.setSex(pet.getSex());

        return dog;
    }


    private pet buildPet(String type) {
        pet pet = new pet();
        pet.setType(type);

        System.out.print("Age: ");
        pet.setAge(Main.SCANNER.nextLine());

        System.out.print("Name: ");
        pet.setName(Main.SCANNER.nextLine());

        System.out.print("Sex (male / female): ");
        pet.setSex(Main.SCANNER.nextLine());

        return pet;
    }

}

