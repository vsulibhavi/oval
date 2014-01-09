package org.poc.oval;

import java.util.List;

import net.sf.oval.ConstraintViolation;
import net.sf.oval.Validator;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Validator validator = new Validator();

		BusinessObject bo = new BusinessObject("blabla");

		// collect the constraint violations 
		List<ConstraintViolation> violations = validator.validate(bo);

		if(violations.size()>0)
		{
		  System.out.println("Object " + bo + " is invalid.");
		  System.out.println(violations.get(0).getMessage());
		}
		
	}

}
