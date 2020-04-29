public class Question58 {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int length = 0;
        s = " "+s;
        int index = s.length()-1;
        while(s.charAt(index) != ' '){
            length++;
            index--;
        }
        return length;
    }
}
