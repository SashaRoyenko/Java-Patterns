package com.epam;

public class ArticleFactory {
    private Article article;

    public ArticleFactory(Article article) {
        this.article = article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Article cloneArticle(){
        return (Article)article.copy();
    }

    public Article getArticle() {
        return article;
    }

    @Override
    public String toString() {
        return "ArticleFactory{" +
                "article=" + article +
                '}';
    }
}
