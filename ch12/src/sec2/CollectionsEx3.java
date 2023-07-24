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

        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        System.out.println(month + "월");
        System.out.println("일\t 월\t 화\t 수\t 목\t 금\t 토");

        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(2023, month-1, 1);
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));

    }

}
