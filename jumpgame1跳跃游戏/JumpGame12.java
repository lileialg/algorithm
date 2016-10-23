package chapter3;

public class JumpGame12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[]{2,3,0,0,1,4};
		
		System.out.println(jumpGame(array,0));
	}

	
	
	public static boolean jumpGame(int[] array,int pos){
		
		
		
		if (pos + array[pos]>=array.length-1){
			return true;
		}else{
			for(int i=1;i<=array[pos];i++){
				if (jumpGame(array,pos+i)){
					return true;
				}
			}
		}
		
		return false;
		
	}
}
