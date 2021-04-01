package tests;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LocatorTest {

  @BeforeAll
  static void setup() {
    Configuration.startMaximized = true;
  }

  @Test
  void locatorTest() {
    open("https://github.com/explore");
    SelenideElement elementByLocator1 = $("h1").$("a");
    SelenideElement elementByLocator2 = $("h1 a");
    assertEquals(elementByLocator1, elementByLocator2);
  }
}
