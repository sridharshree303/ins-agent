package insagent.insagent.services;

import java.util.List;

import insagent.insagent.modals.NewLeads;

public interface NewLeadsServices {
	
	public NewLeads registerLeads(NewLeads newlead);
	
	public List<NewLeads> getAllLeads();
}
