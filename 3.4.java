import java.util.Scanner;
public class Oper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Vvedite chislo: ");
		float a=sc.nextFloat();
		Scanner sc1=new Scanner(System.in);
		System.out.println("Vvedite chislo: ");
		float b=sc1.nextFloat();
		Scanner sc2=new Scanner(System.in);
		String k;
		System.out.println("Vvedite znak: ");
        k = sc2.nextLine();
		System.out.println("Vvedite znak: ");
		//String k=sc2;//.nextChar();
switch (k)
{
case "+": { float A=a+b;
System.out.println(A);
}

case "-": { float B=a-b;
System.out.println(B);
}
case "*": { float C=a*b;
System.out.println(C);
}

case "/": { float D=a/b;
System.out.println(D);
}

}

	}

}
