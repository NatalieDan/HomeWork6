public class Animal{
    private int runDistance;
    private int swimDistance;
    private int maxRun;
    private int maxSwim;
    static protected int count = 0;

    Animal(int runDistance,int swimDistance,int maxRun,int maxSwim){
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.count++;
    }

    int getRunDistance(){
        return runDistance;
    }

    int getSwimDistance(){
        return swimDistance;
    }

    int getMaxRun(){
        return maxRun;
    }

    int getMaxSwim(){
        return maxSwim;
    }

    int getCount(){
        return count;
    }
}
