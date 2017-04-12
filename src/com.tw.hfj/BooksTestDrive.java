package com.tw.hfj;

public class BooksTestDrive {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new Book();
        books[1] = new Book();
        books[2] = new Book();
        books[0].title = "RevolutionTwenty20";
        books[1].title = "Half GirlFriend";
        books[2].title = "One indian Girl";

        books[0].author = "Chetan Baghat";
        books[1].author = "Chetan Baghat";
        books[2].author = "Chetan Baghat";

        int x = 0;
        while (x < 3) {
            System.out.print(books[x].title);
            System.out.print(" by ");
            System.out.println(books[x].author);
            x = x + 1;
        }
    }
}
