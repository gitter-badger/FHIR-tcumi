package edu.tcu.gaduo.mongodb;
import java.net.UnknownHostException;
import java.util.List;

import org.bson.types.ObjectId;
import org.hl7.fhir.instance.model.element.resuorce.FamilyHistory;
import org.hl7.fhir.instance.model.element.resuorce.Patient;
import org.junit.Before;
import org.junit.Test;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.DB;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;

public class MongoTest {
	private Mongo mongo = null;
	private String databaseName ;
	private MongoTemplate mongoTemplate;
	@Before
	public void init() throws UnknownHostException{
		mongo = new Mongo("203.64.84.42", 27017);
		databaseName = "FHIR";
		mongoTemplate = new MongoTemplate(mongo , databaseName);
	}

//	@Test
	public void test() throws UnknownHostException {
		MongoClient mongo = new MongoClient("203.64.84.42", 27017);
		DB db = mongo.getDB("FHIR");
//		Set<String> collections = db.getCollectionNames();
//		System.out.println("size : " + collections.size());
//		for(String d : collections){
//			System.out.println(d);
//		}
		
//		DBCollection familyHistory = db.getCollection("Patient");
//		DBObject one = familyHistory.findOne();
//		System.out.println(one.toString());
		
//		familyHistory.insert( )
		
	}
	
	@Test
	public void test01(){
		if(!mongoTemplate.collectionExists(Patient.class)){
			mongoTemplate.createCollection(Patient.class);
		}
		FamilyHistory fh = new FamilyHistory();
		if(!mongoTemplate.collectionExists(fh.getClass())){
			mongoTemplate.createCollection(fh.getClass());
			mongoTemplate.insert(fh);
		} else{
			mongoTemplate.insert(fh);
		}
		
	}
	
	@Test
	public void test02(){
		
		ObjectId _id = new ObjectId("53de01702612009bd876216e");
		Patient patient = mongoTemplate.findById(_id, Patient.class);
		if(patient != null)
			System.out.println(patient.getName().get(0).getFamily().get(0).getValue());
		
//		List<Patient> list = mongoTemplate.findAll(Patient.class);
//		for(Patient p : list){
//			System.out.println(p.getBirthDate().getValue().getDay());
//		}
	}

}
