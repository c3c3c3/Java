import java.util.Scanner;

public class Garm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
System.out.println(" Vvedite kol-vo chlenov: ");
int N=sc.nextInt();
double S;
if (N<1)
{ System.out.println("ERROR!");}
else
{
	S=0;
	int i;
	for (i=1; i<=N; i++)
	{
	S=S+(1./i);
	}
	System.out.println(S);

}


	}

}
