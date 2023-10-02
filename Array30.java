import java.util.*;

class Array30{

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

   
   int count =0;
     int mul;

     int num = sc.nextInt();

        for(int i=0;i<arr.length;i++){

            if(arr[i]<num){
                count++;
            }
            mul = arr[i];
        for(int j=i+1;j<arr.length;j++){


            mul = mul*arr[j];

            if(mul<num){
                
                count++;
            }else{
                break;
            }

        }

           
        }
       
    System.out.println(count);
        


    }
}