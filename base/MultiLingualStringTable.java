package base;

/**
 * Represents a table of multilingual strings.
 * 
 * The class provides messages in different languages.
 * 
 * @author Kevan Buckley, maintained by __student
 * @version 2.0, 2014
 */
public class MultiLingualStringTable {
    private enum LanguageSetting {
        English, Klingon
    }

    private static LanguageSetting currentLanguage = LanguageSetting.English;
    private static String[] englishMessages = { "Enter your name:", "Welcome", "Have a good time playing Abominodo" };
    private static String[] klingonMessages = { "'el lIj pong:", "nuqneH", "QaQ poH Abominodo" };

    /**
     * Gets a message from the string table based on the index and current language setting.
     * 
     * @param index The index of the message to retrieve
     * @return The message in the selected language
     */
    public static String getMessage(int index) {
        if (currentLanguage == LanguageSetting.English) {
            return englishMessages[index];
        } else {
            return klingonMessages[index];
        }
    }
}
