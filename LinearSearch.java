// binary is faster for larger arrays

public class LinearSearch implements Practice2Search{

	// public static void main(String[] args) {

	// 	int[] someArray = {1,2,3,4};
	// 	System.out.println(search(someArray,2));
	// }

	public String searchName(){

		return "Linear search";
	}

	//runs thelinear search
	public int search(int [] arr, int target) {

		for(int i = 0; i < arr.length; i ++){

			if(arr[i] == target){

				return i;

			}
		}

		return -1;
	}


}