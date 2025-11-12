package com.luxoft.springioc.movies;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Dependency Inversion Principal look https://en.wikipedia.org/wiki/SOLID
 */
@Setter
@Getter
public class MovieLister {
  MovieFinder finder;

  public List<Movie> moviesDirectedBy(String director) {
    return finder.findAll().stream()
                 .filter(movie -> movie.getDirector().equals(director))
                 .toList();
  }
}
