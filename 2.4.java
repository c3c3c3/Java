import java.util.Scanner;
public class Taylor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Tochka X0: \n");
		double X0=sc.nextFloat();
		double A=Math.pow(X0, 3);
		double B=Math.pow(X0, 5);
		double C=Math.pow(X0, 7);
		double arcsin=X0+(A/6)+((3*B)/40)+(0.003*C);
		System.out.println("Otvet: " + arcsin);
	}

}
