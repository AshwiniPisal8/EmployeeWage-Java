package com.infotech.employeewage;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		/** Welcome massage for user**/
		System.out.println("Welcome to Employee Wage Computation Program");
		
		int attendance;
		int daily_wage = 0;
		int empType;
		
		final int IS_ABSENT = 0;
		final int WAGE_PER_HR = 20;
		final int FULL_TIME_HR = 8;
		final int PART_TIME_HR = 4;
		final int IS_PART_TIME = 0;
		final int IS_FULL_TIME = 1;
		
		Random random = new Random();
		attendance = random.nextInt(2);
		System.out.println("Attendance ="+attendance);
		
		if(attendance == IS_ABSENT) {
			System.out.println("Employee is Absent");
		}
           else {
			System.out.println("Employee is Present ");
			empType = random.nextInt(2);
			
	switch(empType) {
			case IS_PART_TIME :
				System.out.println("Employee is PartTime");
				daily_wage = WAGE_PER_HR * PART_TIME_HR;
			   break;
			case IS_FULL_TIME :
					System.out.println("Employee is FullTime");
					daily_wage = WAGE_PER_HR * FULL_TIME_HR;
				break;
				
			}
	}
		
          System.out.println("Daily Wage ="+daily_wage);
	}
}

