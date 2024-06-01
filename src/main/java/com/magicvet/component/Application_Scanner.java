package main.java.com.magicvet.component;

import main.java.com.magicvet.Main;
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
                registerPets(client);
                System.out.println(client);
            }
        }
    }

    private void registerPets(Client client) {
        boolean continueAddPets = true;

        while (continueAddPets) {
            addPet(client);

            System.out.print("Do you want to add more pets for the current client? (y/n): ");
            String answer = Main.SCANNER.nextLine();

            if ("n".equals(answer)) {
                continueAddPets = false;
            }


        }
    }

    private void addPet(Client client) {
        System.out.println("Adding a new pet. ");

        pet pet = petService.registerNewPet();
        client.addPet(pet);
        pet.setOwnerName(client.getFirstName() + " " + client.getSecondName());
        System.out.println("Pet has been added. ");
    }

}
