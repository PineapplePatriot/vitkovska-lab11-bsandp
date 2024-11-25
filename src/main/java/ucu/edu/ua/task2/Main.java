package ucu.edu.ua.task2;

public class Main {
    public static void main(String[] args) {
        Client client = Client.builder()
        .name("Client Name")
        .age(100)
        .mail("test@client.mail")
        .build();

        MailCode mailCode = new BirthdayMailCode();
        MailInfo mailInfo = new MailInfo(client, mailCode);
        MailSender mailSender = new MailSender();
        mailSender.sendMail(mailInfo);
    }
}
