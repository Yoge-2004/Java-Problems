/* Array Problems */

//Importing necessary libraries
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

class ArrayProblems {
    //Finding 3rd largest number in the given array.
    int thirdLargestNumber (int arr[]) {
        int chances = 3, max = -99999;
        while (chances > 0) {
            max = -99999;
            int i = 0;
            for (; i < arr.length;) {
                if (max < arr[i]) {
                    max = arr[i];
                }
                i++;
            }
            
            find_delete(arr, max);
            chances--;
        }
        return max;
    }
    
    //Finding the sum of first 2 largest numbers.
    int twoLargestNumberSum (int arr[]) {
        int chances = 2, sum = 0, max = -99999;
        while (chances > 0) {
            max = -99999;
            int i = 0;
            for (;i < arr.length;) {
                if (max < arr[i]) {
                    max = arr[i];
                }
                i++;
            }
            
            sum += max;
            find_delete(arr, max);
            chances--;
        }
        return sum;
    }
    
    //Finding max element and simulating delete operation by hardcoring a value.
    void find_delete (int arr[], int max) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = -99999;
                break;
            }
        }
    }

    //Finding Leader Elements of the array.
    void ArrayLeader (int arr[]) {
        ArrayList <Integer> LeaderArray = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] >= arr[j]){
                    flag = true;
                }
                else {
                    flag = false;
                }
            }
            if (flag) {
                LeaderArray.add(arr[i]);
            }
        }
        LeaderArray.add(arr[arr.length-1]);
        System.out.println("Leader Elements are: " + Arrays.toString(LeaderArray.toArray()));
    }
}

}
