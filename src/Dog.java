public class Dog extends Animal implements IAnimal{
    Dog(int runDistance, int swimDistance){
        super(runDistance,swimDistance,500,10);
    }
    public String run(int runDistance,int runMax){
        return (runDistance <= runMax) ? "Dog ran " + runDistance + " m." : "Dog can't run " + runDistance + " m.";
    }
    public String swim(int swimDistance,int swimMax){
        return (swimDistance <= swimMax) ? "Dog swam " + swimDistance + " m." : "Dog can't swim " + swimDistance + " m.";
    }
}
