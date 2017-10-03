import java.util.Scanner;
public class Procent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Vevdite chislo: ");
float X=sc.nextFloat();
Scanner sc1=new Scanner(System.in);
System.out.println("Procent: ");
float A=sc1.nextFloat();
float R=A*X/100;
System.out.println("Otvet: " + R);
sc.close();
	
	}

}
