package Array;

public class TwoDArray {
   public static void main() {
        int [][] arr = new int[3][3];
        int [][] nums = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
       System.out.println(nums[1][2]);

       for (int i = 0 ; i<nums.length;i++){
           for (int j = 0 ; j <nums.length;j++){
               System.out.print(nums[i][j] + " ");
           }
           System.out.println();
       }

       char arr1[][] = new char[3][2];
       arr1[0][0] = 'A';
       arr1[0][1] = 'N';
       arr1[1][0] = 'K';
       arr1[1][1] = 'I';
       arr1[2][0] = 'T';
       arr1[2][1] = 'D';

       for (int i = 0 ; i < arr1.length; i++){
           for (int j = 0 ; j < arr1[i].length; j++){
               System.out.print(arr1[i][j] + " ");
           }
           System.out.println();
       }

       // jacked Array
       char ca[][] = new char[3][];
       ca[0] = new char[2];
       ca[1] = new char[3];
       ca[2] = new char[2];
       ca[0][0] = 'A';
       ca[0][1] = 'N';
       ca[1][0] = 'K';
       ca[1][1] = 'I';
       ca[1][2] = 'T';
       ca[2][0] = 'D';
       ca[2][1] = 'U';

       for (int i = 0 ; i<ca.length;i++){
           for (int j = 0 ; j < ca[i].length;j++){
               System.out.print(ca[i][j] + " ");
           }
           System.out.println();
       }
    }
}
