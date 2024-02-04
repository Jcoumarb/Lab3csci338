public class OneLoop{

	public static void main(String [] args){
		int [] arr1 = {1, 2, 3, 4, 5};
		int [] arr2 = {1, 2, 3, 2, 4};
		int [] arr3 = {2, 6, 4, 10, 5};

		System.out.println("Array 1 contains at least one pair: " + pairCheck(arr1));
		System.out.println("Array 2 contains at least one pair: " + pairCheck(arr2));
		System.out.println("Array 3 contains at least one pair: " + pairCheck(arr3));
	}

	public static boolean pairCheck(int [] nums){
		for(int i = 0; i < nums.length; i++){
			for(int j = i+1; j < nums.length; j++){
				if(nums[i] == nums[j]) return true;
			}
		}

		return false;
	}
}
