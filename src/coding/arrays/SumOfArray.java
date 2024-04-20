package coding.arrays;

class SumLogic {

	public Integer returnSum(Integer[] arr) {
		Integer sum = 0;

		for (Integer x : arr) {
			sum = sum + x;
		}

		return sum;
	}

}

public class SumOfArray {

	public static void main(String args[]) {

		Integer[] arr = new Integer[] { 1, 2, 3, 4, 5 };

		SumLogic obj = new SumLogic();
		Integer x = obj.returnSum(arr);

		System.out.println(x);

	}

}
