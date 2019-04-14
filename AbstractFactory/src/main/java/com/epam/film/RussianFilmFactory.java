package com.epam.film;

import com.epam.audio.AudioFactory;
import com.epam.audio.RussianAudio;
import com.epam.subtitles.RussianSubtitles;
import com.epam.subtitles.SubtitleFactory;

public class RussianFilmFactory implements FilmFactory {
    public AudioFactory getAudio() {
        return new RussianAudio();
    }

    public SubtitleFactory getSubtitles() {
        return new RussianSubtitles();
    }
}
