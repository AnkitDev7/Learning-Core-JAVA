package Array;

public class Second {
   public static void main() {
        int[] arr = new int[5];

        int[] arr1 = {1,2,3,4,5};
        for (int i = 0 ; i<arr1.length;i++){
            System.out.println(arr1[i]);
        }

        // for Enhenced Loop
        for (int var : arr1){
            System.out.println(var);
        }

        // Search and element in an array
       int [] ankit = {1,22,33,44,55,67,87,69};
        for (int var2 : ankit){
            if (var2 == 55){
                System.out.println(" Found ");
            }
            System.out.println(var2);
        }

        // find maximam array
       int [] arr3 = {1,2,3,4,5};
        int res = Integer.MAX_VALUE;
        for ( int i = 0 ; i<arr3.length ; i++){
            if (arr3[i] > res){
                res = arr3[i];
            }
        }
       System.out.println(res);

        // Reverse print array
       int Rev[] = {11,22,33,44,55};
       for (int i = Rev.length - 1; i >= 0 ; i--){
           System.out.println(Rev[i]);
       }

       // Sum of Array
       int Sum[] = {11,22,33,44,55};
       int sum = 0 ;

       for (int i = 0 ; i < Sum.length; i++){
           sum += Sum[i];
       }
       System.out.println("Sum Of Array :- "+sum);
    }
}
