package insagent.insagent.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import insagent.insagent.emailService.EmailService;
import insagent.insagent.modals.EmailDetails;

@RestController
@CrossOrigin
public class EmailController {
	
	private static final Logger LOG = LoggerFactory.getLogger(EmailController.class);

	@Autowired 
	private EmailService emailService;
	
	// Sending a simple Email
    @PostMapping("/sendMail")
    public String sendMail(@RequestBody EmailDetails details)
    {
    	LOG.info("Email controller start");
        String status = emailService.sendSimpleMail(details);
        LOG.info("Email controller exit");
        return status;
    }
 
    // Sending email with attachment
    @PostMapping("/sendMailWithAttachment")
    public String sendMailWithAttachment(@RequestBody EmailDetails details)
    {
        String status = emailService.sendMailWithAttachment(details);
 
        return status;
    }
}
