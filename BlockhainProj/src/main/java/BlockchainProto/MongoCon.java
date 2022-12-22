package BlockchainProto;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import java.util.HashMap;
import java.util.Map;
import org.bson.Document;

public class MongoCon {
    MongoClient mongoClient;
    MongoDatabase database;
    MongoCollection<Document> collection;
    private final String connectionString;
    public MongoCon() {
        this.connectionString = "mongodb://localhost:27017";
        // Connect to the MongoDB server
        mongoClient = MongoClients.create(this.connectionString);
        // Get the database
        database = mongoClient.getDatabase("admin");
        // Get the collection
        collection = database.getCollection("mycollection");

        // Create a new document to insert
        
       /* Document doc = new Document("name", "John")
                            .append("age", 30)
                            .append("email", "john@example.com");
*/
       
        // Insert the document into the collection
       
        // collection.insertOne(doc); 
    }
    // Iterate over the key-value pairs in the hashMap
public void makeEntry(HashMap<Integer,Object[]> para){
    for (Map.Entry<Integer, Object[]> entry : para.entrySet()) {
    String key = entry.getKey().toString();
    Object[] value = entry.getValue();
    
// Create a new MongoDB document with the key-value pair
    Document doc = new Document(key, value);

// Insert the document into the desired collection in the database
    collection.insertOne(doc);
    }
      
    
}
}