import java.util.Scanner;
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter the number: ");
		
		//Exception handling in case user does not enter a number
		int num =0;
		Scanner scanner = new Scanner(System.in);
		num =scanner.nextInt();
		scanner.close();
		int sum=0;
		for(int i =0; i<=num; i++) {
			sum+=i;
			
		}
		
		System.out.println("Sum of the first "+ num+" natural numbers is: "+ sum);
		int fact =1;
		int i=num;
		while(i >0) {
			fact *=i;
			i--;
			
		}
		System.out.println("The factorial of "+ num+" is: "+ fact);


	}

}
