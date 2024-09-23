class SumAndAvg {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int n = numbers.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }
        double avg = (double) sum / n;

        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Sum of the numbers: " + avg);
    }
}




