package insagent.insagent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import insagent.insagent.modals.NewLeads;

@EnableJpaRepositories
public interface NewLeadsRepositiory extends JpaRepository<NewLeads, Integer>{
	
	
}
