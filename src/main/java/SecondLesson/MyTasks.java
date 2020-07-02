package SecondLesson;

public class MyTasks {
    public static void main(String[] args) {

        //Задание 1
        int[] firstArr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < firstArr.length; i++) {
            if (firstArr[i] == 1) {
                firstArr[i] = 0;
            } else {
                firstArr[i] = 1;
            }
        }

        //Задание 2
        int[] secondArr = new int[8];
        for (int i = 1; i < secondArr.length; i++) {
            secondArr[i] = secondArr[i - 1] + 3;
        }
        //Задание 3
        int[] arrThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrThree.length; i++) {
            if (arrThree[i] < 6) {
                arrThree[i] *= 2;
            }
        }

        //Задание 4
        int[][] arrFour = new int[6][6];
        for (int i = 0; i < arrFour.length; i++) {
            int x = arrFour[i].length - 1;
            for (int j = 0; j < arrFour[i].length; j++) {
                if (i == j || i == x) {
                    arrFour[i][j] = 1;
                } else {
                    arrFour[i][j] = 0;
                }
                x--;
            }
        }
        //Задание 5
        int[] arrFive = new int[8];
        for (int i = 0; i < arrFive.length; i++) {
            arrFive[i] = (int) (Math.random() * 30);
        }
        int maxValue = arrFive[0];
        int minValue = arrFive[0];
        for (int i = 1; i < arrFive.length; i++) {
            if (arrFive[i] > maxValue) {
                maxValue = arrFive[i];
            }
            if (arrFive[i] < minValue) {
                minValue = arrFive[i];
            }
        }
    }

    //Задание 6
    public static boolean isEqualSumOfParts(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        int sumRight = arr[j];
        int sumLeft = arr[i];
        boolean bool = false;
        while (i < j) {
            if (arr.length == 2 && sumLeft == sumRight) {
                bool = true;
            } else if (arr.length == 2) {
                break;
            }
            if (sumLeft < sumRight && arr[i + 1] > 0) {
                i++;
                sumLeft += arr[i];
            } else if (sumLeft > sumRight && arr[j - 1] < 0) {
                i++;
                sumLeft += arr[i];
            } else {
                j--;
                sumRight += arr[j];
            }
            if (sumLeft == sumRight && i == (j - 1)) {
                bool = true;
                break;
            }
        }
        return bool;
    }

    //Задание 7
    public static void reverseArray(int[] arr, int n) {
        if (n < 0) {
            for (int i = 0; i > n; i--) {
                int tmp = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = tmp;
            }
        }
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int tmp = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = tmp;
            }
        }
    }
}
