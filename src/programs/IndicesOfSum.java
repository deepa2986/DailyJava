package programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IndicesOfSum {

    public static void main(String[] args) {
        List<Integer> source = Arrays.asList(7,17,13,19,55);
        int targetSum = 24;
        List<Integer> indices = getIndices(source, targetSum);
        System.out.println(indices);
    }

    public static List<Integer> getIndices(List<Integer> source, int target){
        Map<Integer,Integer> sourceMap = new HashMap<>();
        for(int i = 0; i < source.size(); i++){
            sourceMap.put(source.get(i),i);
        }
        for (int i = 0; i < source.size(); i++){
            int solutionNumber = target - source.get(i);
            if(sourceMap.containsKey(solutionNumber) && sourceMap.get(solutionNumber) != i){
                return Arrays.asList(i,sourceMap.get(solutionNumber));
            }
        }
        return Arrays.asList(-1,-1);
    }
}
