package Basic;

public class method {
    public static void main(String[] args){
        sayHello("Ankit Kumar Dubey");
        System.out.println("Add Two number Result :- " + add(3,4));
    }
    private static void sayHello(String name){
        System.out.println("Hello " + name);
        System.out.println("Jai Shri Ram " + name);
    }

    private static int add(int a,int b){
        return a + b;
    }
}
