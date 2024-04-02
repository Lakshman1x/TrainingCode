import com.mongodb.ConnectionString;
import com.mongodb.client.*;

import org.bson.Document;


public class DBConnect {
	/*
	/	Singleton class used for connecting to MongoDB
	 */
	private final String URI = "mongodb+srv://Lakshman11:Lakshman11@cluster0.yjqcdte.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
	
	MongoClient client = null;
	MongoDatabase db   = null;
	MongoCollection<Document> collection=null;
	ConnectionString connectionString =null;
	
	private DBConnect() {
		connectionString = new ConnectionString(URI);
		client = MongoClients.create(connectionString);
		db = client.getDatabase("Ping");
		collection = db.getCollection("Ping");
		
	}
	
	private static DBConnect connection;
	
	public static DBConnect getConnection() {
		if(connection == null) {
			connection = new DBConnect();
		}
		return connection;
	}

	public  String getMessage(){

		Document doc = collection.find().first();
		return doc.getString("Ping");

	}

	
}
