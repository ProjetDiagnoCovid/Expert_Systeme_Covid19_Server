package ma.fstm.ilisi2.ExpertSysCovid19.model.dao;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class Connexion {

	
	public static void main(String[] args) {

		MongoClient mongoclient=null;
		try {
				
		mongoclient = new MongoClient("localhost",27017);
		System.out.println("connection successfuly");
		
		DB db = mongoclient.getDB("mydb");
		System.out.println("Connect to database successfully");
		
		DBCollection collection = db.getCollection("students");

        System.out.println("Collection coll selected successfully");

        //DBObject document = new BasicDBObject().append("fname", "laila");
        
        //collection.insert(document);
		
        DBCursor cursor = collection.find();
        
        while(cursor.hasNext())
        	System.out.println(cursor.next());
        
        
        
		}catch(Exception e) {
			System.out.println(e.getClass() + "  " + e.getStackTrace());
		}
		finally {
			if(mongoclient!=null)
				mongoclient=null;
		}
	}

}
