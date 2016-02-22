// 2. รับชื่อนามสกุล เป็นภาษาอังกฤษ แล้วมาเช็คว่า ชื่อนามสกุลมีสระกี่ตัว
import java.util.Scanner;
public class Hw_02 
{
	public static void main(String[] args) 
	{
		String name;
		Scanner n = new Scanner(System.in);
		System.out.print("Enter Name : ");		
		name = n.nextLine();
		System.out.println("Your Name is : " + name);
	    int count = 0;
	    for (int i = 0; i < name.length(); i++) 
	      {
	         if(name.charAt(i) == 'A' || name.charAt(i) == 'a' || 
	        	name.charAt(i) == 'E' || name.charAt(i) == 'e' ||
	            name.charAt(i) == 'I' || name.charAt(i) == 'i' || 
	            name.charAt(i) == 'O' || name.charAt(i) == 'o' ||  
	            name.charAt(i) == 'U' || name.charAt(i) == 'u' ) 
	         {
	            count++;
	         }
	      }	
	      System.out.println("Number of  AEIOU :  " + count); 
	   }
}