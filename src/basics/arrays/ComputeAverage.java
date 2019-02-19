package basics.arrays;

public class ComputeAverage {

    public static void main(String[] args) {

        int[] numbers = getNumbers();
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        int average = sum / numbers.length;

        System.out.println("Average is " + average);

    }

    private static int[] getNumbers() {
        int[] numbers = new int[5];
        numbers[0] = 12;
        numbers[1] = 2;
        numbers[2] = 34;
        numbers[3] = 43;
        numbers[4] = 5;

        return numbers;
    }
}
