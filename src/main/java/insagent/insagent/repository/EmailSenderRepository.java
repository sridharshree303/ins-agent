package insagent.insagent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import insagent.insagent.modals.EmailDetails;

public interface EmailSenderRepository extends JpaRepository<EmailDetails, Integer>{
	
}
