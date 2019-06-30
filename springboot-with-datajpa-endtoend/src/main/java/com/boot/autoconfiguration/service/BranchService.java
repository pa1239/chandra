package com.boot.autoconfiguration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.autoconfiguration.entity.Branch;
import com.boot.autoconfiguration.repository.BranchRepository;

@Service
public class BranchService {

	@Autowired
	private BranchRepository branchRepository;
	
	public List<Branch> getBranches(String branchName){
		
		return branchRepository.findBranchByBranchName(branchName);
	}
}
