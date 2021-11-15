package loops;

import java.util.Scanner;

public class loopss {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		

		System.out.println("Enter first Number");
		int num1 = sc.nextInt();

		
		System.out.println("Enter your Second Number"); 
		int num2 = sc.nextInt();
		
		while(num1 <= num2) {
			if(num1%2==1) 
			{
				System.out.println(num1);
				
				
			}

		num1++;
	}

}
	
}
