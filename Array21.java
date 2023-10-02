import java.util.*;

class Array21{

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

   int sum =0;
   int max_sum =arr[0];

        for(int i=0;i<arr.length;i++){

         sum =sum+arr[i];

         if(sum>max_sum){
            
            max_sum = sum;

         }
         if(sum<0){

            sum =0;
         }
            
        }


        System.out.println(max_sum);
       
    
        


    }
}