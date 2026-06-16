import java.util.Scanner;

public class Op {
    public static void Vin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe Vout:");
        Double vout = sc.nextDouble();
        System.out.print("Informe R1:");
        Double r1 = sc.nextDouble();
        System.out.print("Informe R2:");
        Double r2 = sc.nextDouble();
        Double a = vout * ((r1 + r2) / r2);
        System.out.println(a);
    }

    public static void Vout() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe Vin:");
        Double vin = sc.nextDouble();
        System.out.print("Informe R1:");
        Double r1 = sc.nextDouble();
        System.out.print("Informe R2:");
        Double r2 = sc.nextDouble();
        Double a = vin * (r2 / (r1 + r2));
        System.out.println(a);
    }

    public static void R1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe Vin:");
        Double vin = sc.nextDouble();
        System.out.print("Informe Vout:");
        Double vout = sc.nextDouble();
        System.out.print("Informe R2:");
        Double r2 = sc.nextDouble();
        Double a = r2 * ((vin / vout) - 1);
        System.out.println(a);
    }

    public static void R2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe Vin:");
        Double vin = sc.nextDouble();
        System.out.print("Informe Vout:");
        Double vout = sc.nextDouble();
        System.out.print("Informe R1:");
        Double r1 = sc.nextDouble();
        Double a = r1 / ((vin / vout) - 1);
        System.out.println(a);
    }
}
