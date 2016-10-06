package a2;

import java.util.Random;

public class Lcm {

	public static void main(String[] args) {

		
		Random rand = new Random();
		
		int a = rand.nextInt(100);
		
		int b = rand.nextInt(100);
		
		int c = lcm(a,b);
		
		System.out.println(a+","+b+"==>>>"+ c);
	}
	
	
	public static int lcm(int a,int b){
		
		int a1 = a;
		int b1 = b;
		
		int n = a1 % b1;
		
		while(n != 0)
		{
			a1 = b1;
			
			b1 = n;
			
			n = a1 % b1;
		}
		
		return a * b / b1;
		
	}

}
