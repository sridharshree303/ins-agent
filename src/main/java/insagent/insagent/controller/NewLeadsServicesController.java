package insagent.insagent.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import insagent.insagent.modals.NewLeads;
import insagent.insagent.services.NewLeadsServices;

@RestController
@RequestMapping("/leads")
@CrossOrigin(origins = {"http://localhost:3000"})
public class NewLeadsServicesController {
	
	private static final Logger LOG = LoggerFactory.getLogger(NewLeadsServicesController.class);
	
	@Autowired(required = true)
	private NewLeadsServices newleadsservices;
	
	@PostMapping("/save")
	public NewLeads saveLead(NewLeads lead) {
		System.out.println(lead);
		LOG.info("new leads controller");
		NewLeads temp = newleadsservices.registerLeads(lead);
		LOG.info("new lead saved successfully");
		return temp;	
	}
	
	@GetMapping("/viewall")
	public List<NewLeads> viewAllLeads(){
		LOG.info("new leads controller");
		List<NewLeads> list = newleadsservices.getAllLeads();
		LOG.info("list of new leads returned succesfully");
		return list;
	}
}
