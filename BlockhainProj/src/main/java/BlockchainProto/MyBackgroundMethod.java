package BlockchainProto;

import com.mongodb.client.model.changestream.ChangeStreamDocument;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;

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
  // Respond to the change
  // For example, log the change or send an alert
});
                try {
                    Thread.sleep(35);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MyBackgroundMethod.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
}
