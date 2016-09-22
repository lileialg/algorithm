package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dijkstra {
	
	public static class Record{
		private String key;
		
		private int len;
		
		private List<String> path;
		
		public Record(String key, int len, List<String> path, boolean isChoose) {
			this.key = key;
			this.len = len;
			this.path = path;
			this.isChoose = isChoose;
		}

		private boolean isChoose = false;

		public String getKey() {
			return key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public int getLen() {
			return len;
		}

		public void setLen(int len) {
			this.len = len;
		}

		public List<String> getPath() {
			return path;
		}

		public void setPath(List<String> path) {
			this.path = path;
		}

		public boolean isChoose() {
			return isChoose;
		}

		public void setChoose(boolean isChoose) {
			this.isChoose = isChoose;
		}
		
	}


	public static void main(String[] args) {
		
		Map<String,Record> records = new HashMap<String,Record>();

		Map<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("AB", 100);
		
		map.put("BC", 10);
		
		map.put("AD", 70);
		
		map.put("DC", 80);
		
		List<String> verts = new ArrayList<String>();
		
		verts.add("B");
		
		verts.add("C");
		
		verts.add("D");
		
		//init
		for(String v : verts){
			
			
			List<String> path = new ArrayList<String>();
			
			String p = map.containsKey("A"+v)?"A":null;
			
			if (p != null){
				path.add(p);
				path.add(v);
			}
			
			int len = map.containsKey("A"+v)?map.get("A"+v):-1;
			
			Record r = new Record(v,len,path,false);
			
			records.put(v, r);
			
		}
		
		while(true){
			//find min
			Record res = null;
			
			
			for(Record r : records.values()){
				if (!r.isChoose() && r.getLen() != -1){
					
					if (res!= null){
						if (res.getLen()> r.getLen()){
							res = r;
						}
					}else{
						res = r;
					}
				}
			}
			
			if (res == null){
				break;
			}else{
				res.setChoose(true);
				
				for(String v : verts){
					if (map.containsKey(res.getKey()+v)){
						int len = records.get(v).getLen();
						
						if (len !=-1){
							
							if (map.get(res.getKey()+v)+res.getLen()<len){
								Record r = records.get(v);
								
								r.setLen(map.get(res.getKey()+v)+res.getLen());
								
								List<String> p = r.getPath();
								
								p.clear();
								
								for(String vt : res.getPath()){
									p.add(vt);
								}
								
								
								p.add(v);
								
							}
							
						}else{
							
							Record r = records.get(v);
							
							r.setLen(map.get(res.getKey()+v)+res.getLen());
							
							List<String> p = r.getPath();
							
							for(String vt : res.getPath()){
								p.add(vt);
							}
							p.add(v);
							
						}
					}
				}
			}
			
			
		}
		
		for(Record r : records.values()){
			
			System.out.println("Length:"+r.getLen());
			
			for(String p : r.getPath()){
				System.out.print(p+"->");
			}
			
			System.out.println("\n----------------------------");
		}
	}

}
