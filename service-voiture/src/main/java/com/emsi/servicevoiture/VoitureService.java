package com.emsi.servicevoiture;

import com.emsi.servicevoiture.entities.Voiture;
import org.springframework.stereotype.Service;

@Service
public class VoitureService {
    public Voiture enregistrerVoiture(Voiture voiture) {
        return voiture;
    }
}
