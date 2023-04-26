package insagent.insagent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import insagent.insagent.modals.Applicants;

@EnableJpaRepositories
public interface ApplicantsRepository extends JpaRepository<Applicants, Integer>{
	
}
