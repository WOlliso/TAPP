package org.tapp.bll;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.Resource;
import javax.ejb.Asynchronous;
import javax.ejb.Stateless;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

@Stateless
public class EJBDocuMail {
	
	@Resource(name = "java:jboss/mail/yahoo")
    private Session session;

    public void send(String addresses, String topic, String textMessage) {
 
        try {
        	System.out.println("je suis passé");
        	Address ad=new InternetAddress("hbtedi@yahoo.fr");
            Message message = new MimeMessage(session);
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(addresses));
            message.setSubject(topic);
            message.setText(textMessage);
            message.setFrom(ad);
            Transport.send(message);
 
        } catch (MessagingException e) {
            Logger.getLogger(EJBDocuMail.class.getName()).log(Level.WARNING, "Cannot send mail", e);
        }
    }
}
