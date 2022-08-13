import java.util.Scanner;
import java.util.*;

public class Main{
	public static void main(String[] args){
	    Scanner scanner=new Scanner(System.in);
	    System.out.println("Principle: ");
	    int principle = scanner.nextInt();
	    System.out.println("Annual interest rate: ");
	    float AIR= scanner.nextFloat();
	    System.out.println("Period");
	    int period = scanner.nextInt();
	    
	    float R= (AIR/100)/12;
	    int N=12*period;                                 //mortgage calculator project!!!
	    double Q=Math.pow(1+R,N);
	    double M=(principle*Q*R)/(Q-1);
	  
	    System.out.println("Mortgage: "+"$"+M);
	    
	    
	    
	    
	}
	
}
