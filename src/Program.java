
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        int N = 0;


        if (args.length > 0) {
            try {
                N = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Аргумент має бути цілим числом!");
                return;
            }
        } else {

            System.out.println("Введіть N (кількість перших чисел Люка): ");
            try {
                Scanner sc = new Scanner(System.in);
                N = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Помилка введення!");
                return;
            }
        }

        if (N <= 0) {
            System.out.println("N має бути додатнім!");
            return;
        }

        LucasNumber[] numbers = new LucasNumber[N];

        long L0 = 1;
        long L1 = 3;

        numbers[0] = new LucasNumber(0, L0);
        if (N > 1) numbers[1] = new LucasNumber(1, L1);

        for (int i = 2; i < N; i++) {
            long Lnext = L0 + L1;
            numbers[i] = new LucasNumber(i, Lnext);
            L0 = L1;
            L1 = Lnext;
        }

        System.out.println("Перші " + N + " чисел Люка:");
        for (LucasNumber ln : numbers) {
            int index = ln.getIndex();
            long value = ln.getValue();
            String iscube = "";

            if(ln.isCube()){
                iscube = " (є кубом:" + Math.round(Math.cbrt(value)) + "^3)";
            }

            System.out.println("L" + index+ " = " + value + iscube);
        }
    }
}