package com.persistence.dao;

import com.persistence.model.Client;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

@Repository
public class ClientDAO implements Dao<Client> {

    EntityManager entityManager;

    @Override
    public Optional<Client> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Client> getAll() {
        return null;
    }

    @Override
    public void save(Client client) {

    }

    @Override
    public void update(Client client, String[] params) {

    }

    @Override
    public void delete(Client client) {

    }
}
