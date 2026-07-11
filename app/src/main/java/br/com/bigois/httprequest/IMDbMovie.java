package br.com.bigois.httprequest;

import com.google.gson.annotations.SerializedName;

public record IMDbMovie(
        String title,
        String year,
        String rated,
        String released,
        String runtime,
        String genre,
        String director,
        String writer,
        String actors,
        String plot,
        String language,
        String country,
        String awards,
        String poster,
        String metascore,
        @SerializedName("imdbRating") String imdbRating,
        @SerializedName("imdbVotes") String imdbVotes,
        @SerializedName("imdbID") String imdbID,
        String type,
        @SerializedName("totalSeasons") String totalSeasons) {
}
