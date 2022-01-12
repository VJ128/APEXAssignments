package apex.com.dss;
//4.Find the contiguous sub array within an array which has the largest sum.
public class ContiguousSubArrayLargestSum {
		public static int findMaxSubarraySum(int arr[]) {
				         //Assign first value of an array
				         int maxSum = arr[0];
				         int sum = arr[0];
				          //Traverse an array
				         for(int i = 1; i < arr.length; i++) {
				                if(sum < 0) {
				                sum = arr[i];
				             } else {
				                sum = sum + arr[i];
				             }
				             //get maxsum
				             maxSum = Math.max(sum, maxSum);
				        }
				         return maxSum;
				   }
			public static void main(String[] args) {
				int [] arr= {-2,-3,4,-1,-2,1,5,-3};
				System.out.println(findMaxSubarraySum(arr));
			}	
		}