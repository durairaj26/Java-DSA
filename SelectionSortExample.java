import java.util.Arrays;

public class SelectionSortExample {
   
   public static void selectionSort(int arr[]){
    int len=arr.length;
    for(int i=0;i<len-1;i++){
        int min=i;
        for(int j=i+1;j<len;j++){
            if(arr[j]<arr[min]){
                min=j;
            }

        }
        int temp=arr[i];
        arr[i]=arr[min];
        arr[min]=temp;
        }
    
   }
    public static void main(String[] args) {
        int arr[]={2,1,3};
        System.out.println("Before sort:"+ Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After sort:"+ Arrays.toString(arr));
    }
}
