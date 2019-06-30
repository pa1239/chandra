#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ${package}.entity.Branch;
public interface BranchRepository extends JpaRepository<Branch, Integer>{
	
	public List<Branch> findBranchByBranchName(String branchName);

}
