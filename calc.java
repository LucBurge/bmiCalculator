package bmiCalc;
import java.util.Scanner;
public class calc {
	
	public static void main(String[] args) {
		// create loop so user can run script multiple times			
		String status = "Running";
		while(status == "Running") {
			// user input for weight
			Scanner weight = new Scanner(System.in);
			System.out.println("Enter your weight in kilograms:");
			double w = weight.nextDouble();
			
			// user input for height
			Scanner height = new Scanner(System.in);
			System.out.println("Enter your height in metres:");
			double h = height.nextDouble();
			
			// calculation BMI = w / (h*h)
			double hSq = h*h; 
			double bmi = w/hSq;
			double rounded = Math.round(bmi);

			// display users BMI
			if(rounded > 10 && rounded < 50) {
				System.out.println("Your BMI is: " + rounded);
				if(rounded < 19) {
					System.out.println("You are underweight.");
				}
				else if(rounded > 25) {
					System.out.println("You are overweight.");
				}
				else {
					System.out.println("You are a healthy weight.");
				}
			}
			// troubleshooting user errors
			else if(w > 300 || w < 30) {
				System.out.println("Oops. Looks like you may have made a mistake entering your weight. Try again in kilograms");	
			}
			else if(h > 3 || h < 1) {
				System.out.println("Oops. Looks like you may have made a mistake entering your height. Try again in metres");	
			}
			else {
				System.out.println("Hmmm. Something has gone wrong. Please try again.");
			}	
			
			// take user input to run again or exit
			Scanner cont = new Scanner(System.in);
			System.out.println("Type 1 to continue or 2 to exit");
			int again = cont.nextInt();
			if(again == 1) {
				continue;
			}
			else {
				break;
			}
			
		}
		// after loop
		System.out.println("Goodbye");

	}

}
