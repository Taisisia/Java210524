package module1.lecture1.module1.lecture3;

public abstract class Translator {
    //    1) Есть абстрактный класс Переводчик, который имеет характеристики имя, возраст, пол и умеет переводить с одного языка на другой.
//Реализовать данный класс и создать несколько потомков классов различных переводчиков с одного языка на другой.
//Например с английского на русский, с русского на немецкий и т.п.
//Продумайте какова архитектура наследования будет в данном приложении.
//Можем ли мы использовать абстрактные классы и методы?
    public String name;
    public int age;
    public String gender;

    public Translator(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public abstract void translatorSpeech ();
    public abstract void translatorWritten ();


}
