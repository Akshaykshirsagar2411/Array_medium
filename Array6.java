import java.util.*;

class Array6{

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


        int temp =arr[i];
        while(temp !=0){

         int   rem = temp%10;
            count++;

            temp = temp/10;
        }
    }

    System.out.println(count);


    int arr2[] = new int[count];

    int j=0;

    for(int i=0;i<arr.length;i++){


        int temp1 = arr[i];

       while(temp1 !=0){

        int rem = temp1%10;

        arr2[j]=rem;
        j++;

        temp1 = temp1/10;
         

       }
        

    }

     Arrays.sort(arr2);

     System.out.println("largest Number using array is");

     for(int i=(arr2.length-1);i>=0;i--){

            System.out.print(arr2[i]);
        }
        System.out.println();

    
       


    }
}