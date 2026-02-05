package Array;

public class Array {
    public static void main() {
        // type[] variableName;
        int[] integerArray = new int[10];
        System.out.println(integerArray[0]);
        System.out.println(integerArray[1]);
        System.out.println(integerArray[2]);
        System.out.println(integerArray[3]);
        System.out.println(integerArray[4]);

        integerArray[1] = 20;
        integerArray[3] = 40;

        for (int i = 0 ; i < integerArray.length ; i++){
            System.out.println(integerArray[i]);
        }

    }
}
