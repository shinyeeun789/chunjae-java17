package sec2;

import java.util.Calendar;
import java.util.Scanner;

public class CollectionsEx3 {

    public static void main(String[] args) {

        // 입력한 월의 달력 출력하기
        // 만약, 7월의 경우
        /*
        7월

        일   월   화    수   목    금   토
                                      1
        2    3    4    5    6    7    8
        9    10   11   12   13   14   15
        16   17   18   19   20   21   22
        23   24   25   26   27   28   29
        30   31
        */

        System.out.print("달력을 출력하고 싶은 월 : ");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(2023, month-1, 1);

        // 달력 출력
        System.out.printf("\n========== %d월 ===========\n", month);
        System.out.println("일\t월\t화\t수\t목\t금\t토");

        for (int i=0; i<6; i++) {
            for (int j=1; j<=7; j++) {
                int date = (7 * i + j) - (cal.get(Calendar.DAY_OF_WEEK) - 1);
                if (date < 1) {
                    System.out.print("\t");
                } else if(date <= cal.getActualMaximum(Calendar.DAY_OF_MONTH)) {
                    System.out.print(date + "\t");
                } else {
                    break;
                }
            }
            System.out.println();
        }

    }

}
