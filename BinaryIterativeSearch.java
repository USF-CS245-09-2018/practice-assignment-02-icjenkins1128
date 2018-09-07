// linear is faster for shorter arrarys

public class BinaryIterativeSearch implements Practice2Search{

	// public static void main(String[] args) {
	// 	int[] someArray = {1,2,3,4};
	// 	System.out.println(search(someArray,3));
	// }

	public String searchName(){

		return "Binary iterative";
	}

	public int search(int[] arr, int target) {

		return search(arr, target, 0, arr.length - 1);

	}

	public int search(int[] a, int target, int low, int upper) {

		while(low <= upper){

			int mid = ((upper + low)) / 2;

			if(a[mid] == target) {

				return mid;

			}else if(a[mid] < target) {

				upper = mid - 1;

				

			}else if(a[mid] > target){

				low = mid + 1;

			}

		}

		return -1;

	}


}