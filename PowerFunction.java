//power implementation without using pre defined function
package DAAClass;//its my package
import java.util.*;//its a pre defined package which is used for taking input from keyboard in this program
public class PowerFunction//its my public class
{
	public static int power(int n,int p)//its a static function
	{
		int m=1;
		if(p>0)
		{
			m = n*power(n,p-1);//recursive calling 
		}
		return m;
	}//end function
	public static void main(String[] args)//static main function or method
	{
		Scanner buf = new Scanner(System.in);//its a predefined class for taking input 
		System.out.println("Enter the number:");
		int n = buf.nextInt();//take input 
		System.out.println("Enter the power of number:");
		int p = buf.nextInt();//take second input
		int x = power(n,p);//function calling
		System.out.print("So the ans of " +n+ " power "+p+" is: "+x);//print statement
	}//end main function
}//end class
//time complexity 0(n) in worst case
//0(1)in best case