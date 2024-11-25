package ucu.edu.ua.tasktwo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor @Getter @Setter
public class MailInfo {
    private Client client;
    private MailCode mailCode;
    
    public String generateText() {
        return mailCode.generateText(client);
    }
}
