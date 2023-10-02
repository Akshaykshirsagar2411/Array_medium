import java.util.*;

class Array20{

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
   
     int index=0;
        for(int i=0;i<arr.length;i++){

             int count =0;
           for(int j=0;j<arr.length;j++){

            if(arr[i]==arr[j]){
                
                count++;
            }
           }
           index++;

           if(count>=arr.length/2){
            
            System.out.println(arr[i]);
            break;
           }
           else if(count<=1 && index ==arr.length-1){

            System.out.println("No element appears more than or equal to N/2 so -1");
        }
        
        }
       
        


    }
}