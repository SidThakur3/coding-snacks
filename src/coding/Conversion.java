package coding;

import java.util.*;

public class Conversion {
	public static void main(String args[]) {
		
		//Initializing array
		Integer [] arr = new Integer[]{1,2,3,4,5,5};
		
		// Converting array to list
		List<Integer> arr_list = new ArrayList<>();
		arr_list=Arrays.asList(arr);
			
		// Initializing set
		Set<Integer> arr_set = new HashSet<>();
		
		// Adding values to set
		for(Integer x :arr) {
			arr_set.add(x);				
		}
		
		//Initializing map
		Map<Integer,String> map = new LinkedHashMap<>();
		map.put(1, "Sid");
		
		System.out.println(Arrays.toString(arr));
		System.out.println(arr_list);
		System.out.println(arr_set);
		System.out.println(map);
		
		}
	
}
