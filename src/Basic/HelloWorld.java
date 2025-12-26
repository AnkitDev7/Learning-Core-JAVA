package Basic;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello");
    }

    public static class Variable {
        public static void main(String[] args) {
            // Basic.HelloWorld.Variable Creation
            int age;
            String name;

            // Initialization
            age = 10;
            name = "Core Java";
            System.out.println("Hello, " + name + " You are " + age + " Years old");

            // Your name , your age , your favourite programing language;
            String UserName = "Ankit Kumar Dubey";
            String Language = "Java Programing";
            System.out.println("Hii My name is " + UserName + " and my Favourite Programing is " + Language );

            // CONSTANT
            final int CONSTANT_VALUE = 3;
        }
    }
}
