import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Question500 {
    public String[] findWords(String[] words) {
        HashMap<Character,Integer> map = new HashMap();
        map.put('Q',0);map.put('q',0);map.put('W',0);map.put('w',0);map.put('E',0);map.put('e',0);
        map.put('R',0);map.put('r',0);map.put('T',0);map.put('t',0);map.put('Y',0);map.put('y',0);
        map.put('U',0);map.put('u',0);map.put('I',0);map.put('i',0);map.put('O',0);map.put('o',0);
        map.put('P',0);map.put('p',0);
        map.put('A',1);map.put('a',1);map.put('S',1);map.put('s',1);map.put('D',1);map.put('d',1);
        map.put('F',1);map.put('f',1);map.put('G',1);map.put('g',1);map.put('H',1);map.put('h',1);
        map.put('J',1);map.put('j',1);map.put('K',1);map.put('k',1);map.put('L',1);map.put('l',1);
        map.put('Z',2);map.put('z',2);map.put('X',2);map.put('x',2);map.put('C',2);map.put('c',2);
        map.put('V',2);map.put('v',2);map.put('B',2);map.put('b',2);map.put('N',2);map.put('n',2);
        map.put('M',2);map.put('m',2);
        List<String> list = new ArrayList();
        for(String s : words){
            boolean flag = true;
            for(int i = 0;i<s.length()-1;i++){
                if(map.get(s.charAt(i))!=map.get(s.charAt(i+1))){
                    flag = false;
                    break;
                }
            }
            if(flag){
                list.add(s);
            }
        }
        String string[] = new String[list.size()];
        return list.toArray(string);
    }
}
