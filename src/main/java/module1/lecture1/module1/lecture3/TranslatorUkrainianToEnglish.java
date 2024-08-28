package module1.lecture1.module1.lecture3;

public class TranslatorUkrainianToEnglish extends Translator {
    public TranslatorUkrainianToEnglish(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void translatorSpeech() {
        System.out.println(name + " " + age + " " + gender + " interpretation from Ukrainian to English");
    }
    public void translatorWritten() {
        System.out.println(name + " " + age + " " + gender + " written translation from Ukrainian to English");
    }
}
