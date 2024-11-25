import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ucu.edu.ua.task2.Client;
import ucu.edu.ua.task2.BirthdayMailCode;
import ucu.edu.ua.task2.GiftMailCode;
import ucu.edu.ua.task2.MailCode;
import ucu.edu.ua.task2.MailInfo;

class StrategyTest {

    @Test
    void testBirthdayMailCode() {
        Client client = Client.builder()
                .name("John")
                .age(30)
                .mail("john@example.com")
                .build();
        MailCode birthdayMailCode = new BirthdayMailCode();
        String message = birthdayMailCode.generateText(client);
        assertEquals("Dear John, Happy Birthday!", message, 
                "BirthdayMailCode did not generate the expected message.");
    }

    @Test
    void testGiftMailCode() {
        Client client = Client.builder()
                .name("Jane")
                .age(25)
                .mail("jane@example.com")
                .build();
        MailCode giftMailCode = new GiftMailCode();
        String message = giftMailCode.generateText(client);
        assertEquals("Jane, you've received a gift.", message, 
                "GiftMailCode did not generate the expected message.");
    }

    @Test
    void testMailInfoGenerateText() {
        Client client = Client.builder()
                .name("Alice")
                .age(40)
                .mail("alice@example.com")
                .build();
        MailCode birthdayMailCode = new BirthdayMailCode();
        MailInfo mailInfo = new MailInfo(client, birthdayMailCode);
        String generatedText = mailInfo.generateText();
        assertEquals("Dear Alice, Happy Birthday!", generatedText, 
                "MailInfo did not delegate correctly to MailCode.");
    }
}
