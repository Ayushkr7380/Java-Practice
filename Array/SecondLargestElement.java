public class SecondLargestElement {
    public static void main(String args[]){
        int arr[] = {12,5,55,6,1,45};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;


        if(arr.length < 2){
            System.out.println("Array has less than 2 elements..");
        }

        for(int num : arr){
            if(num > largest){
                secondLargest = num;
                num = largest;
            }
            else if( num > secondLargest && num != largest){
                secondLargest = num;
            }
        }

        System.out.println("Second largest element is "+secondLargest);
    }
}
