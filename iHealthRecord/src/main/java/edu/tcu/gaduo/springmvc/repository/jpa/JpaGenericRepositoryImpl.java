package edu.tcu.gaduo.springmvc.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hl7.fhir.instance.model.element.resuorce.FamilyHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import edu.tcu.gaduo.springmvc.repository.IRepository;

@Repository
public class JpaGenericRepositoryImpl<T> implements IRepository<T>{
	@PersistenceContext
    private EntityManager em;

	@Override
	public T save(T entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T findById(String _Id, Class<T> clazz) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findAll(Class<T> clazz) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<T> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long count(Class<T> clazz) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(String _id, Class<T> clazz) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
