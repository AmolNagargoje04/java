class Sudoku{

    public static String generateGrid(int size, int length) {
        String[][] elements = createElements(size, length);
        int totalRowsCols = 2 * size + 1;
        String gridPattern = "";

        for (int i = 1; i <= totalRowsCols; i++) {
            for (int j = 1; j <= totalRowsCols; j++) {

                if ((i % 2 == 1) && (j % 2 == 0)) {
                    gridPattern += "_".repeat(length);
                } else if ((i % 2 == 1) && (j % 2 == 1)) {
                    gridPattern += " ";
                } else if ((i % 2 == 0) && (j % 2 == 1)) {
                    gridPattern += "|";
                } else if ((i % 2 == 0) && (j % 2 == 0)) {
                    int rowIndex = (i - 1) / 2;
                    int colIndex = (j - 1) / 2;
                    if ((rowIndex < size) && (colIndex < size)) {
                        gridPattern += elements[rowIndex][colIndex];
                    }
                }
            }
            gridPattern += "\n";
        }

        return gridPattern;
    }

    public static String[][] createElements(int size, int length) {
        String[][] elements = new String[size][size];
        int counter = 0;

        for (int i = 0; i < size; i++) {
            counter = i;
            for (int j = 0; j < size; j++) {
                int randomNum = (int) (System.nanoTime() % size);
                if ((randomNum == i) || (randomNum == j)) {
                    elements[i][j] = String.format("%" + length + "s", (counter % size) + 1);
                    counter++;
                } else {
                    elements[i][j] = String.format("%" + length + "s", "");
                    counter++;
                }
            }
        }
        return elements;
    }

    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);
        int length = args[0].length();
        System.out.println(generateGrid(size, length));
    }
}

