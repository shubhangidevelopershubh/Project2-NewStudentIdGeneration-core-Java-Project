package com.stech.newStudentInfo;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

// Main Method Class
public class StudentIdCardImpl {

	final static String prefix = "STUD";
	static int id = 101;

	public static void main(String[] args) {

		int input =0;
		
		String stName = null;
		String stClass = null;
		String stBloodGr = null;
		String stDOB = null;

		String generatedID = null;
		String studentName = null;
		String studentStandard = null;
		String studentBloodGr = null;
		String studentBornDate = null;

		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		Validator valid = new Validator();
		try {
			System.out.println("How Many Studnet ID Need To Generate");
			input = sc.nextInt();

			if (input <= 0) {
				throw new Exception("Null, Negative And Zero Will Not Accept ");
			} else {
				for (int i = 0; i < input; i++) {
					System.out.println("Enter Student Name ");
					stName = sc.next();
					if (valid.isValidStudentName(stName)) {
						studentName = stName;

						System.out.println("Enter Student Class ");
						stClass = sc.next();
						if (valid.isValidStudentClass(stClass)) {
							studentStandard = stClass;

							System.out.println("Enter Student Blood Group ");
							stBloodGr = sc.next();
							if (valid.isValidStudentBloodGroup(stBloodGr)) {
								studentBloodGr = stBloodGr;

								System.out.println("Enter Date Of Birth (Ex : MM-DD-YYYY) ");
								stDOB = sc.next();
								if (stDOB.isEmpty()) {
									System.out.println("Enter Valid Date Of Birth");
									flag = false;
								} else {
									studentBornDate = valid.validateStudentDOB(stDOB);
								}

							} else {
								System.out.println("Enter Valid Blood Group");
								flag = false;
							}

						} else {
							System.out.println("Enter Valid Student Class");
							flag = false;
						}
					} else {
						System.out.println("Please Enter Valid Name..!!");
						flag = false;
					}
				}
			}
		} catch (InputMismatchException ime) {
			System.out.println("Invalid Input : Please Enter Positive Number Only, Try Again..!!");
			flag = false;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		Set<StudentIdCard> studList = new HashSet<StudentIdCard>();

		generatedID = idGenerate(prefix, id);
		
		StudentIdCard student1 = new StudentIdCard(generatedID, studentName, studentStandard, studentBloodGr, studentBornDate);
		//StudentIdCard student2 = new StudentIdCard(generatedID, studentName, studentStandard, studentBloodGr, studentBornDate);

		studList.add(student1); // Object1 Added in List
		//studList.add(student2); // Object2 Added in List

		if (flag == true) {
			for (StudentIdCard s : studList) {
				s.diplayStudnetIdDetails();
			}
		}
	}

	public static String idGenerate(String prefix, int id) {
		//String output =null;
		
		String strId = Integer.toString(id);
		String output = prefix.concat(strId);
		return output;
	}
}
