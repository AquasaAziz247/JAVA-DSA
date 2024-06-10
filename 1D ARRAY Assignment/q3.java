public class q3 {
    public static void main(String[] args) {
        int[] arr1 ={34,21,54,65,43};
        int[] arr2 ={4,3,6,7,1};

        int n1=arr1.length;
        int n2=arr2.length;

        int max1 = arr1[0];
        int max2 = arr2[0];

        for(int i=0;i<n1;i++){
            if(arr1[i]>max1){
                max1=arr1[i];
            }
        }
        for(int i=0;i<n2;i++){
            if(arr2[i]>max2){
                max2=arr2[i];
            }
        }
        System.out.println("Largest element in array 1 : " + max1);
        System.out.println("Largest element in array 2 : " + max2);
    }

    
}
