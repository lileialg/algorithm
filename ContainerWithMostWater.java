package chapter3;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static int[] getMosterWaterLine(int[] array){
		
		if (array == null || array.length == 0)
			return null;
		
		int[] lines = new int[2];
		
		int maxValue = Integer.MIN_VALUE;
		
		for(int i=0;i<array.length-1;i++){
			
			for(int j=1;j<array.length;j++){
				int minHeight = Math.min(array[i], array[j]);
				
				int cont = minHeight * (j - i);
				
				if (cont > maxValue){
					maxValue = cont;
					lines[0] = i;
					lines[1] = j;
				}
			}
			
		}
		
		return lines;
		
		
	}

}
