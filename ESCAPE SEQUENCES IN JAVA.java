
public class Main {
	public static void main(String[] args) {
	    String message="hello \"mosh\"";
	                                          //escape sequence
	                                          //output:hello "mosh"
	    System.out.println(message);
		
		
		String message1="c:\\welcome\\...";  //adding back slash
		System.out.println(message1);     //output: c:\welcome\...
		
		String message2="c:\nwelcome\\...."; //backslash n adds a new line(\n)
		System.out.println(message2);        /*output: c:
		                                               welcome\....*/
		                                          
		                                          
		                                          //backslash t for tab(\t); 
		                                               
	}
}
