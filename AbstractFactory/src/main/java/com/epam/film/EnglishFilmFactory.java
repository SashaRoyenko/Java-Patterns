package com.epam.film;

import com.epam.audio.AudioFactory;
import com.epam.audio.EnglishAudio;
import com.epam.subtitles.EnglishSubtitles;
import com.epam.subtitles.SubtitleFactory;

public class EnglishFilmFactory implements FilmFactory {
    public AudioFactory getAudio() {
        return new EnglishAudio();
    }

    public SubtitleFactory getSubtitles() {
        return new EnglishSubtitles();
    }
}
