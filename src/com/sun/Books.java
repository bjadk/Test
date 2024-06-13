package com.sun;

/**
 * 「書籍」の抽象クラスと、インターフェース「借りる可能」を作成します。抽象クラス「書籍」には、書籍のタイトル、著者、ISBN番号を格納する属性と、
 * 書籍情報を出力する抽象メソッドを含めてください。インターフェース「借りる可能」には、書籍を借りるときのメソッドと返却するときのメソッドを定義します。派生クラス「小説」、
 * 「学術書」を作成し、これらのクラスで「書籍」の抽象メソッドを実装し、
 * 「借りる可能」インターフェースのメソッドをオーバーライドしてください。また、各書籍タイプに特有の属性やメソッドを追加してください。
 * 
 * 
 */
public abstract class Books {
	String title;
	String author;
	String ISNB;

	abstract void displayInfo();
}

interface Borrowable {
	void returnBook();

	void borrowBook();
}

class Novel extends Books implements Borrowable {

	@Override
	public void returnBook() {
		// TODO Auto-generated method stub
		System.out.println("小说还回来");
	}

	@Override
	public void borrowBook() {
		// TODO Auto-generated method stub
		System.out.println("小说借走");
	}

	@Override
	void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("小说的名字：" + title + ",作者：" + author + ", ISNB ：" + ISNB);
	}

}

class AcademicBooks extends Books implements Borrowable {

	@Override
	public void returnBook() {
		// TODO Auto-generated method stub
		System.out.println("学术书还回来");
	}

	@Override
	public void borrowBook() {
		// TODO Auto-generated method stub
		System.out.println("学术书借出去");
	}

	@Override
	void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("小说的名字：" + title + ",作者: " + author + ",ISNB: " + ISNB);
	}

}
