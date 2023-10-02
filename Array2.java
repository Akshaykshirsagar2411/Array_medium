import java.util.*;

class Array2{

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

            for(int j=i+1;j<arr.length;j++){

                for(int k=j+1;j<arr.length;j++){

                    int x = arr[i]*arr[i];
                    int y= arr[j]*arr[j];
                    int z = arr[k]*arr[k];

                    if(x==y+z || y==x+z || z==x+y){

                        System.out.println("true");
                        break;
                    }
                    else{
                         System.out.println("false");
                         break;
                    }
                }
            }
        }
       
    
        


    }
}