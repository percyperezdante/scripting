/**
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0?
 * Find all unique triplets in the array which gives the sum of zero.
 * Note: Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)
 * The solution set must not contain duplicate triplets.
 * For example, given array S = {-1 0 1 2 -1 -4},
 * A solution set is:
 * (-1, 0, 1)
 * (-1, -1, 2)
 *
 */

import java.util.Arrays; 

public class SumThree {

	public static void main(String[] args) {
		int[] arr = new int[]{-1,0,1,2,-1,-4};

		sumThreeToZero(arr);
	}


	/**
	 * The algorithm compares whether the lower numbers and the upper
	 * numbers are equal.  Key note is the Arrays.sort(arr)
	 */
	public static String sumThreeToZero(int[] arr){
		
		Arrays.sort(arr);
		for( int i=0;i<arr.length-2;i++){
			if(i==0||arr[i]>arr[i-1]){ // This remove consecutive equal numbers. Duplicates.
				int low=i+1;
				int up=arr.length-1;

				while(low<up){
					if(arr[i]+arr[low] == -arr[up]){
						System.out.println(i+","+low+","+up+":");
						System.out.println(arr[i]+","+arr[low]+","+arr[up]);
						low++;
						up--;
						// removing duplicates
						// TODO: I do not understand why the below is needed.
						while(low<up && arr[low] == arr[low-1]){
							low++;
						}
						while (low<up && arr[up] == arr[up+1]){
							up--;
						}

					} else if(arr[i]+arr[low]>arr[up]){
						low++;
					} else {
						up--;
					}
				}
			}
		}
		return "0";
	}
}
