package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExplorationMap {
    private final Cell[][] matrix;

    public Cell[][] getMatrix() {
        return matrix;
    }

    public ExplorationMap(int n)
    {
        matrix=new Cell[n][n]; //
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
        {
            matrix[i][j]=new Cell();
        }
    }
   public boolean visit(int row,int col,Robot robot){
     synchronized (matrix[row][col]){
        if(matrix[row][col].getTokenList().isEmpty()==true) {
            List<Token> extracted = new ArrayList<>();
            extracted = robot.getExplore().getMem().extractToken(matrix.length);
            matrix[row][col].setTokenList(extracted);
            System.out.println("Robot " + robot.getName() + " extracted and stored successfully " + matrix[row][col].getTokenList().size() + " tokens -> " + matrix[row][col].getTokenList());
            return true;
        }
     }
     return false;
   }

   public boolean isFull(){
       for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix.length; j++) {
               if (matrix[i][j].getTokenList().isEmpty() == true)
                   return false;
           }
       }
       return true;
   }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sb.append(matrix[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
