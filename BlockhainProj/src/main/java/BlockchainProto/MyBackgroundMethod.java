package BlockchainProto;

import com.mongodb.client.model.Filters;
import com.mongodb.client.model.changestream.ChangeStreamDocument;
import java.util.function.Consumer;
import org.bson.Document;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author VIVEK
 */
public class MyBackgroundMethod extends Thread{
    @Override
        public void run() {
            MongoCon mgc= new MongoCon();
            while (true) {
                System.out.println("Executed!");
                mgc.collection.watch().forEach((Consumer<? super ChangeStreamDocument<Document>>) change -> {
                    MongoDatabase db = mgc.mongoClient.getDatabase("admin");
  // Respond to the change
  // For example, log the change or send an alert
  Document lastOperation = db.runCommand(new Document("getLastError", 1));
            Long timestamp = lastOperation.getLong("timestamp");
            
            Document changedEntry = mgc.collection.find(Filters.eq("lastModified", new Document("$currentDate", true))).first();
            

// Print the changed entry to the console
    System.out.println("The changed entry is: " + changedEntry+" at "+timestamp);
    });
               /* try {
                    Thread.sleep(35);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MyBackgroundMethod.class.getName()).log(Level.SEVERE, null, ex);
                }*/
            }
        }
}
