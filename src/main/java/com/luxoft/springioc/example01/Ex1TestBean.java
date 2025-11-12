package com.luxoft.springioc.example01;

import com.luxoft.springioc.movies.FileMovieFinder;
import com.luxoft.springioc.movies.MovieLister;
import lombok.Cleanup;
import lombok.Getter;
import lombok.Setter;
import lombok.val;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.IO.*;

@Getter
@Setter
public class Ex1TestBean {
  String name;

  public Ex1TestBean() {
    println("#Ex1TestBean -> Created ");
  }

  void main() {
    @Cleanup val context = new ClassPathXmlApplicationContext("/example01/application-context.xml");

    println();
    println("--> application-context created");

    println();

    // Извлечение по имени бина:
    if (context.getBean("movieLister") instanceof MovieLister lister) {
      println(lister);

      println();

      // Извлечение зависимости бина
      if (lister.getFinder() instanceof FileMovieFinder finder)
        println(finder.getFileName());
    }

    println();

    // Извлечение по типу:
    val bean = context.getBean(Ex1TestBean.class);
    println(bean.getName());
  }
}
