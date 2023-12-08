import java.util.Scanner;
// Kilo (kg) / Boy(m) * Boy(m)
public class Kitle {
    public static void main(String[] args) {
        float kg , boy , end;
        Scanner vr = new Scanner(System.in);
        System.out.println("Buraya Kilonuzu Giriniz : ");
        kg = vr.nextFloat();
        System.out.println("Buraya Boyunuzu Giriniz : ");
        boy = vr.nextFloat();
        end = kg / (boy*boy);
        System.out.println("Vücut Kitle Endeksiniz : "+ end);

    }
}
