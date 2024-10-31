package com.emsi.servicevoiture;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.emsi.servicevoiture.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
