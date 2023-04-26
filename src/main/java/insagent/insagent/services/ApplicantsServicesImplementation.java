package insagent.insagent.services;

import java.time.LocalDate;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import insagent.insagent.modals.Applicants;
import insagent.insagent.repository.ApplicantsRepository;

@Service
public class ApplicantsServicesImplementation implements ApplicantsServices{
	
	private static final Logger LOG = LoggerFactory.getLogger(ApplicantsServicesImplementation.class);
	
	@Autowired
	private ApplicantsRepository applicantrepository;

	@Override
	public Applicants save(Applicants applicant) {
		//add curr date
		LocalDate currentDate = LocalDate.now();
	    String dateString = currentDate.toString();
	    applicant.setDate(dateString);
	    
	    
		LOG.info("Applicant services ");
		Applicants temp = applicantrepository.save(applicant);
		LOG.info("Applicant services - saved");
		return temp;
	}

	@Override
	public List<Applicants> getAll() {
		LOG.info("Applicant services");
		List<Applicants> list = applicantrepository.findAll();
		LOG.info("Applicant services - list returned");
		return list;
	}

}
