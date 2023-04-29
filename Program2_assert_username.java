package JavaPackage;
import static org.junit.Assert.assertEquals;
import java.util.Scanner;
public class assert_username{
    public static void main(String[] args){ 
		Scanner in=new Scanner(System.in); 
		System.out.println("Enter the Username : "); 
		String str1=in.nextLine(); 
		System.out.println("Re-enter the Username :");
		String str2=in.nextLine(); 
		assertEquals(str1,str2);
		if(str1.contentEquals(str2)) {
			System.out.println("Username Valid");
		}
		else {
			System.out.println("Username Invalid");
		}
	}
}
