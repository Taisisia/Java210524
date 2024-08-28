package module1.lecture1.module1.lecture3;

public class MainTranslator {
    public static void main(String[] args) {


        TranslatorEnglishToGerman translatorEnglishToGerman1 = new TranslatorEnglishToGerman("Bob", 25, "mann");
        translatorEnglishToGerman1.translatorSpeech();
        translatorEnglishToGerman1.translatorWritten();
        System.out.println();

        TranslatorEnglishToFrench translatorEnglishToFrench1 = new TranslatorEnglishToFrench("Rob", 33, "mann");
        translatorEnglishToFrench1.translatorSpeech();
        translatorEnglishToFrench1.translatorWritten();
        System.out.println();

        TranslatorUkrainianToEnglish translatorUkrainianToEnglish = new TranslatorUkrainianToEnglish("Lili", 19, "woman");
        translatorUkrainianToEnglish.translatorSpeech();
        translatorUkrainianToEnglish.translatorWritten();
        System.out.println();
    }
}
