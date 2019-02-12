package com.hibernate.udemy.hibernate.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hibernate.udemy.hibernate.entity.Tramite;

@Repository
public interface HibernateRepository extends CrudRepository<Tramite, Serializable>{

    @Query(value = "SELECT s.tipoTram "
            +"FROM tramite s "
            +"WHERE s.tipoTram = ?1")
    public abstract String findByTipoTram(String tipoTram);
}
