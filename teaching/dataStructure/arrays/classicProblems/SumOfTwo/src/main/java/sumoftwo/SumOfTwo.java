
/**
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add
 * up to the target, where index1 must be less than index2. Please note that your returned
 * answers (both index1 and index2) are not zero-based.
 * For example:
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=0, index2=1
 *
 */

import java.util.HashMap;

public class SumOfTwo {

	public static void main(String[] args) {
		// 
		// In the case the arr is not ordered
		// 
		int[] arr = new int[]{6,2,3,4,5};
		int total =8;
		System.out.println("1. Print two indexes that sum "+ total+ " : "+ getIndexes(arr,total));
		System.out.println("2. Print two indexes that sum "+ total+ " : "+ getIndexesMetho2(arr,total));

		// 
		// In the case the array is ordered
		//
		arr=new int[]{1,3,4,5,6};
		System.out.println("3. Print two indexes that sum "+ total+ " : "+ getIndexesOrdered(arr,total));

	}

	// This methos is O(n*n)
	public static String getIndexes(int[] arr, int total){
		Boolean finished=false;
		String indexes="";
		for (int i=0;i<arr.length-1 && (!finished) ;i++){
			for(int j=i+1;j<arr.length && (!finished);j++){
				if(arr[i]+arr[j]==total){
					 indexes = i + "," +j + "= "+arr[i]+ "+"+arr[j];
					 finished=true;
				}
			}
		}
		return indexes;
	}

	// This method is O(n)
	//  NOTE: Hashmaps does not allow int, it requries Integer
	public static String getIndexesMetho2(int[] arr, int total){
		int diff=0;
		int index1=0,index2=0;
		HashMap<Integer, Integer> map = new HashMap<>();

		for(int i=0;i<arr.length;i++){
			if(map.containsKey(arr[i])){
				index1=map.get(arr[i]);
				index2=i;
				break;
			}else{
			    diff=total-arr[i];	
				map.put(diff,i);
			}
		}
		return (index1+","+index2+"="+arr[index1]+"+"+arr[index2]);
	}

	// This requires have an ordered array
	public static String getIndexesOrdered(int[] arr, int total ){
		int lower=0, upper=arr.length-1;
		while(lower<upper){
			if ( arr[lower] + arr[upper] < total){
				lower++;
			} else if (arr[lower] + arr[upper] >total ){
				upper--;
			} else {
				return lower+","+upper;
			}
		}
		return null;
	}
}
