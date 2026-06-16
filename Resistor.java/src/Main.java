import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("-".repeat(20) + "Resistor" + "-".repeat(20));
            System.out.println("0 - Out");
            System.out.println("1 - Vin");
            System.out.println("2 - Vout");
            System.out.println("3 - R1");
            System.out.println("4 - R2");
            System.out.print("Escolha:");
            String op = sc.next();
            Double vin;
            Double vout;
            Double r1;
            Double r2;
            Double a;

            switch (op) {
                case "0":
                    System.exit(0);

                case "1":
                    Op.Vin();
                    break;

                case "2":
                    Op.Vout();
                    break;

                case "3":
                    Op.R1();
                    break;

                case "4":
                    Op.R2();
                    break;
            }
        }
    }
}