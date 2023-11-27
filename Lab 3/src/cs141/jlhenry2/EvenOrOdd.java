package cs141.jlhenry2;
import java.util.Scanner;
public class EvenOrOdd {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scnr = new Scanner(System.in);
			int num;
			
			System.out.println("Give me a whole number:");
			num = scnr.nextInt();
			
			if(num % 2 == 1) { // if one is left over then it is odd
				System.out.println("hmm I see ... " + num);
				System.out.println("your number is: odd");

			}
			else if (num % 2 == 0) { //If nothing is left over then it is even
				System.out.println("hmm I see ... " + num );
				System.out.println("your number is: even");

			}

		}

	}
//-JH