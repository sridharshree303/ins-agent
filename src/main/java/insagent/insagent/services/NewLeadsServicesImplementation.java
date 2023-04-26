package insagent.insagent.services;

import java.time.LocalDate;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import insagent.insagent.modals.NewLeads;
import insagent.insagent.repository.NewLeadsRepositiory;

@Service
public class NewLeadsServicesImplementation implements NewLeadsServices {
	
	private static final Logger LOG = LoggerFactory.getLogger(NewLeadsServicesImplementation.class);
	
	@Autowired
	private NewLeadsRepositiory newleadsrepository;
	

//	@Override
	public NewLeads registerLeads(NewLeads newlead) {
		System.out.println(newlead);
		//setting today date
		LocalDate currentDate = LocalDate.now();
	    String dateString = currentDate.toString();
		newlead.setLastContacted(dateString);
		
		LOG.info("serices entered");
		NewLeads temp = newleadsrepository.save(newlead);
		LOG.info("services exited");
		return temp;
	}

//	@Override
	public List<NewLeads> getAllLeads() {
		LOG.info("get all leads service");
		List<NewLeads> list = newleadsrepository.findAll();
		LOG.info("get all leads returned");
		return list;
	}
	
	
}	
