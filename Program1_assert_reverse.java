package JavaPackage;
import static org.junit.Assert.assertEquals;
import java.util.Scanner; 
public class assert_reverse { 
	public static void main(String[] args){
	String str; 
	char ch; 
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string : "); 
	str=sc.nextLine();
	System.out.println("Reverse of a String '"+str+"' is :"); 
	for(int j=str.length();j>0;--j){
		System.out.print(str.charAt(j-1));
	    assertEquals("Raiden",str);
	} 
		assertEquals("Raiden",str);
		
    }
}
