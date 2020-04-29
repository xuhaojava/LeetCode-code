import java.util.Arrays;

public class Question455 {
    public int findContentChildren(int[] g, int[] s) {
        if(g == null || s == null){
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);
        int gnum = 0,snum = 0;
        while(gnum < g.length && snum < s.length){
            if(g[gnum] <= s[snum]){
                gnum++;
            }
            snum++;
        }
        return gnum;
    }
}
