package ua.lviv.iot.musicshop.manager;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextRegex {

  public String deleteAllWordsOfSomeLengthBeginningWithConsonant(String text, int lengthOfWordsDeleted) {
    Pattern pattern = Pattern.compile("\\b[\\w&&[^aeiouAEIOU\\s]]\\w{" + (lengthOfWordsDeleted - 1) + "}\\b");
    Matcher matcher = pattern.matcher(text);
    while (matcher.find()) {
      text = text.replace(matcher.group(), "");
    }
    Pattern whitespacesDelete = Pattern.compile("[\\W]");
    int i = 0;
    while (i < text.length()) {
      if ((text.charAt(i) == ' ' && i == 0) ||
          (text.charAt(i) == ' ' && whitespacesDelete.matcher(text.substring(i + 1, i + 2))
              .matches())) {
        text = text.substring(0, i) + text.substring(i + 1);
      } else {
        i += 1;
      }
    }

    return text;
  }
}
