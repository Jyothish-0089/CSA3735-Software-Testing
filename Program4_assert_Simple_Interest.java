package JavaPackage;
import static org.junit.Assert.assertTrue;
import java.util.Scanner;
class assert_simple_interest{
	public static void main(String[] args){ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Principle ammount = ");
		float P=sc.nextFloat();
		System.out.println("Time = ");
		float R=sc.nextFloat(); 
		System.out.println("Rate of Interest = ");
		float T=sc.nextFloat(); 
		float SI = (P * T * R) / 100; 
		System.out.println("Simple interest = " + SI);
		assertTrue(600==SI);
	}
}
