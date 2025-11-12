package com.luxoft.springioc.example21;

import lombok.AllArgsConstructor;
import lombok.Cleanup;
import lombok.Data;
import lombok.Getter;
import lombok.val;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import static java.lang.IO.*;

@Data
class MovieFinder {
  String name;
}

@Getter
@Service
@AllArgsConstructor
public class SimpleMovieLister {

  @Qualifier("movieFinder2")
  MovieFinder movieFinder;

  //	@Autowired
//	@Qualifier("movieFinder23")
//	public void setMovieFinder(FileMovieFinder movieFinder) {
//		System.out.println("-->");
//		this.movieFinder = movieFinder;
//	}

  static void main() {
    @Cleanup val context = new ClassPathXmlApplicationContext("/example21/application-context.xml");
    if (context.getBean("simpleMovieLister") instanceof SimpleMovieLister simpleMovieLister) {
      println(simpleMovieLister.getMovieFinder().getName());
    }
  }
}
