package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class BfsApp {

	public void bfs(MyGraph mg){
		Queue<Integer> queue = new LinkedList<Integer>();
		
		List<MyGraph.Vertex> list = new ArrayList<MyGraph.Vertex>();
		
		queue.offer(0);
		
		MyGraph.Vertex vertex = mg.getVertex(0);
		
		vertex.isVisit = true;
		
		list.add(vertex);
		
		while(!queue.isEmpty()){
			
			int pos = queue.poll();
			
			int v;
			
			while((v = mg.getAdjUnvisitVertex(pos))!=-1){
				
				queue.offer(v);
				
				vertex = mg.getVertex(v);
				
				vertex.isVisit = true;
				
				list.add(vertex);
				
			}
			
		}

		for(MyGraph.Vertex v:list){
			System.out.print(v.label+",");
		}
	}
	
}
