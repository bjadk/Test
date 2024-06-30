import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieTest {
	private static Map<String, List<Movie>> genreToMovie = new HashMap<>();

	public static void addMovie(String genre, Movie movie) {
		genreToMovie.computeIfAbsent(genre, k -> new ArrayList<>()).add(movie);

	}

	public static void printMoviesInGenre(String genre) {
		if (genreToMovie.containsKey(genre)) {
			System.out.print(genre + "の映画: ");
			List<Movie> movies = genreToMovie.get(genre);
			for (int i = 0; i < movies.size(); i++) {
				System.out.print(movies.get(i).title);
				if (i < movies.size() - 1) {
					System.out.print(", ");
				}
			}
			System.out.println();
		} else {
			System.out.println(genre + "の映画は見つかりませんでした。");
		}
	}

	public static void main(String[] args) {
		addMovie("アクション", new Movie("スピード"));
		addMovie("アクション", new Movie("ダイ・ハード"));
		addMovie("コメディ", new Movie("ホーム・アローン"));
		addMovie("コメディ", new Movie("エアプレイン！"));

		printMoviesInGenre("アクション");
		printMoviesInGenre("コメディ");
	}
}
