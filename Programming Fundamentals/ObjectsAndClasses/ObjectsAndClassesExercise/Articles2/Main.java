package ObjectsAndClassesExercise.Articles2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Article> articles = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String [] articleData = scanner.nextLine().split(", ");
            String title = articleData[0];
            String content = articleData[1];
            String author = articleData[2];
            Article article = new Article(title, content, author);
            articles.add(article);
        }

        String type = scanner.nextLine();
        switch(type){
            case "title":
                articles.sort(Comparator.comparing(Article::getTitle));
                break;
            case "content":
                articles.sort(Comparator.comparing(Article::getContent));
                break;
            case "author":
                articles.sort(Comparator.comparing(Article::getAuthor));
                break;
        }

        articles.forEach(System.out::println);
    }
}
