import java.util.Arrays;

/**
 * Number11
 */
public class Number11 {

    

    public static void main(String[] args){
        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int [5];
        myNumbers[1] = new int [3];
        myNumbers[2] = new int [1];
        
for (int i=0; i<myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }
}
}
