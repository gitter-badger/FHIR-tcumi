package edu.tcu.gaduo.springmvc.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

public interface IRepository<T> {

    T save(T entity); // Saves the given entity.                                                                  

    T findById(String _Id, Class<T> clazz);                                                      

    List<T> findAll(Class<T> clazz);                                                                 

    Page<T> findAll(Pageable pageable);                                                  

	Long count(Class<T> clazz);                                                         

    void delete(T entity);                                                           

	boolean exists(String _id, Class<T> clazz);                                             

}