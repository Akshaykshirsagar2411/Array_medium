import java.util.*;

class Array9{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        System.out.println("Enter size of second array");
         int size2 = sc.nextInt();


        int arr[]= new int[size];
          int arr2[]= new int[size2];
         System.out.println("Enter array element");


        for(int i=0;i<arr.length;i++){

            arr[i] = sc.nextInt();
        }

        System.out.println("Enter array element for second array");
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

        int arr3[] =  new int[size +size2];

        for(int i=0;i<arr.length;i++){


            arr3[i]=arr[i];

            
           
        }
        int index = arr.length;

         for(int i=0;i<arr2.length;i++){


            arr3[index]=arr2[i];
            index++;

            
           
        }
         for(int i=0;i<arr3.length;i++){

            System.out.print(arr3[i]+" ");
        }
        System.out.println();


        for(int i=0;i<arr3.length;i++){

            for(int j=i+1;j<arr3.length;j++){

                if(arr3[i]>arr3[j]){

                    int temp = arr3[i];
                    arr3[i]=arr3[j];
                    arr3[j]=temp;
                }
            }
        }

        for(int i=0;i<arr3.length;i++){

            System.out.print(arr3[i]+" ");
        }
        System.out.println();

        System.out.println("Enter num for kth element");

        int num = sc.nextInt();
        num = num-1;

        for(int i=0;i<arr3.length;i++){

            if(arr3[i]==num){

                System.out.println(arr3[i]);
                break;
            }
        }

}
}