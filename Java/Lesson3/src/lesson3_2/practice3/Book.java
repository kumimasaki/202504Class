package lesson3_2.practice3;

public class Book {
	// メンバ変数
	// タイトル
	private String title;
	// 著者
    private String author;
    // ジャンル
    private String genre;
    
    // コンストラクタ
	public Book(String title, String author, String genre) {
		this.title = title;
		this.author = author;
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", genre=" + genre + "]";
	}
    
}
