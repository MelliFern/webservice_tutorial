package com.lymt.rest.webservice.restfulwebservice.lymtbasic.cases;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository

public class CaseDaoService {
	private static List<Case> cases = new ArrayList<Case>();
	private int idCounter =3;
	static{
		cases.add(new Case(1,"Jane","Doe", new Date(), "add1", "mumbai", 400059));
		cases.add(new Case(2,"John","	", new Date(), "add2", "mumbai", 980052)); 
		cases.add(new Case(3,"Bill","Blank", new Date(), "add2", "mumbai", 780052)); 
	}
	
	// find a case
	public Case findCase(Integer id){
		for(Case c:cases){
			if (c.getId() == id){
				return c;
			}
		}
		return null;
	}
	
	// return list of cases
	public List<Case> caseList(){
		return this.cases;
	}
	
	// save new user
	public Case createNewCase(Case newCase){
		if(newCase.getId() == null){
			newCase.setId(++idCounter);
		}
		cases.add(newCase);
		return newCase;
	}
}
