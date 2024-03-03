import java.util.Scanner;

class Book {
String title;

void inputTitle() {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter book title: ");
title = scanner.nextLine();
}
}

class Novel extends Book {
String genre;

void inputGenre() {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter genre: ");
genre = scanner.nextLine();
}

void inputNovelDetails() {
inputTitle();
inputGenre();
}
}

public class MainBook {
public static void main(String[] args) {
Novel novel = new Novel();
novel.inputNovelDetails();

// Printing the details
System.out.println("Novel Details:");
System.out.println("Title: " + novel.title);
System.out.println("Genre: " + novel.genre);
}
}
