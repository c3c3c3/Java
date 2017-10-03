import java.util.Scanner;
public class Tri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Vvedite 1 chislo: ");
		float a=sc.nextFloat();
		Scanner sc1=new Scanner(System.in);
		System.out.println("Vvedite 2 chislo: ");
		float b=sc1.nextFloat();
		Scanner sc2=new Scanner(System.in);
		System.out.println("Vvedite 3 chislo: ");
		float c=sc2.nextFloat();
		if (((a+b)>c)&((b+c)>a)&&((a+c)>b))
		{System.out.println("YES!");
		}	
		else {System.out.println("We're sorry:(");}}

}
