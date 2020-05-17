import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SendWhatsAppMessage {
   // Replace these placeholders with your Account Sid and Auth Token
   public static final String ACCOUNT_SID = "ACXXXXXXXXXXXX";
   public static final String AUTH_TOKEN = "your_auth_token";

   public static void main(String[] args) {
       Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
       Message message = Message.creator(
               new com.twilio.type.PhoneNumber("whatsapp:+15005550006"),
               new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
               "Hello from your friendly neighborhood Java application!")
           .create();public class whatappsender {
               
           }
   }
}