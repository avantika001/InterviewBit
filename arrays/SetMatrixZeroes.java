/* Given a matrix, A of size M x N of 0s and 1s. If an element is 0, set its entire row and column to 0. */

public class Solution {
    public void setZeroes(ArrayList<ArrayList<Integer>> a) {
        
        int rows=a.size();
        int cols=a.get(0).size();
        int mat[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                mat[i][j]=a.get(i).get(j);
            }
        }
        boolean isCol=false;
        for(int i=0;i<rows;i++){
            
            if(mat[i][0]==0){
                isCol=true;
            }
            
            for(int j=1;j<cols;j++){
                if(mat[i][j]==0){
                    mat[0][j]=0;
                    mat[i][0]=0;
                }
            }
            
        }
        
        for(int i=1;i<rows;i++){
            for(int j=1;j<cols;j++){
                if(mat[i][0]==0||mat[0][j]==0){
                    mat[i][j]=0;
                }
            }
        }
        
        if(mat[0][0]==0){
            for(int j=0;j<cols;j++){
                mat[0][j]=0;
            }
        }
        
        if(isCol){
            for(int i=0;i<rows;i++){
                mat[i][0]=0;
            }
        }
        
        
        for(int i=0;i<rows;i++){
            
            for(int j=0;j<cols;j++){
                if(mat[i][j]==1){
                    a.get(i).set(j,1);
                }else{
                    a.get(i).set(j,0);
                }
            }
            
        }
        
        
        
    }
}
