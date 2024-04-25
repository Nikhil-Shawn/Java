import java.util.ArrayList;
import java.util.Arrays;

public class Algorithms {

    public static double findMax(double a, double b, double c){

        int mat[][] = {
                {-4, -3, -2, 1},
                {-3, -2, 1, 1},
                {-2, -2, 1, 1},
                {-2, 1, 0, 0}};

        int negCount = 0;
        int row = 0;
        int col = mat[0].length - 1;

        while (row<mat.length && col>=0 ){
            if(mat[row][col]<0){
                negCount += col + 1;
                row++;
            }else{
                col--;
            }
        }
        System.out.println(negCount);

        double maxValue = a;
       if(b > maxValue){
           maxValue = b;
       }
       if(c > maxValue){
           maxValue = c;
       }
       return maxValue;
    }

    public static void main(String[] args){
        System.out.println(findMax(2233,2205,430));
    }

}
