package com.luxoft.springioc.movies;

import lombok.AllArgsConstructor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest(classes = MyConfig.class)
//@SpringBootTest(classes = {MyBean.class, MyNumSupplier.class})
@AllArgsConstructor(onConstructor_ = @Autowired)
class MyBeanTest {

  MyBean myBean;

  @Test
  @DisplayName("method works correctly")
  void methodWorksCorrectlyTest() {
    // given
    // when
    assertThat(myBean.method(3)).isNotNull()
        // then
        .isEqualTo(58 + "Lorem ipsum");
  }
}
