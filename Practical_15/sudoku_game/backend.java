package sudoku_game;
public class backend{
    public int gridSize;
    public int[][] board;
    public String[][] displayBoard;

    public backend(int size) {
        this.gridSize = size;
        boolean filled = false;
        int tries = 0;

        while (!filled) {
            filled = populateBoard();
            tries++;
        }

        //System.out.println(drawGrid(gridSize));
        System.out.println("Now solve the Sudoku puzzle!");
        //takeInputFromUser(gridSize, numLength);
    }

    // Generate a random number from 1 to size
    public int getRandomNum() {
        return (int)(System.nanoTime() % this.gridSize) + 1;
    }

    // Check if number exists in a row
    public boolean isSafeInRow(int row, int num) {
        for (int i = 0; i < gridSize; i++) {
            if (board[row][i] == num) return false;
        }
        return true;
    }

    // Check if number exists in a column
    public boolean isSafeInCol(int col, int num) {
        for (int i = 0; i < gridSize; i++) {
            if (board[i][col] == num) return false;
        }
        return true;
    }

    // Try to fill the board
    public boolean populateBoard() {
        int attempt = 0;
        int randVal = 0;
        clearBoard();

        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                attempt = 0;
                boolean valid = false;

                while (!valid && attempt < 100) {
                    randVal = getRandomNum();
                    valid = isSafeInRow(i, randVal) && isSafeInCol(j, randVal);
                    attempt++;
                    if (attempt > 90) break;
                }

                if (attempt > 90) return false;

                board[i][j] = randVal;
            }
        }
        return true;
    }

    // Reset the board
    public void clearBoard() {
        board = new int[gridSize][gridSize];
    }

    // Create the puzzle with blanks
    public String[][] makePuzzle(int size, int length) {
        displayBoard = new String[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int rand = (int)(System.nanoTime() % size);
                if (rand == i || rand == j) {
                    displayBoard[i][j] = String.format("%s", board[i][j]);
                } else {
                    displayBoard[i][j] = String.format("%s", "");
                }
            }
        }
        return displayBoard;
    }

    // Display the board as a grid
    public String drawGrid(int size, int length) {
        String[][] elements = makePuzzle(size, length);
        StringBuilder grid = new StringBuilder();
        int layoutSize = 2 * size + 1;

        for (int i = 1; i <= layoutSize; i++) {
            for (int j = 1; j <= layoutSize; j++) {
                if (i % 2 == 1 && j % 2 == 1) {
                    grid.append("+");
                } else if (i % 2 == 1 && j % 2 == 0) {
                    grid.append("-".repeat(length));
                } else if (i % 2 == 0 && j % 2 == 1) {
                    grid.append("|");
                } else if (i % 2 == 0 && j % 2 == 0) {
                    int row = (i - 1) / 2;
                    int col = (j - 1) / 2;
                    if (row < size && col < size) {
                        grid.append(elements[row][col]);
                    }
                }
            }
            grid.append("\n");
        }
        return grid.toString();
    }



    // Check if the user input is a valid solution
    public boolean checkSolution(String[][] displayBoard) {
        for (int i = 0; i < gridSize; i++) {
            boolean[] rowCheck = new boolean[gridSize + 1];
            for (int j = 0; j < gridSize; j++) {
                int num = Integer.parseInt(displayBoard[i][j]);
                if (num < 1 || num > gridSize || rowCheck[num]) return false;
                rowCheck[num] = true;
            }
        }

        for (int j = 0; j < gridSize; j++) {
            boolean[] colCheck = new boolean[gridSize + 1];
            for (int i = 0; i < gridSize; i++) {
                int num = Integer.parseInt(displayBoard[i][j]);
                if (num < 1 || num > gridSize || colCheck[num]) return false;
                colCheck[num] = true;
            }
        }

        return true;
    }


}
