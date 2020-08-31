package bmiCalc;
import java.util.Scanner;
public class calc {

	public static void main(String[] args) {
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
		System.out.println("Your BMI is: " + rounded);
		
		// troubleshooting user errors
		if(h > 3 || h < 1) {
			System.out.println("Oops. Looks like you may have made a mistake entering your height. Try again in metres");	
		}
		if(w > 300 || w < 30) {
			System.out.println("Oops. Looks like you may have made a mistake entering your weight. Try again in kilograms");	
		}
		
	}

}
