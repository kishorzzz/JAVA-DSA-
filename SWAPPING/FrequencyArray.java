package SWAPPING;
// import java.util.Arrays;
import java.util.Scanner;

public class FrequencyArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        
        try (Scanner input = new Scanner(System.in)) {
            int[] freqArr = frequencyArr(arr);
            
            System.out.println("Enter the number of queries (positive number):");
            int q = input.nextInt();
            
            if (q <= 0) {
                System.out.println("Please enter a positive number of queries.");
                return;
            }
            
            while (q > 0) {
                System.out.print("Enter element to be Searched: ");
                int key = input.nextInt();
                if (key >= 0 && key < freqArr.length && freqArr[key] > 0) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
                q--;
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    static int[] frequencyArr(int[] arr) {
        // Find the maximum and minimum element
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (int num : arr) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        
        // Check if array contains negative numbers
        if (min < 0) {
            throw new IllegalArgumentException("Array contains negative numbers which are not supported");
        }
        
        int[] freqArr = new int[max + 1];
        for (int num : arr) {
            freqArr[num]++;
        }
        return freqArr;
    }
}
