public class Question3 {
    public static void main(String[] args) {

        int first = 1;
        int second = 1;

        System.out.print(first + " " + second + " ");

        for (int i = 3; i <= 10; i++) {

            int next = first + second;

            System.out.print(next + " ");

            first = second;
            second = next;
        }
    }
}
