package com.devmarrima.client.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devmarrima.client.dto.ClientDTO;
import com.devmarrima.client.entities.Client;
import com.devmarrima.client.repositories.ClientRepository;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Client entity = repository.findById(id).get();
        return new ClientDTO(entity);
    }
    
    @Transactional(readOnly = true)
    public Page<ClientDTO> findAll(Pageable pageable) {
        Page<Client> entity = repository.findAll(pageable);
        return entity.map(x-> new ClientDTO(x));
    }

}
