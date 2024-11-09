import java.time.LocalDate;
import java.util.Scanner;

public class Calendar {
    public static void makeCalender(int year, int month) {
        LocalDate localDate = LocalDate.of(year, month, 1);

        int dayOfWeek = localDate.getDayOfWeek().getValue();
        int lastDay = localDate.lengthOfMonth();

        System.out.println("[" + year + "년 " + String.format("%02d", month) + "월]");
        System.out.println("일\t월\t화\t수\t목\t금\t토");


        for (int i = 0; i < dayOfWeek % 7; i++) {
            System.out.print("\t");
        }

        for (int j = 1; j <= lastDay; j++) {
            System.out.printf("%02d\t", j);
            if ((dayOfWeek + j) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("달력의 년도를 입력해주세요.😎");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("달력의 달을 입력해주세요😎");
        int month = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        makeCalender(year,month);
    }


}
