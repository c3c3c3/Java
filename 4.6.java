import java.util.Scanner;
public class Delit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Vvedite chislo: ");
		int N=sc.nextInt();
		int X=Math.abs(N);
		for (int i=1; i<=X; i++)
		{ if (N%i==0)
		{System.out.println("Nat. del.:  " + i);}
		}
		

	}

}
