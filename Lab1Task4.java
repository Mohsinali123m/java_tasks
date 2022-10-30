import java.util.Scanner;
class Lab1Task4{
	public static void main(String[] args){
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter Matriculation marks in percentage:");
		int matric = myObj.nextInt();

		System.out.println("Enter Intermediate Marks in percentage:");
		int inter = myObj.nextInt();

		System.out.println("Enter Entry Test Marks:");
		int entryMarks = myObj.nextInt();
		
		int cpn = (matric*10)/100 + (inter*30)/100 + (entryMarks*60)/100;
		System.out.println("Your CPN is " +cpn);

	}




}