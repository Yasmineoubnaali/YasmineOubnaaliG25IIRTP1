package com.emsi.servicevoiture;

import com.emsi.servicevoiture.entities.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "service-client")
public interface ClientServiceClient {

    @GetMapping("/clients/{id}")
    Client clientById(@PathVariable("id") Long id);
}