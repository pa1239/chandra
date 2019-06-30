package it.pkg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.pkg.entity.Branch;
import it.pkg.repository.BranchRepository;

@Service
public class BranchService {

	@Autowired
	private BranchRepository branchRepository;
	
	public List<Branch> getBranches(String branchName){
		
		return branchRepository.findBranchByBranchName(branchName);
	}
}
