public class Question1103 {
    public int[] distributeCandies(int candies, int num_people) {
        int people[] = new int[num_people];
        int num = 1;
        int i = 0;
        while(candies - num >= 0){
            people[i % num_people] += num;
            i++;
            candies -= num;
            num++;
        }
        people[i % num_people] += candies;
        return people;
    }
}
