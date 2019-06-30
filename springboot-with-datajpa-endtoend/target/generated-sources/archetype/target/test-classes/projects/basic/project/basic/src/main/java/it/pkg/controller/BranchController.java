package it.pkg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import it.pkg.entity.Branch;
import it.pkg.service.BranchService;

@Controller
public class BranchController {
	@Autowired
	private BranchService service;

	@RequestMapping("/{branchName}/branch.htm")
	public String getBranches(@PathVariable("branchName")String branchName,Model model) {
		
		            List<Branch> branches=service.getBranches(branchName);
		            
		            model.addAttribute("branches", branches);
		            
		            return"branch";
		
	}
}
