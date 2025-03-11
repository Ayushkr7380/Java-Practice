public class SecondSmallestElement {
    public static void main(String args[]){
        int arr[] = {12,2,4,67,8};
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        if(arr.length < 2){
            System.out.println("Array has less than 2 elements..");
        }

        for(int num : arr){
            if(num < smallest ){
                secondSmallest = smallest;
                smallest = num;
            }
            else if( num > smallest && secondSmallest > num){
                secondSmallest = num;
            }
        }

        System.out.println("Second largest element is "+secondSmallest);
    
    }
}
