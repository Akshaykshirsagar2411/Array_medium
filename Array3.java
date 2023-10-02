import java.util.*;

class Array3{

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

   int max=arr[0];
   int count =0;
     int index=0;
     for (int i = 0; i < arr.length; i++) {
        int sum = arr[i];
        if (sum == 0){

            count++;
        }
        
        for (int j = i + 1; j < arr.length; j++) {
            sum += arr[j];
            if (sum == 0)
               {

                count++;
               }
        }
    }
        System.out.println(count);
       
    
        


    }
}