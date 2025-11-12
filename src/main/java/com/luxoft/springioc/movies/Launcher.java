package com.luxoft.springioc.movies;

import lombok.val;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.IO.*;

/**
 * Look https://martinfowler.com/articles/injection.html for details.
 */
public class Launcher {
  void main1() {
    MovieFinder finder = new FileMovieFinder();

    val lister = new MovieLister();
    lister.setFinder(finder);

    val filtered = lister.moviesDirectedBy("Spielberg");
    print(filtered);
  }

  void main() {
    val context = new ClassPathXmlApplicationContext("/movies/application-context.xml");

    if (context.getBean("movieLister") instanceof MovieLister lister) {
      val filtered = lister.moviesDirectedBy("Spielberg");
      println(filtered);
    }

  }
}
