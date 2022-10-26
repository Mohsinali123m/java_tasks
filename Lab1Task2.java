import java.util.Scanner;

class Lab1Task2{
	public static void main(String[] args){
		
		Scanner myObj = new Scanner(System.in);		

		System.out.println("Enter number");
		
		int num1 = myObj.nextInt();
		
		if(num1%2==0){
			System.out.println("Number " +num1 +" is even " );	
		}
		else{
			System.out.println("Number " +num1 +" is odd ");
		}
		
		
	}



}