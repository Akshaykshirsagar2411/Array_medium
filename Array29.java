import java.util.*;

class Array29{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
       


        int arr[]= new int[size];
        int arr2[]= new int[size];
                

                


         System.out.println("Enter array element");


        for(int i=0;i<arr.length;i++){

            arr[i] = sc.nextInt();
        }

        System.out.println("Enter array element second");
        
        for(int i=0;i<arr2.length;i++){

            arr2[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for(int i=0;i<arr2.length;i++){

            System.out.print(arr2[i]+" ");
        }
        System.out.println();

   int max=0;
   int count =0;
     int index=0;
       
    Arrays.sort(arr);
    Arrays.sort(arr2);
    int i=0,j=0;

    while(i<arr.length){
        

    if(arr[i]<= arr2[j]){

        count++;
        if(count>max){

            max = count;
        }
        i++;

    }
    else if(arr[i]>arr2[j]){

        count--;
        j++;
    }

}


System.out.println(max);

    }
}