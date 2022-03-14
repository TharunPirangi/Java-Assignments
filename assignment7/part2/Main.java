package java_assignments.assignment7.part2;

public class Main {
    public static void main(String[] args) {
        Cycle[] cycles = {new Cycle(), new UniCycle(), new Bicycle(), new Tricycle()};
        for (Cycle cycle : cycles) {
            cycle.balance();
//            cannot cast one class with another
//            UniCycle uniCycle = (UniCycle)(cycle);
//            uniCycle.printType();

            cycle.printType();
        }
    }
}