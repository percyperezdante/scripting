

import java.util.HashMap;

class SumFindTotal{
	private HashMap<Integer, Integer> map = new HashMap<>();
	
	public void add(int value){
		if(map.containsKey(value)){
			map.put(value,map.get(value)+1);
		}else{
			map.put(value,1);
		}
		System.out.println(""+map);
	}

	public boolean find(int value){
		for(Integer i: map.keySet()){
			int diff = value - i;
			if(map.containsKey(diff)){
				return true;
			}
		}
		return false;
	}
}
