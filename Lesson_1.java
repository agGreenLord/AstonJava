import java.util.GregorianCalendar;
import java.util.Arrays;


public class Lesson_1 {
      
    public static void main(String[] args) {

        printThreeWords("Orange", "Banana", "Apple");
        checkSumSign(3, 6);
        printColor(10);
        compareNumbers(10, 2);
        checkRange(5, 6);
        checkPositiveNumber(-7);
        boolchekPositiveNuber(11);
        countString("Hello!", 5);
        leapYearCheck(2045);
        numberList(new int[] {1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1});
        numberMassive(new int[100]);
        changeMassive(new int[] { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 });
        matrixMassive(new int[5][5]);
        createMassive(5, 10);

    }
        public static void printThreeWords(String word1, String word2, String word3) {
            System.out.println(word1);
            System.out.println(word2);
            System.out.println(word3);
        }
        
        public static void checkSumSign(int a, int b) {
            int sum = a + b;
            if (sum >= 0) {
                System.out.println("Сумма положительная");
            } else {
                System.out.println("Сумма отрицательная");
            }
            }

        public static void printColor(int value){
            if (value <=0){
                System.out.println("Красный");
            } else if (0 < value && value <= 100) {
                System.out.println("Желтый");
            } else {
                System.out.println("Зеленый");
            }
            }
        public static void compareNumbers(int a, int b) {
            if (a >= b) {
                System.out.println("a >= b");
            } else {
                System.out.println("a < b");
            }
            }
            public static boolean checkRange(int a, int b) {
                int sum = a + b;
                if (10 <= sum && sum <= 20) {
                    System.out.print(sum + " - входит в диапозон");
                    return true;
                } else {
                    System.out.print(sum + " - не входит в диапозон");
                    return false;
                }
            }
            public static void checkPositiveNumber(int a) {
                if (a >= 0) {
                    System.out.println("Число положительное");
                } else {
                    System.out.println("Число отрицательное");
                }
            }
            public static boolean boolchekPositiveNuber(int a) {
                if (a >= 0) {
                    return true;
                } else {
                    return false;
            }
            }
            public static void countString(String str, int a) {
                for (; a > 0; a--) {
                    System.out.println(str + " ");

                }
            }
            public static boolean leapYearCheck(int year) {
                GregorianCalendar calendar = new GregorianCalendar();
                if (calendar.isLeapYear(year)) {
                    System.out.print(year + " - високосный год");
                    return true;
                } else {
                    System.out.println(year + " - не високосный год");
                    return false;
                }
            }
            public static void numberList(int[] nums) {
                for (int i = 0; i<nums.length; i++) {
                    if (nums[i] == 1) {
                        nums[i] = 0;
                    } else {
                        nums[i] = 1;
                    }
                }
                System.out.println(Arrays.toString(nums));
            }
            public static void numberMassive(int[] nums) {
                for (int i = 0 ; i < 100; i++) {
                    nums[i] = i+1;
                }
                System.out.println(Arrays.toString(nums));
            }
            public static void changeMassive(int[] nums) {
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] < 6) {
                        nums[i] = nums[i] * 2;
                    }
                }
                System.out.println(Arrays.toString(nums));
            }
            public static void matrixMassive(int[][] tables) {
                for (int i=0; i < 5; i++) {
                    for (int j=0; j < 5; j++) {
                    if (i == j) {  
                        tables[i][j] = 1;
                    }
                    }
                }
                System.out.println("Матричная таблица");
                for (int i=0; i < 5; i++) {
                    for (int j=0; j < 5; j++) {
                        System.out.print(tables[i][j] + " ");
                    }
                    System.out.println();
                }
            }
            public static void createMassive(int len, int value) {
                int[] nums = new int[len];
                for (int i = 0; i < len; i++) {
                    nums[i] = value;
                }
                System.out.println(Arrays.toString(nums));

            }


        }
        
            

  




