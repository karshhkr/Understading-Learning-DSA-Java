//package com.example.DSA.java.Searching.BinarySearch2DMatrix;
//
//public class SearchInSortedMatrix {
//    public static void main(String[] args) {
//
//    }
//    static int[] binarySearch2DMatrix(int[][] matrix,int row, int colStart, int colEnd, int target,) {
//        while (colStart <= colEnd) {
//            int mid = colStart + (colEnd - colStart) / 2;
//            if (matrix[row][mid] == target) {
//                return new int[]{row, mid};
//            }
//            if (matrix[row][mid] < target) {
//                colStart = mid + 1;
//            }
//            if (matrix[row][mid] > target) {
//                colEnd = mid - 1;
//            }
//        }
//        return new int[]{-1, -1};
//
//    }
//    //search in  the row provided btw columns provided
//    static boolean searchMatrix(int[][] matrix, int target) {
//
//       int row  = matrix.length;
//       int col = matrix[0].length;// matrix might be empty
//        if (row == 1) {
//            return binarySearch2DMatrix(matrix,0 ,0,col-1,target);
//        }
//        int rowStart = 0;
//        int rowEnd = row-1;
//        int colmid=col/2;
//        /// run the loops till 2 rows are remaining
//        while (rowStart < rowEnd-1) { // while its true two rows are remmianing
//            int mid =rowStart+(rowEnd-rowStart)/2;
//            if  (matrix[mid ][colmid] == target) {
//return  new int[]{mid,colmid};
//            }
//if(matrix[mid ][colmid] > target) {
//rowEnd = mid-1;
//}
//if (row == rowEnd) {}
//        }
//    }
//}
