package Lesson_4;

public class MyArrayDataException extends Exception {
    private final int row;
    private final int col;

    public MyArrayDataException(String message, int row, int col) {
        super(message);
        this.row = row;
        this.col = col;
    }
    public int getCol() {
        return col;
    }
    public int getRow() {
        return row;
    }
}