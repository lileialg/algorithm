
public class SingleNumber1 {
	
	
	public static int singleNumber(int[] array){
		int result = 0;
		
		for(int v:array)
			result = result ^ v;
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[]{1,2,3,3,2,1,4};
		
		System.out.println(singleNumber(array));
	}

}
