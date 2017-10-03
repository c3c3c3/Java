import java.util.Scanner;
import java.util.Random;
public class Dmass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Stroki: ");
		int m=sc.nextInt();
		//sc.close();
		Scanner sc1=new Scanner(System.in);
		System.out.println("Stolbi: ");
		int n=sc1.nextInt();
		//sc1.close();
		int S=0;
		int[][] mas=new int[m][n];
		Random rand=new Random();
		for (int i=0; i<m; i++)
			for (int j=0; j<n; j++)
			{	mas[i][j]=rand.nextInt(100);
			System.out.println(mas[i][j]);
		if (mas[i][j]!=0)
		{
			S=S+mas[i][j];
			
		}
			}
		System.out.println("Summa: " + S);
	}

}
