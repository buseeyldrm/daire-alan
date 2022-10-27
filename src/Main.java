import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double pi=3.14;
        Scanner klavye=new Scanner(System.in);
        System.out.print("dairenin yarıçapını girin: ");
        int r= klavye.nextInt();
        System.out.print("dairenin açısını girin: ");
        int aci= klavye.nextInt();

        double alan=(pi*(r*r)*aci)/360;
        System.out.println("dairenin alanı: " +alan);

    }
}