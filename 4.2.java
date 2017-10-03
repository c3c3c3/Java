import java.util.Scanner;
public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Vvedite chislo: ");
		int A=sc.nextInt();
		int k;
		int res=1;
		for (k=1; k<=A; k++)
		{
			res=res*k;
		}
		System.out.println(res);

	}

}
