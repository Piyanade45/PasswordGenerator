package passwordGenerator;
import java.util.*;
public class Main {
	
    public static final Scanner sc = new Scanner(System.in);
    
	public static void main(String[] args) {
       Generator g = new Generator();
       g.mainLoop();
       
       sc.close();
	}

}
