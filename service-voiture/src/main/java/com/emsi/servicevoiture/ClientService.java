package com.emsi.servicevoiture;

import com.emsi.servicevoiture.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientServiceClient clientServiceClient; // Utilisez l'interface ici

    public Client clientById(Long id) {
        return clientServiceClient.clientById(id);
    }
}
