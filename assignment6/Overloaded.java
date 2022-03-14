package java_assignments.assignment6;

// part 2
class Overloaded{
    Overloaded(){
        this("First Constructor");

    }
    Overloaded(String input){
        System.out.println("Second Constructor called from : "+input);
    }

}