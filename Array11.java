
import java.util.*;

class Array11{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array of two diemtional size");
        int m = sc.nextInt();
        int n= sc.nextInt();


        int arr[][]= new int[m][n];

         System.out.println("Enter array element");


        for(int i=0;i<arr.length;i++){

           for(int j=0;j<arr.length;j++){

             arr[i][j] = sc.nextInt();
           }
        }

        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr.length;j++){

        System.out.print(arr[i][j]+" ");
           }

           System.out.println();
           
        }
        System.out.println();

    
    int previousCount=0;
    int i;
   int j;
   int index=0;
         for( i=0;i<arr.length;i++){

             int count =0;
            for(j=0;j<arr.length;j++){

              if(arr[i][j]==1){

                count++;
              }

              if(previousCount<count){

                 previousCount=count;
                 index=i;
              }
                                      

            
            }

      
        
        }

         System.out.println("Row "+index+ " max 1's");
        
      
         


    }
}