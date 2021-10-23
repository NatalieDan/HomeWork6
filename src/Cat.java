public class Cat extends Animal implements IAnimal{
    Cat(int runDistance, int swimDistance){
        super(runDistance,swimDistance,200,0);
    }
    public String run(int runDistance,int runMax){
        return (runDistance <= runMax) ? "Cat ran " + runDistance + " m." : "Cat can't run " + runDistance + " m.";
    }
    public String swim(int swimDistance,int swimMax){
        return (swimDistance <= swimMax) ? "Cat swam " + swimDistance + " m." : "Cat can't swim.";
    }
}
