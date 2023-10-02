import java.util.*;

class Array8{

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

        for(int i=0;i<arr.length;i++){


            int j;
            for(j=0;j<arr2.length;j++){
             if(arr[i]==arr2[j]){
                    break;
             }
            }    
            
            
            if(j== arr2.length){
                System.out.print(arr[i]+" ");
            }
        }


}
}