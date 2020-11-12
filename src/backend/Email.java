/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.*;  
import javax.mail.*;  
import javax.mail.internet.*;  
import javax.activation.*;  
/**
 *
 * @author HP
 */
public class Email {
    protected String mailId;
    protected String subject;
    protected String message;
    
    public Email()
    {
        mailId = ElevatorControl.getMailId();
        message = "Power Backup required for Elevator in CC3";
        subject = "URGENT : Power Backup";
        System.out.println("Sending mail ...");
        sendMail();
    }
    
    public void sendMail()
    {        
        String host="smtp.gmail.com";
        final String user="oomproject2020@gmail.com";
        final String password="095105112124";

        String to=mailId;

        //imported code
        Properties props = new Properties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", user);
        props.put("mail.smtp.password", password);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");


        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(user,password);
                    }
                });

        //imported code
        try {
            MimeMessage mailMessage = new MimeMessage(session);
            mailMessage.setFrom(new InternetAddress(user));
            mailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            mailMessage.setSubject(subject);
            mailMessage.setText(message);


                    Transport.send(mailMessage);

            System.out.println("message sent!");

        }
        catch (MessagingException mex)
        {
            System.out.println(mex);
            System.out.println("Error: unable to send message....");
        }

}
}
