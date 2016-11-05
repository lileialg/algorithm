package leetcode;

public class MyGraph {

	static class Vertex {
		char label;

		boolean isVisit;

		public Vertex(char label) {
			this.label = label;
		}
	}

	private int vertexSize;

	private Vertex[] vertexs;

	private int[][] adjMat;

	private int vertexNum = 0;

	public MyGraph(int vertexSize) {
		this.vertexSize = vertexSize;

		vertexs = new Vertex[this.vertexSize];

		adjMat = new int[this.vertexSize][this.vertexSize];
	}

	public void addVertex(char label) {
		vertexs[vertexNum++] = new Vertex(label);
	}

	public void addEdge(int start, int end) {
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}

	public int getAdjUnvisitVertex(int n) {

		for (int i = 0; i < vertexSize; i++) {
			if (adjMat[n][i] == 1 && !vertexs[i].isVisit)
				return i;
		}

		return -1;
	}
	
	public Vertex getVertex(int n){
		return vertexs[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size = 5;

		MyGraph mg = new MyGraph(size);

		mg.addVertex('A');
		mg.addVertex('B');
		mg.addVertex('C');
		mg.addVertex('D');
		mg.addVertex('E');

		// A
		mg.addEdge(0, 1);
		mg.addEdge(0, 3);
		mg.addEdge(0, 4);

		// B
		mg.addEdge(1, 0);
		mg.addEdge(1, 2);
		mg.addEdge(1, 3);
		mg.addEdge(1, 4);

		// C
		mg.addEdge(2, 1);
		mg.addEdge(2, 3);
		mg.addEdge(2, 4);

		// D
		mg.addEdge(3, 0);
		mg.addEdge(3, 1);
		mg.addEdge(3, 2);
		
		
		//E
		mg.addEdge(4, 0);
		mg.addEdge(4, 1);
		mg.addEdge(4, 2);
		
		
		DfsApp da = new DfsApp();
		
//		da.dfs(mg);
		
		BfsApp ba = new BfsApp();
		
		ba.bfs(mg);

	}

}
