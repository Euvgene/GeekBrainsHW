package LessonTwoLevel2;

class Main {

    private static final int ARRAY_WIDTH_SIZE = 4;
    private static final int ARRAY_HIGH_SIZE = 4;

    public static void main(String[] args) {
        Main main = new Main();
        String[][] array = new String[3][3];
        main.initArray(array);
        main.handlingArray(array);
        array = new String[ARRAY_HIGH_SIZE][ARRAY_HIGH_SIZE];
        System.out.println();
        main.initArray(array);
        main.handlingArray(array);
    }

    private void initArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 1 && j == 1) {
                    array[i][j] = "k" + i;
                } else {
                    array[i][j] = "1" + i;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void checkSizeArray(String[][] array) throws MyArraySizeException {
        if (array.length != ARRAY_HIGH_SIZE || array[0].length != ARRAY_WIDTH_SIZE) {
            throw new MyArraySizeException();
        }
    }

    int getArrayElementsSum(String[][] myArray) throws MyArraySizeException {
        checkSizeArray(myArray);
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                try {
                    sum = getSum(myArray, sum, i, j);
                } catch (MyArrayDataException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        return sum;
    }

    private int getSum(String[][] myArray, int sum, int i, int j) throws MyArrayDataException {
        try {
            sum += Integer.parseInt(myArray[i][j]);
        } catch (NumberFormatException e) {
            throw new MyArrayDataException("Can't cast to type int array element  " + i + "." + j);
        }
        return sum;
    }

    private void handlingArray(String[][] array) {
        try {
            System.out.println("Sum of array elements - " + getArrayElementsSum(array));
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }
    }
}