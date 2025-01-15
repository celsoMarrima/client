package com.devmarrima.client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmarrima.client.entities.Client;

public interface ClientRepository extends JpaRepository <Client,Long> {


}
