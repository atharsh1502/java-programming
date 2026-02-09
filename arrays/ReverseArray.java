public class ReverseArray {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};
        int n=arr.length;

        //Approach 1: Using an extra array
        // Time complexity: O(n)
        // Space complexity: O(n)
        int[] newArr= new int[n];
        for (int i=0; i<n; i++){
            newArr[n-(i+1)]=arr[i];
        }
        for(int i=0; i<n; i++){
            System.out.print(newArr[i] + "");
        }
        System.out.println();

        //Approach 2: Using two pointers
        // Time complexity: O(n)
        // Space complexity: O(1)
        int left = 0;
        int right = n-1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for(int num: arr){ //enhanced for loop - forEach loop
            System.out.print(num + "");
        }
    }
}