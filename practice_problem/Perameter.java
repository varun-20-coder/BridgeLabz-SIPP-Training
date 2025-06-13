import java.util.*;
public class Perameter
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    double length = sc.nextInt();
	    double width = sc.nextInt();
	    double perameter = 2 *(length + width);
	    
	    System.out.print(perameter);
	}
}