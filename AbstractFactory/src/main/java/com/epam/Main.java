package com.epam;

import com.epam.film.EnglishFilmFactory;
import com.epam.film.FilmFactory;
import com.epam.film.RussianFilmFactory;
import com.epam.film.UkrainianFilmFactory;

public class Main {
    public static void main(String[] args) {
        FilmFactory film = getFilm("UA");
        film.getAudio().showAudio();
        film.getSubtitles().showSubtitles();
    }

    private static FilmFactory getFilm(String language){
        switch (language){
            case "UA":
                return new UkrainianFilmFactory();
            case "RU":
                return new RussianFilmFactory();
            case "EN":
                return new EnglishFilmFactory();
            default:
                throw new IllegalArgumentException("There is no such film");
        }
    }
}
