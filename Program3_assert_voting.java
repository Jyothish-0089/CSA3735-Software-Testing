package JavaPackage;
import static org.junit.Assert.assertTrue;
import java.util.Scanner;
class assert_voting{
	 public static void main(String[] args){ 
		int age,shrt;
		Scanner scan = new Scanner(System.in);
		System.out.println(" Please Enter your Age: ");
		age = scan.nextInt(); 
		if(age>=18){ 
			System.out.println("Congratulations!! You are eligible to vote!");
		} 
		else{
			shrt= (18 - age);
			System.out.println("Sorry,You can vote only after :"+ shrt + " year(s)");
			assertTrue(age==shrt);
		} 
	} 
}
