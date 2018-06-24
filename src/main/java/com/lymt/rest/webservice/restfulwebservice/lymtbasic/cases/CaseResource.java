package com.lymt.rest.webservice.restfulwebservice.lymtbasic.cases;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class CaseResource {

	@Autowired
	private CaseDaoService service;

	// Retrieve all Cases
	@GetMapping("/cases")
	public List<Case> retrieveAllCases() {
		return service.caseList();
	}

	// Retrieve particular Case
	@GetMapping("/cases/{id}")
	public Case retrieveCase(@PathVariable int id) {
		return service.findCase(id);
	}

	// Create Case
	@PostMapping("/cases/new-case")
	public ResponseEntity createCase(@RequestBody Case newCase){
		Case savedCase = service.createNewCase(newCase);
		
		URI location = 	ServletUriComponentsBuilder
			.fromCurrentRequest()
			.path("/{id}")
			.buildAndExpand(savedCase.getId())
			.toUri();
		
		return ResponseEntity.created(location).build();
	}

}
