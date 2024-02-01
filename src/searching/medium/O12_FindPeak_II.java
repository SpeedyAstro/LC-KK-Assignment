package searching.medium;

public class O12_FindPeak_II {
    public int[] findPeakGrid(int[][] mat) {
        int start = 0, end = mat[0].length-1;
        while(start<=end){
            int mid = start + (end - start) /2;
            int maxRow = findMaxRow(mat,mid);
            if (mat[maxRow].length == 1) return new int[]{maxRow, 0};
            if (mid == 0) {
                if (mat[maxRow][mid] > mat[maxRow][mid + 1]) return new int[]{maxRow, mid};
                else start = mid + 1;
            }
            else if (mid == mat[0].length - 1) {
                if (mat[maxRow][mid] > mat[maxRow][mid - 1]) return new int[]{maxRow, mid};
                else end = mid - 1;
            }
            else
            if(mat[maxRow][mid]<mat[maxRow][mid-1]) end = mid-1;
            else if(mat[maxRow][mid]<mat[maxRow][mid+1]) start = mid+1;
            else return new int[]{maxRow,mid};
        }
        return new int[]{-1,-1};
    }
    public int findMaxRow(int[][] mat,int col){
        int max = Integer.MIN_VALUE, maxRow = -1;
        for(int i=0;i<mat.length;i++){
            if(mat[i][col]>max){
                max = mat[i][col];
                maxRow = i;
            }
        }
        return maxRow;
    }
    public int peakElement(int[] arr){
        int start = 0, end = arr.length-1;
        while(start<end){
            int mid = start + (end - start) /2;
            if(arr[mid]>arr[mid+1])  end = mid;
            else start = mid +1 ;
        }
        return start;
    }
}
