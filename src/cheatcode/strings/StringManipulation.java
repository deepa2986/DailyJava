package cheatcode.strings;

public class StringManipulation {

    private String s;

    public StringManipulation(String s){
        this.s = s;
    }

    public  char[] toCharArray(){
        return s.toCharArray();
    }

    public char getCharAtIndex(int index){
        return toCharArray()[index];
    }
    public  void modifyCharAtIndex(int index,char newChar) {
        char[] chars = toCharArray();
        chars[index] = newChar;
    }

    public String toStringFromCharArray(char[] chars){
        return String.valueOf(chars);
    }
}
