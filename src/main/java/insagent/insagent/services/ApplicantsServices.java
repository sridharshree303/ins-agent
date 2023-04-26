package insagent.insagent.services;

import java.util.List;

import insagent.insagent.modals.Applicants;

public interface ApplicantsServices {
	
	public Applicants save(Applicants applicant);
	
	public List<Applicants> getAll();
}
