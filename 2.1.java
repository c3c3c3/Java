package var1;
import java.util.Scanner;
public class Div {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
	      System.out.println("Vvedite a: ");
	      float a = sc.nextInt();
	      
	      //System.out.println("Vi vveli:" + a);
	      Scanner sc1 = new Scanner(System.in);
	      System.out.println("Vevdte b: ");
	      float b = sc1.nextInt();
	      float x=-b/a;
	      if (a==0) 
	      {
	    	  System.out.println("ERROR!!!"); 
	      }
	      else
	      {
	      System.out.println("Koren' ax+b=0 raven: " + x);
	      sc.close();

	}}

}
