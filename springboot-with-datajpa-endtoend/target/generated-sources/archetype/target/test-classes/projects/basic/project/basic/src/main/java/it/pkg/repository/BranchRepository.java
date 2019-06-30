package it.pkg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.pkg.entity.Branch;
public interface BranchRepository extends JpaRepository<Branch, Integer>{
	
	public List<Branch> findBranchByBranchName(String branchName);

}
