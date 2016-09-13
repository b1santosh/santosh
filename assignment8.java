import java.util.Scanner;
public class assignment8 {
public static void main(String[] arg)
{
	Scanner x=new Scanner(System.in);
	System.out.println("input  number1");
	int a = x.nextInt();
	System.out.println("input  number2");
	int b = x.nextInt();
	System.out.println("input  number3");
	int c = x.nextInt();
	System.out.print("Largest no is:= ");
	if((a>=b) && (a>=c)) System.out.println(a);
	if((b>=a) && (b>=c)) System.out.println(b);
	if((c>=a) && (c>=b)) System.out.println(c);
}
}

