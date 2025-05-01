public class StepTracker{
    private int days;
    private int steps;
    private int threshold;
    private int activeDays;

    public StepTracker(int t){
        threshold = t;
    }

    public void addDailySteps(int s){
        days++;
        if(s >= threshold){
            activeDays++;
        }
        steps = steps + s;
    }

    public int activeDays(){
        return activeDays;
    }

    public double averageSteps(){
        if(days == 0) return 0;
        return (double) steps / days;
    }
}