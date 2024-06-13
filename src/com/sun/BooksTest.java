package com.sun;

public class BooksTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Novel novel = new Novel();
		novel.title = "ノルウェイの森";
		novel.author = "村上春樹";
		novel.ISNB = "123456789";
		AcademicBooks academicBooks = new AcademicBooks();
		academicBooks.title = "経済学の原理";
		academicBooks.author = "マンキュー";
		academicBooks.ISNB = "987654321";
		novel.displayInfo();
		novel.returnBook();
		academicBooks.displayInfo();
		academicBooks.borrowBook();

	}

}
