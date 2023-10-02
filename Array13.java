import java.util.*;

class Array13{

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

   int count=0;
        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){

                for(int k=i+1;k<arr.length;k++){

                    if((arr[i]+arr[j]+arr[k])==0){

                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                        count++;
                    }
                }
            }
        }
    
        System.out.println(count);


    }
}