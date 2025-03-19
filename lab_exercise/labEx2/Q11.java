// Print elements of two dimensional array. Int [][]x={{10,20,30},{40,50,60}}; Using normal for loop

package lab_exercise.labEx2;
public class Q11 {
    public static void main(String[] args) {
        int[][] x = {
                {10, 20, 30},
                {40, 50, 60}
        };

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }
}