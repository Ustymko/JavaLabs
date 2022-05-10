package ua.lviv.iot.musicshop.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TextRegexTest {

  @Test
  void textEdit() {
    TextRegex someText = new TextRegex();
    String text =
        " Lorem Ipsum is simply dummy text of the printing and typesetting industry. pack "
            + "Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown "
            + "printer took a galley of type and scrambled it to make a type specimen book. It has survived "
            + "not only five centuries, but also the leap into electronic typesetting, remaining essentially "
            + "unchanged. It was popularised in the 1960s with the release of Letraset sheets containing "
            + "Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker "
            + "including versions of Lorem Ipsum.";
    String actual =
        "Lorem Ipsum is simply dummy of the printing and setting industry. Ipsum has the "
            + "industry's standard dummy ever since the 1500s, an unknown printer a galley of and scrambled "
            + "it to a specimen. It has survived not only centuries, but also the into electronic setting, "
            + "remaining essentially unchanged. It was popularised in the 1960s the release of Letraset sheets "
            + "containing Lorem Ipsum passages, and recently desktop publishing software Aldus PageMaker including "
            + "versions of Lorem Ipsum.";

    String result = someText.textEdit(text, text.length());
    Assertions.assertFalse(result.isEmpty());
    Assertions.assertEquals(result, actual);
  }
}
