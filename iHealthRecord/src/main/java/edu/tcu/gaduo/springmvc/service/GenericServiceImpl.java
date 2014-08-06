package edu.tcu.gaduo.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.tcu.gaduo.springmvc.repository.IRepository;

@Service
public class GenericServiceImpl<T> implements IService<T> {

	IRepository<T> repository;

    @Autowired
    public GenericServiceImpl(IRepository<T> repository) {
        this.repository = repository;
    }

	@Override
	public T save(T entity) {
		repository.save(entity);		
		return entity;
	}

	@Override
    @Transactional(readOnly = true)
	public T findById(String _id, Class<T> clazz) {
    	T familyHistory = repository.findById(_id, clazz);
		return familyHistory;
	}

	@Override
    @Transactional(readOnly = true)
	public List<T> findAll(Class<T> clazz) {
		List<T> list = repository.findAll(clazz);
		return list;
	}

	@Override
    @Transactional(readOnly = true)
	public Page<T> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
    @Transactional(readOnly = true)
	public Long count() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
    @Transactional(readOnly = true)
	public boolean exists(String primaryKey) {
		// TODO Auto-generated method stub
		return false;
	}

}
