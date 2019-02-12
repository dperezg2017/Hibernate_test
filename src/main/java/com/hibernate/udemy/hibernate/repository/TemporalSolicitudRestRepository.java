package com.hibernate.udemy.hibernate.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hibernate.udemy.hibernate.entity.TemporalSolicitudRest;


@Repository
public interface TemporalSolicitudRestRepository extends CrudRepository<TemporalSolicitudRest, Serializable>{

    @Query(value = "SELECT s.nombreRQ "
            +"FROM TemporalSolicitudRest s "
            +"WHERE s.nombreRQ = ?1")
    public abstract String findByNombreRQ(String NombreRQ);
    
    @Transactional
    @Modifying
    @Query(value = "DELETE FROM TemporalSolicitudRest s "
            +"WHERE s.nombreRQ = ?1")
    public void deleteByNombre(String NombreRQ);
    
    
}
