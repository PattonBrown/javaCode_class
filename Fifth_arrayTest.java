public class Fifth_arrayTest {
    public static void main(String[] args) {
        int[][] array = { { 1, 2, 3, 4 }, { 5, 6, 7, 8, 9 } };
        int[][][] three_dimesion_array = { { { 1, 2, 3, 4 }, { 5, 6, 7, 8, 9 } } };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                System.out.println(array[i][j]);
        }
        for (int[] a : array) {
            for (int b : a) {
                System.out.println(b);
            }
        }
        for (int i = 0; i < three_dimesion_array.length; i++) {
            for (int j = 0; j < three_dimesion_array[i].length; j++) {
                for (int k = 0; k < three_dimesion_array[i][j].length; k++)
                    System.out.println(three_dimesion_array[i][j][k]);
            }

        }
    }
}
