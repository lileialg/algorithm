package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DfsApp {
	
	public void dfs(MyGraph mg){
		
		List<MyGraph.Vertex> list = new ArrayList<MyGraph.Vertex>();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(0);
		
		MyGraph.Vertex vertex = mg.getVertex(0);
		
		vertex.isVisit = true;
		
		list.add(vertex);
		
		while(!stack.isEmpty()){
			
			int pos = mg.getAdjUnvisitVertex(stack.peek());
			
			if (-1 != pos){
				
				stack.push(pos);
				
				vertex = mg.getVertex(pos);
				
				vertex.isVisit = true;
				
				list.add(vertex);
				
				
			}else{
				
				stack.pop();
			}
			
		}
		
		for(MyGraph.Vertex v:list){
			System.out.print(v.label+",");
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
