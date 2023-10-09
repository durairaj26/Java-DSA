
import java.util.Arrays;

public class QuickSortExample{
    public static void quickSort(int arr[],int l,int h){
        if(l>=h){
            return;
        }
        
        int start=l;
        int end=h;
        // int mid=(start+end)/2;
        // int p=arr[mid];
        int p=arr[l];
        while(start<=end){
            while(arr[start]<p)
                start++;
            
            while(arr[end]>p)
                end--;
            
            if(start<=end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        
        quickSort(arr, l, end);
        quickSort(arr, start, h);
        
    
    }
    
    public static void main(String[] args) {
        int arr[]={4,2,5,1,4};
        int l=0;
        int h=arr.length-1;
        quickSort(arr,l, h);
        System.out.println(Arrays.toString(arr));
        
    }
} 