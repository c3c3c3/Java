import java.util.Scanner;
public class Kvadur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	      System.out.println("Starshiy koeff:");
	      double a = sc.nextFloat();
	      Scanner sc1 = new Scanner(System.in);
	      System.out.println("Sredniy koeff:");
	      double b = sc1.nextFloat();
	      Scanner sc2 = new Scanner(System.in);
	      System.out.println("Svobodniy chlen:");
	      double c = sc2.nextFloat();
	      double D=b*b-(4*a*c);
	      double z=Math.sqrt(D);
	      double X1=(-b-z)/2*a;
	      double X2=(-b+z)/2*a;
	      System.out.print("Korni kv. ur.: " + X1 + ":" + X2);
	}

}
