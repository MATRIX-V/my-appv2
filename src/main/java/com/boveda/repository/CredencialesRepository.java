package com.boveda.repository;
import com.boveda.models.Credenciales;
import org.springframework.data.mongodb.repository.MongoRepository;

    public interface CredencialesRepository extends MongoRepository<Credenciales, String> {
    }



