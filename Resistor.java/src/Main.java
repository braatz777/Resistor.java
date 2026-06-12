import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (true){

            System.out.println("0 - Out");
            System.out.println("1 - Vin");
            System.out.println("2 - Vout");
            System.out.println("3 - R1");
            System.out.println("4 - R2");
            System.out.print("Escolha:");
            String op = sc.next();

            switch (op) {
                case "0":
                    break;

                case "1":
                    System.out.print("Informe Vout:");
                    Double vout = sc.nextDouble();
                    System.out.print("Informe R1:");
                    Double r1 = sc.nextDouble();
                    System.out.print("Informe R2:");
                    Double r2 = sc.nextDouble();
                    Double a = vout * ((r1 + r2) / r2);
                    System.out.println(a);
                    break;

                case "2":
                    System.out.print("Informe Vin:");
                    Double vin = sc.nextDouble();
                    System.out.print("Informe R1:");
                    r1 = sc.nextDouble();
                    System.out.print("Informe R2:");
                    r2 = sc.nextDouble();
                    a = vin * (r2 / (r1 + r2));
                    System.out.println(a);
                    break;

                case "3":
                    System.out.print("Informe Vin:");
                    vin = sc.nextDouble();
                    System.out.print("Informe Vout:");
                    vout = sc.nextDouble();
                    System.out.print("Informe R2:");
                    r2 = sc.nextDouble();
                    a = r2 * ((vin / vout) - 1);
                    System.out.println(a);
                    break;

                case "4":
                    System.out.print("Informe Vin:");
                    vin = sc.nextDouble();
                    System.out.print("Informe Vout:");
                    vout = sc.nextDouble();
                    System.out.print("Informe R1:");
                    r1 = sc.nextDouble();
                    a = r1 / ((vin / vout) - 1);
                    System.out.println(a);
                    break;
            }
        }
    }
}