/**
 * Java 1. HomeWork 6.
 *
 * @author Natalie Danilenko
 * @version 23.10.2021
 */
public class HomeWork6 {
    public static void main(String [] args){
        Dog dog = new Dog(600,3);
        System.out.println(dog.run(dog.getRunDistance(),dog.getMaxRun()));
        System.out.println(dog.swim(dog.getSwimDistance(),dog.getMaxSwim()));

        Cat cat = new Cat(14,5);
        System.out.println(cat.run(cat.getRunDistance(),cat.getMaxRun()));
        System.out.println(cat.swim(cat.getSwimDistance(), cat.getMaxSwim()));

        Cat cat2 = new Cat(300,1);
        System.out.println(cat2.run(cat2.getRunDistance(),cat2.getMaxRun()));
        System.out.println(cat2.swim(cat2.getSwimDistance(), cat2.getMaxSwim()));

        System.out.println(dog.getCount() + " animals.");
    }
}
