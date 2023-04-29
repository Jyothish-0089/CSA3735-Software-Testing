package JavaPackage;
import static org.junit.Assert.assertTrue;
import java.util.Scanner;
class assert_num_reverse{
public static void main(String []args){
	Scanner a=new Scanner(System.in);
	try{
		System.out.println("Enter the number : ");
		int num=a.nextInt();
		System.out.println(numrev(num));
		assertTrue(4321==numrev(num));
	}
	catch (Exception e){
		System.out.println("Enter the integer number only");
	}
}
public static int numrev(int num){
	int rev=0;
	while(num!=0){
		int rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	return rev;
}
}
