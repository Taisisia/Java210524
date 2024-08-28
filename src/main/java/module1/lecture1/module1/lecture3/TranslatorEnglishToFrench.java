package module1.lecture1.module1.lecture3;

public class TranslatorEnglishToFrench extends Translator {
    public TranslatorEnglishToFrench(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void translatorSpeech() {
        System.out.println(name + " " + age + " " + gender + " interpretation from English to French");
    }

    @Override
    public void translatorWritten() {
        System.out.println(name + " " + age + " " + gender + " written translation from English to French");
    }
}
