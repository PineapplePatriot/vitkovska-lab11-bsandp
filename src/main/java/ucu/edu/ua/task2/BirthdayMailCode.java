package ucu.edu.ua.task2;

public class BirthdayMailCode implements MailCode {
    @Override
    public String generateText(Client client) {
        return String.format("Dear %s, Happy Birthday!", 
        client.getName(), client.getAge());
    }
}
