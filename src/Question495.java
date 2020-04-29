public class Question495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length == 0){
            return 0;
        }
        int time = 0;
        for(int i = 0;i<timeSeries.length-1;i++){
            time += Math.min(timeSeries[i+1]-timeSeries[i],duration);
        }
        return time+duration;
    }
}
