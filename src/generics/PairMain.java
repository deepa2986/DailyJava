package generics;

public class PairMain {

    public static void main(String[] args) {
        Pair<String> namePair = new Pair<>("gia","jonas");
        Pair<Integer> agePair = new Pair<>(34,41);
        String first = namePair.getFirst();
        System.out.println(first);
        Integer second = agePair.getSecond();
        System.out.println(second);
    }
}
