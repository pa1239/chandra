#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ${package}.entity.Branch;
import ${package}.repository.BranchRepository;

@Service
public class BranchService {

	@Autowired
	private BranchRepository branchRepository;
	
	public List<Branch> getBranches(String branchName){
		
		return branchRepository.findBranchByBranchName(branchName);
	}
}
