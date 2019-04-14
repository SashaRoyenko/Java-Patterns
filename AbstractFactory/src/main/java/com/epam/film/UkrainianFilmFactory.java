package com.epam.film;

import com.epam.audio.AudioFactory;
import com.epam.audio.UkrainianAudio;
import com.epam.subtitles.SubtitleFactory;
import com.epam.subtitles.UkrainianSubtitles;

public class UkrainianFilmFactory implements FilmFactory {
    public AudioFactory getAudio() {
        return new UkrainianAudio();
    }

    public SubtitleFactory getSubtitles() {
        return new UkrainianSubtitles();
    }
}
