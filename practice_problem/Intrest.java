import java.util.*;
public class Intrest
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    double principal = sc.nextInt();
	    double Rate = sc.nextInt();
	    double Time = sc.nextInt();
	    double simple_Intrest = (principal*Rate*Time)/100;
	    System.out.print(simple_Intrest);
	}
}
