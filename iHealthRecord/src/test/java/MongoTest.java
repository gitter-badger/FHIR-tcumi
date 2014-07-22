import java.net.UnknownHostException;
import java.util.List;

import org.junit.Test;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class MongoTest {

	@Test
	public void test() throws UnknownHostException {
		MongoClient mongo = new MongoClient("20.64.84.42", 27017);
		MongoClient mongoClient = new MongoClient();
		DB db = mongoClient.getDB("FHIR");
		List<String> dbs = mongo.getDatabaseNames();
		for(String d : dbs){
			System.out.println(d);
		}
	}

}
