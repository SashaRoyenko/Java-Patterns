package com.epam;

public class Main {
    public static void main(String[] args) {
        ArticleFactory java = new ArticleFactory(new Article("JAVA", "Java is a general-purpose " +
                "computer-programming language that is concurrent, class-based, object-oriented,[15]and " +
                "specifically designed to have as few implementation dependencies as possible."));
        ArticleFactory patern = new ArticleFactory(new Article("Pattern", "A pattern is a regularity in the " +
                "world, man-made design, or abstract ideas."));
        Article copyTitle = java.cloneArticle();

        System.out.println(java);
        System.out.println(copyTitle);

        copyTitle.setTitle("Java");
        System.out.println(java);
        System.out.println(copyTitle);

        System.out.println(patern);
    }
}
