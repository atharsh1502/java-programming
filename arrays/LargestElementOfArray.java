import java.util.Arrays;

public class LargestElementOfArray {
    public static void main(String[] args) {
        int arr[] = {1,3,6,4,2,5};
        int n = arr.length;

        //Approach 1: Using a variable to keep track of the largest element
        // Time complexity: O(n)
        // Space complexity: O(1)
        int max= arr[0];
        for(int i:arr){
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Largest element in the array is: " + max);

        //Approach 2: Sorting the array and returning the last element
        // Time complexity: O(n log n)
        // Space complexity: O(1) or O(n) depending on the sorting algorithm used
        Arrays.sort(arr);
        System.out.println("Largest element in the array is: " + arr[n-1]);

        //Approach 3: Using Java Streams
        // Time complexity: O(n)
        // Space complexity: O(1)
        int maxEle = Arrays.stream(arr)
                        .max()
                        .getAsInt();
        System.out.println("Largest element in the array is: " + maxEle);
    }
}