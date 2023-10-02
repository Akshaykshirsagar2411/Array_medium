
import java.util.*;

class Array19{

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
       

         System.out.println("Transpose array");

    
   
         for(int  i=0;i<arr.length;i++){

             int count =0;
            for(int j=i;j<arr.length;j++){


                int temp =arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
              }
                                      

            
            }


              for(int  i=0;i<arr.length;i++){

            for( int j=0;j<arr.length;j++){

        System.out.print(arr[i][j]+" ");
           }

           System.out.println();
           
        }
       
      
        for(int i=0;i<arr.length/2;i++){

            for(int j=0;j<arr.length;j++){

                int temp = arr[i][j];
                arr[i][j]=arr[arr.length-i-1][j];
                arr[arr.length-i-1][j]=temp;
            }
        }

         System.out.println("Roatation of array anticlockwise");
        
         for(int  i=0;i<arr.length;i++){

            for( int j=0;j<arr.length;j++){

        System.out.print(arr[i][j]+" ");
           }

           System.out.println();
           
        }

       
        
      
         


    }
}