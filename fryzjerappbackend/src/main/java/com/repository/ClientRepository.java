package com.repository;


import com.persistence.model.Client;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ClientRepository extends JpaEntityInformation<Client, Integer> {
}
