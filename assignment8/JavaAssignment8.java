package java_assignments.assignment8;

public class JavaAssignment8 {
    public static void throwMultipleException(String stringMessage) throws FirstException, SecondException, ThirdException{
        try{
            if(stringMessage.equalsIgnoreCase("First"))
                throw new FirstException("First Exception");
            else if(stringMessage.equalsIgnoreCase("Second"))
                throw new SecondException("Second Exception");
            else if(stringMessage.equalsIgnoreCase("Third"))
                throw new ThirdException("Third Exception");
            else
                System.out.println("No exception found");
        }
        catch (Exception exception) {
            throw exception;
        }
        finally {
            System.out.println("Finally is always executed");
        }
    }

    public static void main(String[] args) throws FirstException, SecondException, ThirdException {
        throwMultipleException("Second");
    }
}