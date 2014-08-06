package edu.tcu.gaduo.springmvc.repository.mongodb;

import java.util.List;

import javax.sql.DataSource;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import edu.tcu.gaduo.springmvc.repository.IRepository;

@Repository
public class MongodbGenericRepositoryImpl<T> implements IRepository<T>{
    
    private MongoTemplate mongoTemplate;
    
    @Autowired
    public MongodbGenericRepositoryImpl(MongoTemplate mongoTemplate){
    	this.mongoTemplate = mongoTemplate;
		System.out.println("mongodb");
    }
	
	@Override
	public T save(T entity) {
		System.out.println("mongodb" + entity.getClass());
		if(!mongoTemplate.collectionExists(entity.getClass())){
			mongoTemplate.createCollection(entity.getClass());
			mongoTemplate.insert(entity);
		} else {
			mongoTemplate.insert(entity);
		}
		return entity;
	}

	@Override
	public T findById(String _id, Class<T> clazz) {
		T resource = mongoTemplate.findById(new ObjectId(_id), clazz);
		return resource;
	}

	@Override
	public List<T> findAll(Class<T> clazz) {
		List<T> list = mongoTemplate.findAll(clazz);
		return list;
	}

	@Override
	public Page<T> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long count(Class<T> clazz) {
		Long count = mongoTemplate.count(new Query(), clazz);
		return count;
	}

	@Override
	public void delete(T entity) {
//		mongoTemplate.re
		
	}

	@Override
	public boolean exists(String _id, Class<T> clazz) {
		T resource = mongoTemplate.findById(new ObjectId(_id), clazz);
		if(resource == null)
			return false;
		return true;
	}

}
