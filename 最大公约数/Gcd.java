package a2;

import java.util.Random;

public class Gcd {

	public static void main(String[] args) {

		
		Random rand = new Random();
		
		int a = rand.nextInt(100);
		
		int b = rand.nextInt(100);
		
		int c = gcd(a,b);
		
		System.out.println(a+","+b+"==>>>"+ c);
	}
	
	
	public static int gcd(int a,int b){
		
		int n = a % b;
		
		while(n != 0)
		{
			a = b;
			
			b = n;
			
			n = a % b;
		}
		
		return b;
		
	}

}
