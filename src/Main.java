/**
 * Головний клас, що містить точку входу в програму.
 */
public class Main {
    /**
     * Головний метод, що викликається при запуску програми.
     *
     * @param args аргументи командного рядка.
     */
    public static void main(String[] args) {
        int[][] data1 = {{1, 2}, {3, 4}};
        int[][] data2 = {{5, 6}, {7, 8}};

        Matrix matrix1 = new Matrix(data1);
        Matrix matrix2 = new Matrix(data2);

        Matrix sum = matrix1.add(matrix2);

        sum.print(); // вивід матриці суми
    }
}
