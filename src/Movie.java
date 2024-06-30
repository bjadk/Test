/**
 * Mapインターフェースを使用して、映画ジャンル別の映画リストを管理するプログラムを作成してください。以下の要件に従ってください。
 * 
 * Movieクラスを作成します。このクラスには、映画のタイトルを表すtitleというString型のフィールドがあります。 Map<String,
 * List<Movie>>のインスタンスを作成し、ジャンル名をキーとし、そのジャンルに属するMovieオブジェクトのリストを値として関連付けます。
 * 複数の映画とそのジャンルをMapに追加します。 特定のジャンルに属する映画のリストを表示するメソッドを実装します。
 */
public class Movie {
	String title;

	Movie(String title) {
		this.title = title;
	}

}