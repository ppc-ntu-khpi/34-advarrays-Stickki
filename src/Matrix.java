/**
 * Клас, що представляє матрицю цілих чисел та надає функціонал додавання.
 */
public class Matrix {
    private final int[][] data;
    private final int rows;
    private final int cols;

    /**
     * Конструктор, що створює новий об'єкт матриці з заданими даними.
     *
     * @param data масив, що містить елементи матриці.
     */
    public Matrix(int[][] data) {
        this.data = data;
        this.rows = data.length;
        this.cols = data[0].length;
    }

    /**
     * Метод, що додає іншу матрицю до поточної та повертає нову матрицю як результат.
     *
     * @param other матриця, що додається до поточної.
     * @return нова матриця, що представляє суму поточної та іншої матриць.
     * @throws IllegalArgumentException якщо матриці мають різну розмірність.
     */
    public Matrix add(Matrix other) {
        if (rows != other.rows || cols != other.cols) {
            throw new IllegalArgumentException("Matrices must have same dimensions");
        }

        int[][] resultData = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultData[i][j] = data[i][j] + other.data[i][j];
            }
        }

        return new Matrix(resultData);
    }

    /**
     * Метод, що виводить матрицю на екран.
     */
    public void print() {
        for (int[] row : data) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
