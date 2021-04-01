package tests;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PageSelenideInGithubTest {

  @BeforeAll
  static void setup() {
    Configuration.startMaximized = true;
  }

  @Test
  void successfulFillTest() {
    open("https://github.com/selenide/selenide");
    $("[data-tab-item=i4wiki-tab]").click();
    $$("#wiki-pages-box li").find(Condition.exactText("SoftAssertions")).click();
    $$("#wiki-body li").filterBy(text("Using JUnit5 extend test class")).shouldHaveSize(1);
  }
}
