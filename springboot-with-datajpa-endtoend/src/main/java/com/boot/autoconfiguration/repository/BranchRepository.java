package com.boot.autoconfiguration.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.autoconfiguration.entity.Branch;
public interface BranchRepository extends JpaRepository<Branch, Integer>{
	
	public List<Branch> findBranchByBranchName(String branchName);

}
