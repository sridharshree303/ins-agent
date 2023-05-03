package insagent.insagent.emailService;

import insagent.insagent.modals.EmailDetails;

public interface EmailService {
	
	public String sendSimpleMail(EmailDetails details);
	
	public String sendMailWithAttachment(EmailDetails details);
}
