package com.boveda.services;
import com.boveda.models.Credenciales;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface CredencialesRepository extends MongoRepository<Credenciales, String> {
        public Credenciales findByPlataforma (String plataforma);
    }
