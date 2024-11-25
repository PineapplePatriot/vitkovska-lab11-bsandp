import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ucu.edu.ua.tasktwo.BirthdayMailCode;
import ucu.edu.ua.tasktwo.Client;
import ucu.edu.ua.tasktwo.GiftMailCode;
import ucu.edu.ua.tasktwo.MailCode;
import ucu.edu.ua.tasktwo.MailInfo;


class StrategyTest {

    private static final String CLIENT_NAME = "John";
    private static final String CLIENT_GENDER = "m";
    private static final int CLIENT_AGE = 30;

    @Test
    void testBirthdayMailCode() {
    
        Client client = Client.builder()
                .name(CLIENT_NAME)
                .age(CLIENT_AGE)
                .sex(CLIENT_GENDER)
                .mail("john@example.com")
                .build();
        MailCode birthdayMailCode = new BirthdayMailCode();
        String message = birthdayMailCode.generateText(client);

        Assertions.assertEquals("Dear John, Happy Birthday!", message,
                "BirthdayMailCode did not generate the expected message.");
    }

    @Test
    void testGiftMailCode() {

        Client client = Client.builder()
                .name(CLIENT_NAME)
                .age(CLIENT_AGE)
                .sex(CLIENT_GENDER)
                .mail("john@example.com")
                .build();
        MailCode giftMailCode = new GiftMailCode();
        String message = giftMailCode.generateText(client);

        Assertions.assertEquals("John, you've received a gift.", message,
                "GiftMailCode did not generate the expected message.");
    }

    @Test
    void testMailInfoGenerateText() {
        Client client = Client.builder()
                .name(CLIENT_NAME)
                .age(CLIENT_AGE)
                .sex(CLIENT_GENDER)
                .mail("john@example.com")
                .build();

        MailCode mailCode = new BirthdayMailCode();
        MailInfo mailInfo = new MailInfo(client, mailCode);
        String generatedText = mailInfo.generateText();

        Assertions.assertEquals("Dear John, Happy Birthday!", generatedText,
                "MailInfo did not delegate correctly to MailCode.");
    }
}
