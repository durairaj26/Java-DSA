public class BinarySearchExample {
   public static int binarySearch(int[] arr,int right, int left,int find){
   while(left<=right){
        int mid=(right+left)/2;
        if(arr[mid]==find){
            return mid;
        }
        else if(arr[mid]<find){
            left=mid+1;
        }
        else{
            right=mid-1;
        }
    }
    
    return -1;
}
   
    public static void main(String[] args) {
        int arr[] = { 10, 20, 35, 40, 50, 60 };
        int left = 0;
        int right = arr.length - 1;
        int find = 40;
        int result = binarySearch(arr, right, left, find);
        if (result == -1) {
            System.out.println("Present");
        } else {
            System.out.println("Not present");
        }
    }
}
