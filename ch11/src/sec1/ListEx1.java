package sec1;

import java.util.ArrayList;

// Stack, Queue, Set, Map, List 등

public class ListEx1 {

    public static void main(String[] args) {
        String[] author = {"김이름", "이이름", "박이름", "최이름", "정이름", "강이름"};
        ArrayList<Board> lst = new ArrayList<>();
        Board bd1;
        for (int i=0; i<6; i++) {
            bd1 = new Board();
            bd1.setNo(i);
            bd1.setTitle("더미 제목" + i);
            bd1.setContent("더미 글 내용" + i);
            bd1.setAuthor(author[i]);
            bd1.setResDate("2023-07-19");
            lst.add(bd1);
        }

        prt(lst);

    }

    public static void prt(ArrayList<Board> lst) {

        for (Board bd : lst) {
            System.out.println("글번호 : " + bd.getNo());
            System.out.println("글제목 : " + bd.getTitle());
            System.out.println("작성자 : " + bd.getAuthor());
            System.out.println("작성일 : " + bd.getResDate());
            System.out.println();
        }
    }

}
