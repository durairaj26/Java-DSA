import java.util.Arrays;

public class BubbleSortExample {
   
    public static void bubbleSort(int arr[]){
        int len= arr.length;
        boolean swapped;
        for(int i=0;i<len-1;i++){
            swapped=false;
            for(int j=0;j<len-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                   
                }
            }
             if(!swapped){
                        break;
                    }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,3,5,1};
        System.out.println("Before sort:"+Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After sort:"+Arrays.toString(arr));


    }
}
