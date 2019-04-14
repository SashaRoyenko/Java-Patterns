package com.epam.film;

import com.epam.audio.AudioFactory;
import com.epam.subtitles.SubtitleFactory;

public interface FilmFactory {
    AudioFactory getAudio();
    SubtitleFactory getSubtitles();
}
