class Solution {
    public boolean binarySearch(int[]a,int high,int low,int target ){
        while(low <= high){
        int mid = low +(high-low)/2;
        if(a[mid]==target)return true;
        else if(a[mid]<target)low= mid+1;
        else high = mid-1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int high = matrix[0].length-1;
        int low = 0;
        for(int i = 0 ; i<matrix.length;i++){
            if (binarySearch(matrix[i],high,low,target)) return true;
        }
        return false;
    }
}
