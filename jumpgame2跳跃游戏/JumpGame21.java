package chapter3;

public class JumpGame21 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		int[] array = new int[]{2,3,1,1,0,4};
		
		System.out.println(jumpGame(array));
	}
	
	
	
	
	public static int jumpGame(int[] array) throws Exception{
		int count = 0;
		
		int lastPos = 0;
		
		int maxStep = 0;
		//每一步都找出最远可达点
		for(int i=0;i<array.length-1;){
			
			
			for(int j=lastPos;j<=i;j++){
				maxStep = Math.max(maxStep, array[j]+j);
			}
			
			if (maxStep == i)
				throw new Exception("no count......");
			
			lastPos = i;
			
			i = maxStep;
			
			count++;
			
		}
		
		return count;
		
	}

}
