package Lesson_4;


public class Lesson_4 {
    public static void main(String[] args) throws MyArraySizeExeption, MyArrayDataException {
        String[][] array = new String[][] { {"1","2","3","4"},
        {"2","3","4","5"},
        {"3","4","3","6"},
        {"1","2","3","4"} };
        try {
            validateAndSum(array);
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
        }

    public static int validateAndSum(String[][] array) throws MyArraySizeExeption, MyArrayDataException {
        if (array == null || array.length != 4) {
            throw new MyArraySizeExeption();
        }
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            if (array[i] == null || array[i].length != 4) {
                throw new MyArraySizeExeption();
            }
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]: '" + array[i][j] + "'", i, j);
                }
            }
        }
        System.out.println(sum);
        return sum;
    }
}


