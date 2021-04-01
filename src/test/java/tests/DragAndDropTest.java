package tests;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DragAndDropTest {

  @BeforeAll
  static void setup() {
    Configuration.startMaximized = true;
  }

  @Test
  void moveUsingDragAndDrop() {
    open("https://the-internet.herokuapp.com/drag_and_drop");
    $("#columns #column-a header").shouldHave(text("A"));
    $("#column-a").dragAndDropTo($("#column-b"));
    $("#columns #column-a header").shouldHave(text("B"));
  }
}
