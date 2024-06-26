package com.stech.newStudentInfo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class Validator {

	public boolean isValidStudentName(String stName) {
		if(stName.isEmpty()){
			return false;
		}else{
			return Pattern.matches("^[A-Za-z]+$+", stName);
		}
	}

	public boolean isValidStudentClass(String stClass) {

		if(stClass.isEmpty()){
			return false;
		}else{
			return Pattern.matches("[A-Z0-9]*", stClass);
		}
	}

	public boolean isValidStudentBloodGroup(String stBloodGr) {

		if(stBloodGr.isEmpty()){
			return false;
		}else{
			
			return Pattern.matches("(A|B|AB|O)[+ -]+", stBloodGr);
		}
	}
	
	public String validateStudentDOB(String stDOB) {
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		String stBornDate = null;
		try {
			Date date = sdf.parse(stDOB); 
			sdf = new SimpleDateFormat("d MMM yyyy");
			stBornDate = (String)sdf.format(date);
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
		return stBornDate;
	}
}