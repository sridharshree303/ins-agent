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

import insagent.insagent.modals.Applicants;
import insagent.insagent.services.ApplicantsServices;

@RestController
@RequestMapping("/applicant")
//@CrossOrigin(origins = {"http://localhost:3000"})
@CrossOrigin
public class ApplicantsController {

	private static final Logger LOG = LoggerFactory.getLogger(ApplicantsController.class);
	
	@Autowired
	private ApplicantsServices applicantservices;
	
	@PostMapping("/save")
	public Applicants saveApplicant(Applicants applicant) {
		LOG.info("Applicant controller");
		Applicants temp = applicantservices.save(applicant);
		LOG.info("applicant saved - controller");
		return temp;
	}
	
	@GetMapping("/getAll")
	public List<Applicants> getAllApplicants(){
		LOG.info("Applicant controller");
		List<Applicants> list = applicantservices.getAll();
		LOG.info("Applicants list returned - controller");
		return list;
	}
}
