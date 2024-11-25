package ucu.edu.ua.tasktwo;

public class GiftMailCode implements MailCode {
    @Override
    public String generateText(Client client) {
        return String.format("%s, you've received a gift.", client.getName());
    }
}
