package java_assignments.assignment6;

public class JavaAssignment6 {
    public static void main(String[] args) {
//        Part 1
        VampireClass vampire = new VampireClass();
        vampire.printVampireNumbers(100);


//        Part 2
        Overloaded overloaded = new Overloaded();
        ArrayObject[]  objects = new ArrayObject[5];


//        part 3
//        prints null as objects
        for(int index = 0; index < objects.length ;index ++)
            System.out.println(objects[index]);


//        part 4
//        prints initialized constructor message
        for(int index = 0; index < objects.length ;index ++)
            objects[index] = new ArrayObject("Object "+index);

    }
}
