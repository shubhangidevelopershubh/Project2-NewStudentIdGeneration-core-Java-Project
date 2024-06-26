
package com.stech.newStudentInfo;


// POJO - Plain Old Java Object
public class StudentIdCard {
	
	// POJO private Data Member
	private String studID;
	private String studFullName;
	private String studClass;
	private String studBloodGrp;
	private String dateOfBirth;
	
	// Constructor(Parameterized)
	public StudentIdCard(String studID, String studFullName, String studClass, String studBloodGrp,
			String dateOfBirth) {
		super();
		this.studID = studID;
		this.studFullName = studFullName;
		this.studClass = studClass;
		this.studBloodGrp = studBloodGrp;
		this.dateOfBirth = dateOfBirth;
	}

	// Getter and Setter for Student ID
	public String getStudID() {
		return studID;
	}
	public void setStudID(String studID) {
		this.studID = studID;
	}

	
	// Getter and Setter for Student Full Name
	public String getStudFullName() {
		return studFullName;
	}
	public void setStudFullName(String studFullName) {
		this.studFullName = studFullName;
	}

	
	// Getter and Setter for Student Class
	public String getStudClass() {
		return studClass;
	}
	public void setStudClass(String studClass) {
		this.studClass = studClass;
	}

	
	// Getter and Setter for Student Blood Group
	public String getStudBloodGrp() {
		return studBloodGrp;
	}
	public void setStudBloodGrp(String studBloodGrp) {
		this.studBloodGrp = studBloodGrp;
	}

	// Getter and Setter for Student Date of Birth
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
	public void diplayStudnetIdDetails(){
		System.out.println();
		System.out.println();
		System.out.println("\t \t *************STUDENT ID CARD************");
		System.out.println("\t \t * Student ID \t \t : " +studID +"\t"+"*");
		System.out.println("\t \t * Student Name \t : " +studFullName+"\t"+"*");
		System.out.println("\t \t * Student Class \t : " +studClass+"\t \t"+"*");
		System.out.println("\t \t * Blood Group \t \t : " +studBloodGrp+"\t \t"+"*");
		System.out.println("\t \t * Date Of Birth \t : " +dateOfBirth+"\t"+"*");
		System.out.println("\t \t ****************************************");
	}
}





