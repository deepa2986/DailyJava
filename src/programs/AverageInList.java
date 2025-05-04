package programs;

import java.util.Arrays;
import java.util.List;

public class AverageInList {

    public static void main(String[] args) {

        List<Integer> source = Arrays.asList(1,2,3,4,5,6,7);
        double average = getAverage(source);
        System.out.println(average);
    }

    static double getAverage(List<Integer> source){
        if(source == null && source.isEmpty()){
            return 0;
        }
        return source.stream().reduce(0,Integer::sum)/source.size();
    }
}
