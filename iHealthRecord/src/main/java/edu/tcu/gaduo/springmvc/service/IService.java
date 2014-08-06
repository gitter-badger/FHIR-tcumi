package edu.tcu.gaduo.springmvc.service;

import java.util.List;

import org.hl7.fhir.instance.model.element.resuorce.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

public interface IService<T> {

    T save(T entity); // Saves the given entity.                                                                  

    T findById(String _id, Class<T> clazz);                                                      

    List<T> findAll(Class<T> clazz);                                                                 

    Page<T> findAll(Pageable pageable);                                                  

    Long count();                                                                      

    void delete(T entity);                                                           

    boolean exists(String primaryKey);   

}
