package JavaPackage;
import static org.junit.Assert.assertTrue;
import java.util.Scanner;
class assert_dec_to_bin_and_octal{ 
	public static void main(String[] args){
		Scanner in = new Scanner(System.in); 
		// decimal number
		System.out.println("Enter the decimal : ");
		int decimal = in.nextInt(); 
		// convert decimal to binary
		String binary = Integer.toBinaryString(decimal); 
		System.out.println("BINARY IS " + binary); 
		
		//convert decimal to octal
		System.out.print("OCTAL IS "); 
		System.out.println(Integer.toOctalString(decimal));
		//assertEqual("1100" , binary);
		assertTrue(14== decimal);
		
	}
	
}
