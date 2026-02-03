package Exception_Handling;

public class ExceptionDemo {
    public static void main(String[] args) {
        int a = 10;
//        int result = 10 / 0;
//        System.out.println("Done");

        try {
            // EXCEPTION GENRATING STATEMENT
            int result = 10 / 3;
            System.out.println(" Done " + result);
        }catch (IndexOutOfBoundsException E){
            // EXCEPTION HANDLING STATEMENT
            System.out.println("In Catch Block");
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception :- ");
        }finally {
            // Always Excutes
            System.out.println("Finally :- ");
        }

        int[] b = {1,2,3,4,5};
        try {
            System.out.println(b[6]);
        }catch (Exception e){
            System.out.println("find Error:-");
        }


    }
}
