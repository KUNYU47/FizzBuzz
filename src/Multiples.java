public class Multiples {

    public static void main(String[] args) {

        int count = 0;

        for (int i = 1; i <= 1000; i++) {

            boolean divisableBy3 = i % 3 == 0;
            boolean divisableBy5 = i % 5 == 0;

            if (divisableBy3 || divisableBy5) {

                count++;
            }
        }

        String result = Integer.toString(count);
        System.out.println(result);
    }
}
