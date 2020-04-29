public class Question459 {
    public boolean repeatedSubstringPattern(String s) {
        String S = s + s;
        return S.substring(1,S.length()-1).contains(s);
    }
}
