import java.text.NumberFormat;
public class Main
{
	public static void main(String[] args) {
		
	 NumberFormat currency= NumberFormat.getPercentInstance();//formattin numbers.
	 String result= currency.format(0.1);
	 System.out.println(result);
		
		
	}
	
}
