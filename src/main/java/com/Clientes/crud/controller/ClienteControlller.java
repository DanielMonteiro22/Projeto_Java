package com.Clientes.crud.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.net.server.Client;
import dto.ClientesDto;

@RestController
public class ClienteControlller {
	

    @GetMapping("/{id}")
    public ResponseEntity<ClientesDto> getClienteById(@PathVariable Long id) {
       
       
        ClientesDto clienteDTO = new ClientesDto();
       

        return ResponseEntity.ok(clienteDTO);
    }


}
