package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int count=0;
        int limit;
        if(multiplyByAndToInclusive<0){
            limit=-multiplyByAndToInclusive;
        } else{
            limit=multiplyByAndToInclusive;
        }
        while(count<=limit){
            if(limit==0){
                break;
            }
            System.out.println(multiplyByAndToInclusive*count++);
        }
    }
}
