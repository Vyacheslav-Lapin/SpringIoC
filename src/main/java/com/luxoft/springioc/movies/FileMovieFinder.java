package com.luxoft.springioc.movies;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class FileMovieFinder implements MovieFinder {
  String fileName;

  @Override
  public List<Movie> findAll() {
    return new ArrayList<>();
  }
}
