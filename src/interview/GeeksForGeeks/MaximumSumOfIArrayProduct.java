package interview.GeeksForGeeks;
/* https://www.geeksforgeeks.org/maximum-sum-iarri-among-rotations-given-array/
Compute sum of all values. We don't
    // actually rotation the array, but compute
    // sum by finding ndexes when arr[i] is
    // first element
    Input: arr[] = {8, 3, 1, 2}
Output: 29
Explanation: Lets look at all the rotations,
{8, 3, 1, 2} = 8*0 + 3*1 + 1*2 + 2*3 = 11
{3, 1, 2, 8} = 3*0 + 1*1 + 2*2 + 8*3 = 29
{1, 2, 8, 3} = 1*0 + 2*1 + 8*2 + 3*3 = 27
{2, 8, 3, 1} = 2*0 + 8*1 + 3*2 + 1*3 = 17

 */
public class MaximumSumOfIArrayProduct {
    public static void main(String[] args) {

        int array[] = {8, 3, 1, 2};
        int n = array.length;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {    int sum =0;
            for (int j = 0; j < n; j++) {
                int index = (i + j) % n;

                sum= sum + j*array[index];
            }
            maxSum=Math.max(maxSum,sum);
        }
        System.out.println(maxSum);
    }
}
