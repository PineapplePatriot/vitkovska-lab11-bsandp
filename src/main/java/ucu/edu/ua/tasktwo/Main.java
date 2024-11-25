package ucu.edu.ua.tasktwo;

public class Main {

    private static final int CLIENT_AGE = 100;
    public static void main(String[] args) {
        Client client = Client.builder()
        .name("Client Name")
        .age(CLIENT_AGE)
        .mail("test@client.mail")
        .build();

        MailCode mailCode = new BirthdayMailCode();
        MailInfo mailInfo = new MailInfo(client, mailCode);
        MailSender mailSender = new MailSender();
        mailSender.sendMail(mailInfo);
    }
}
