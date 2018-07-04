class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int i,j;
        int row = A.length;
        int coloum = A[0].length;
        int[][] B = new int[row][coloum];
        
        for(i=0; i<A.length; i++){
            for(j=0; j<A[i].length; j++){
                B[i][coloum-1-j] = 1-A[i][j];
            }
            System.out.println();
        }
        return B;
    }
}
