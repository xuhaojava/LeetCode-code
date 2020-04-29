import java.util.Arrays;

public class Question593 {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int a[] = new int[6];
        a[0]=(p1[1]-p2[1])*(p1[1]-p2[1])+(p1[0]-p2[0])*(p1[0]-p2[0]);
        a[1]=(p1[1]-p3[1])*(p1[1]-p3[1])+(p1[0]-p3[0])*(p1[0]-p3[0]);
        a[2]=(p1[1]-p4[1])*(p1[1]-p4[1])+(p1[0]-p4[0])*(p1[0]-p4[0]);
        a[3]=(p2[1]-p3[1])*(p2[1]-p3[1])+(p2[0]-p3[0])*(p2[0]-p3[0]);
        a[4]=(p2[1]-p4[1])*(p2[1]-p4[1])+(p2[0]-p4[0])*(p2[0]-p4[0]);
        a[5]=(p3[1]-p4[1])*(p3[1]-p4[1])+(p3[0]-p4[0])*(p3[0]-p4[0]);
        Arrays.sort(a);
        if(a[0] == 0){
            return false;
        }
        if(a[4]==a[5] && a[0]==a[1] && a[1]==a[2] && a[2]==a[3]){
            return true;
        }
        return false;
    }
}
