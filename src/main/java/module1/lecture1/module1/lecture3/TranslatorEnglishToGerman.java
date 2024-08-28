package module1.lecture1.module1.lecture3;

public class TranslatorEnglishToGerman extends Translator {
    public TranslatorEnglishToGerman(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void translatorSpeech() {

        System.out.println(name + " " + age + " " + gender + " interpretation from English to German");

    }
    public void translatorWritten() {
        System.out.println(name + " " + age + " " + gender + " written translation from English to German");
    }
}
