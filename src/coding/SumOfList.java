package coding;

import java.util.*;

class SumListImpl{
	
 static public  int sum(List<Integer> list) {
		 int sum  = 0;
		
		for(Integer x : list) {
			sum+=x;
		}
		return sum;
		
	}
	
}

public class SumOfList {

	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		Integer x = SumListImpl.sum(list);
		System.out.println(x);
	}
}
