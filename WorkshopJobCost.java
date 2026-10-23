package consoleio;

import  java.util.Scanner;

public class WorkshopJobCost {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter client's first name: ");
		String clientFirstName = input.next();
		
		input.nextLine();
		
		System.out.print("Enter company name: ");
		String companyName = input.nextLine();
		
		System.out.print("Enter job reference number: ");
		long jobReferenceNumber = input.nextLong();
		
		System.out.print("Enter product category: ");
		char productCategory = input.next().charAt(0);
		
		System.out.print("Enter number of workers: ");
		byte numberOfWorkers = input.nextByte();
		
		System.out.print("Enter Number of hours worked: ");
		short numberOfHoursWorked = input.nextShort();
		
		System.out.print("Enter quantity produced: ");
		int quantityProduced = input.nextInt();
		
		System.out.print("Enter labour rate per hour: ");
		float labourRatePerHour = input.nextFloat();
		
		System.out.print("Enter material cost per item: ");
		double materialCostPerItem = input.nextDouble();
		
		System.out.print("Is the job urgent? (true/false):  ");
		boolean urgentJob = input.nextBoolean();
		
		double labourCost = numberOfWorkers * numberOfHoursWorked * labourRatePerHour;
		double totalMaterialCost = quantityProduced * materialCostPerItem;
		double totalJobCost = labourCost + totalMaterialCost;
		double averageCostPerItem = totalJobCost / quantityProduced;
		
		System.out.println();
		System.out.println("WORKSHOP JOB-COST REPORT");
		System.out.println("-------------------------");
		System.out.println("Client's First Name: " + clientFirstName);
		System.out.println("Company Name: "+ companyName);
		System.out.println("Job Reference Number: " + jobReferenceNumber);
		System.out.println("Product Category: " + productCategory);
		System.out.println("Number of Workers: " + numberOfWorkers);
		System.out.println("Hours Worked: " + numberOfHoursWorked);
		System.out.println("Quantity Produced: " + quantityProduced);
		System.out.println("Labour Rate per Hour: UGX " + labourRatePerHour);
		System.out.println("Material Cost per Item: UGX " + materialCostPerItem);
		System.out.println("Urgent Job: " + urgentJob);
		
		System.out.println();
		System.out.println("CALCULATED COSTS");
		System.out.println("----------------");
		System.out.println("Labour Cost: UGX " + labourCost);
		System.out.println("Total Material Cost: UGX " + totalMaterialCost);
		System.out.println("Total Job Cost: UGX " + totalJobCost);
		System.out.println("Average Cost per Item: UGX " + averageCostPerItem);
		
	}

}
