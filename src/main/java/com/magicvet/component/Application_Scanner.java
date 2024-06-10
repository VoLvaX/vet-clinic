package main.java.com.magicvet.component;

import main.java.com.magicvet.Main;
import main.java.com.magicvet.model.Client;
import main.java.com.magicvet.service.Client_service;
import main.java.com.magicvet.service.PetService;
import main.java.com.magicvet.model.pet;

public class Application_Scanner {

    private final EntityRegister register = new EntityRegister();

    public void run() {
        if (Autheticator.auth()) {
            register.registerClients();
        }
    }
}
