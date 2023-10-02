import java.util.*;

class Array1{

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
        for(int i=0;i<arr.length;i++){

        count++;
           if(arr[i]>max){

            max =arr[i];
             index =i;

           }
           if(i==arr.length-1){

            System.out.println(index);

           }
        }
       
    
        


    }
}