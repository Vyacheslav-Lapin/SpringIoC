package com.luxoft.springioc.example14;

import lombok.Cleanup;
import lombok.Getter;
import lombok.Setter;
import lombok.val;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.IO.*;

interface UserDirectory { }
class DatabaseUserDirectory implements UserDirectory { }
class LDAPUserDirectory implements UserDirectory { }
class MockUserDirectory implements UserDirectory { }
class LoginManager { @Getter @Setter UserDirectory userDirectory; }
class UserInfo { @Getter @Setter UserDirectory ldapUserDirectory; }
class UserDirectorySearch { @Getter @Setter LDAPUserDirectory userDirectory; }

public class Main {
  void main() {
    @Cleanup val context = new ClassPathXmlApplicationContext("/example14/application-context.xml");

    if (context.getBean("loginManager") instanceof LoginManager loginManager) {
      println(loginManager.getUserDirectory().getClass().getSimpleName());

      if (context.getBean("userDirectorySearch") instanceof UserDirectorySearch userDirectorySearch) {
        println(userDirectorySearch.getUserDirectory().getClass().getSimpleName());

        if (context.getBean("userInfo") instanceof UserInfo userInfo) {
          println(userInfo.getLdapUserDirectory().getClass().getName());

          println(loginManager.getUserDirectory() == userDirectorySearch.getUserDirectory());
          println(userInfo.getLdapUserDirectory().getClass().getSimpleName());
        }
      }
    }
  }
}
