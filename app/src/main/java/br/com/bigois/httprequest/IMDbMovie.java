package br.com.bigois.httprequest;

import com.google.gson.annotations.SerializedName;

public record IMDbMovie(
        @SerializedName("Title") String title,
        @SerializedName("Year") int year,
        @SerializedName("Rated") String rated,
        @SerializedName("Released") String released,
        @SerializedName("Runtime") String runtime,
        @SerializedName("Genre") String genre,
        @SerializedName("Director") String director,
        @SerializedName("Writer") String writer,
        @SerializedName("Actors") String actors,
        @SerializedName("Plot") String plot,
        @SerializedName("Language") String language,
        @SerializedName("Country") String country,
        @SerializedName("Awards") String awards,
        @SerializedName("Poster") String poster,
        @SerializedName("Metascore") String metascore,
        String imdbRating,
        String imdbVotes,
        String imdbID,
        @SerializedName("Type") String type,
        String totalSeasons) {
}
