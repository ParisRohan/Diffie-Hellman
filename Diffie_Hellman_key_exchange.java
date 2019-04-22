import java.util.Scanner;
import java.lang.Math;

public class Diffie_Hellman_key_exchange 
{
	public double U1_compute(double P,double Q,double a)
	{
		double R=Math.pow(Q, a)%P;	
		return R;
	}
	public double U2_compute(double P,double Q,double b)
	{
		double S=Math.pow(Q, b)%P;
		return S;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("*********Diffie-Hellman Key exchange*********** ");
		Diffie_Hellman_key_exchange K =new Diffie_Hellman_key_exchange();
		Scanner sc=new Scanner(System.in);
		double P,Q,a,b;
		double R,S,R1,S1;
		System.out.println("Please enter 2 prime numbers \n");
		P=sc.nextDouble();
		Q=sc.nextDouble();
		System.out.println("Please enter secret number chosen by U1 \n");
		a=sc.nextInt();
		System.out.println("Please enter secret number chosen by U2 \n");
		b=sc.nextInt();
		R=K.U1_compute(P,Q,a);
		S=K.U2_compute(P,Q,b);
		//U1 and U2 exchange R and S respectively
		R1=K.U1_compute(P,S,a);
		S1=K.U2_compute(P,R,b);
		if(R1==S1)
			System.out.println("Successful exchange of key.\n Symmetric key = "+R1);
		else
			System.out.println("Some error occured. Please try again :(");
	}
}

/*
	******THEORY*********
	U1-> R=Q^a mod P ;
	U2-> S=Q^b mod P ;

	Exchange R and S;

	U1-> R1=S^a mod P;
	U2-> S1=R^b mod P;

	if(R1==S1)
		SUCCESS. Can continue communication.
	else
		FAILURE. Try again :(
*/