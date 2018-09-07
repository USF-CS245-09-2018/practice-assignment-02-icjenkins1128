// binary is faster for larger arrays

public class BinaryRecursiveSearch implements Practice2Search{

	// public static void main(String[] args) {
	// 	int[] someArray = {1,2,3,4};
	// 	System.out.println(search(someArray,4));
		
	// }

	public String searchName(){

		return "Binary recursive";
	}

	public int search(int [] arr, int target) {

		//runs the helper method for the binary search
        return search(arr, target, 0, arr.length - 1);


	}

	public int search(int[] a, int target, int low, int upper) {

		if(low > upper){

			return -1;

		}

		int mid = ((upper + low)) / 2;


		if(a[mid] == target){

			return mid;

		}else if(a[mid] < target) {

			return search(a, target, mid + 1, upper);

		}else{

			return search(a, target, low, mid - 1);

		}
		
	}


}