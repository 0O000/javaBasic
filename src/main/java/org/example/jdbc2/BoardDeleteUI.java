package org.example.jdbc2;

import java.util.Scanner;

public class BoardDeleteUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("no 입력: ");
        int no값 = sc.nextInt();

        BoardDAO dao = new BoardDAO();
        dao.delete(no값);
    }
}