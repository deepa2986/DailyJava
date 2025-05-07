package strings;

public class VowelsCount {

    public static void main(String[] args) {
        String s = "Hello";
        String vowels = "aeiouy";
        int countVowels = countVowels(s, vowels);
        System.out.println(countVowels);

        int countVowelsJava8 = countVowelsJava8(s, vowels);
        System.out.println(countVowelsJava8);
    }

    static int countVowels(String s,String vowels){
        int count = 0;
        String normalized = s.toLowerCase().trim();
        for(char c : normalized.toCharArray()){
            if(vowels.indexOf(c) != -1){
                count++;
            }
        }
        return count;
    }

    static int countVowelsJava8(String s,String vowels){
        String normalized = s.toLowerCase().trim();
        return (int) normalized
                .chars()
                .filter(c -> vowels.indexOf(c) != -1)
                .count();
    }
}
