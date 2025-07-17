class Solution {
    public int peakIndexInMountainArray(int[] arr) {

        int start=0;
        int end=arr.length-1;

        while(start<end){
           int mid=(start+end)/2;
           //firstly we are in the descending part of array
           if(arr[mid]>arr[mid+1]){
            end=mid;  //This may be the possible answer,but look at left also
           }
           else{
            //we are in ascending part of array
            start=mid+1; //beacuse we know that mid+1>mid element
           }
           
        }
        //in the end,start==end pointing to the largest number in the array.
        return start;
        
    }
}