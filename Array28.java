import java.util.*;

class Array28{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();


        int arr[]= new int[size];

         System.out.println("Enter array element");


        for(int i=0;i<arr.length;i++){

            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println();

  
        int count=2;
        int index=0;
        int[] temp = new int[arr.length]; 
        int repeatingNumber = -1;
        int missingNumber = -1;
 
        for (int i = 0; i < arr.length; i++) {
            temp[arr[i] - 1]++;
            if (temp[arr[i] - 1] > 1) {
                repeatingNumber = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (temp[i] == 0) {
                missingNumber = i + 1;
                break;
            }
        }
 
        System.out.println("The repeating number is "
                           + repeatingNumber + ".");
        System.out.println("The missing number is "
                           + missingNumber + ".");
    


    }
}