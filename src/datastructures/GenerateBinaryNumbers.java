package datastructures;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {

    public static void main(String[] args) {
        int n = 6;
        int[] result = generateBinaryNumbers(n);
        System.out.println(Arrays.toString(result));

        int[] res = generateBinaryNumbersByQueue(n);
        System.out.println(Arrays.toString(res));

    }
    
    static int[] generateBinaryNumbers(int n){
        int[] result = new int[n];
        if(n == 0){
            return result;
        }
        for(int i = 1; i <= n; i++){
            result[i - 1] = Integer.parseInt(Integer.toBinaryString(i));
        }
        return result;
    }

    static int[] generateBinaryNumbersByQueue(int n){
        int[] result = new int[n];
        if(n == 0){
            return result;
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        for(int i = 0; i < n; i++){
           int current = queue.remove();
           result[i] = current;
           queue.add(current * 10);
           queue.add(current * 10 + 1);
        }
        return result;
    }
}
