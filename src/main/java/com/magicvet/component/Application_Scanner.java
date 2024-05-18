package main.java.com.magicvet.component;

import main.java.com.magicvet.model.Client;
import main.java.com.magicvet.service.Client_service;
import main.java.com.magicvet.service.PetService;
import main.java.com.magicvet.model.pet;

public class Application_Scanner {

    private final Client_service clientService = new Client_service();
    private final PetService petService = new PetService();

    public void run() {
        if (Autheticator.auth()) {
            Client client = clientService.registerNewClient();

            if (client != null) {
                System.out.println("Adding a new pet. ");

                pet pet = petService.regicsetNewPet();

                if (pet != null) {
                    client.setPet(pet);
                    pet.setOwnerName(client.getFirstName() + " " + client.getSecondName());
                    System.out.println("Pet has been added. ");
                }
                System.out.println(client);
            }
        }
    }

}
