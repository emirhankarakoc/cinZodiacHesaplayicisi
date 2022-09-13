import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//guzel bir switchcase ornegi
        Scanner scanner = new Scanner(System.in);
        short dogumTarihi;
        System.out.println("Lutfen dogum tarihinizi yil cinsinden yaziniz.");
        dogumTarihi = scanner.nextShort();
        int zodiac = dogumTarihi % 12;
        switch (zodiac) {
            case 0:
                System.out.println("maymun");
                break;
            case 1:
                System.out.println("horoz");
                break;
            case 2:
                System.out.println("kopek");
                break;
            case 3:
                System.out.println("domuz");
                break;
            case 4:
                System.out.println("fare");
                break;
            case 5:
                System.out.println("okuz");
                break;
            case 6:
                System.out.println("kaplan");
                break;
            case 7:
                System.out.println("tavsan");
                break;
            case 8:
                System.out.println("ejderha");
                break;
            case 9:
                System.out.println("yilan");
                break;
            case 10:
                System.out.println("at");
                break;
            case 11:
                System.out.println("koyun");
                break;

            default:
                System.out.println("boyle bir ihtimal yok aslinda, koyalim diye koydum burayi XD");

        }



    }
}