package insagent.insagent.emailService;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import insagent.insagent.modals.EmailDetails;
import insagent.insagent.repository.EmailSenderRepository;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class EmailServiceImplem implements EmailService {
	
	private static final Logger LOG = LoggerFactory.getLogger(EmailServiceImplem.class);
	
	@Autowired
	private EmailSenderRepository emailsendrepository;
	
	@Autowired 
	private JavaMailSender javaMailSender;
	 
    @Value("${spring.mail.username}") 
    private String sender;

	@Override
	public String sendSimpleMail(EmailDetails details) {
		System.out.println(details.getMsgBody());
		// Try block to check for exceptions
        try {
 
            // Creating a simple mail message
            SimpleMailMessage mailMessage = new SimpleMailMessage();
            
            // Setting up necessary details
            mailMessage.setFrom(sender);
            mailMessage.setTo(details.getRecipient());
            mailMessage.setText(details.getMsgBody());
            mailMessage.setSubject(details.getSubject());
 
            // Sending the mail
            javaMailSender.send(mailMessage);
            if(true) {
            	emailsendrepository.save(details);
            }
            return "Mail Sent Successfully...";
        }
 
        // Catch block to handle the exceptions
        catch (Exception e) {
        	e.printStackTrace();
            return "Error while Sending Mail";
        }
	}

	//sharing to multiple email's
	//https://mailtrap.io/blog/spring-send-email/#How-to-send-emails-to-multiple-recipients-from-Spring-Boot
	
	@Override
	public String sendMailWithAttachment(EmailDetails details) {
		System.out.println(details.getRecipient());
		// Creating a mime message
        MimeMessage mimeMessage
            = javaMailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper;
 
        try {
 
            // Setting multipart as true for attachments to
            // be send
            mimeMessageHelper
                = new MimeMessageHelper(mimeMessage, true);
            mimeMessageHelper.setFrom(sender);
            mimeMessageHelper.setTo(details.getRecipient());
            mimeMessageHelper.setText(details.getMsgBody());
            mimeMessageHelper.setSubject(
                details.getSubject());
 
            // Adding the attachment
            FileSystemResource file
                = new FileSystemResource(
                    new File(details.getAttachment()));
 
            mimeMessageHelper.addAttachment(
                file.getFilename(), file);
 
            // Sending the mail
            javaMailSender.send(mimeMessage);
            return "Mail sent Successfully";
        }
 
        // Catch block to handle MessagingException
        catch (MessagingException e) {
        	
            // Display message when exception occurred
        	System.out.println(e.getMessage());
            return "Error while sending mail!!!";
        }
    }
}

