public class Question905 {
    public int[] sortArrayByParity(int[] A) {
        int j = 0;
        for(int i = 0;i<A.length;i++){
            if(A[i] % 2 == 0){
                int tem = A[i];
                A[i] = A[j];
                A[j] = tem;
                j++;
            }
        }
        return A;
    }
}
