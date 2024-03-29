package cwiczenia31do60.cwicz57;
//Ćwiczenie
//        Napisz program, w którym użytkownik ma do wyboru dwie opcje:
//
//        dodanie nowego produktu,
//        koniec programu.
//        Po wybraniu opcji "dodaj nowy produkt",
//        użytkownik wprowadza nazwę i cenę produktu. W programie przechowujemy informacje jedynie
//        o unikalnych produktach, przy czym przy sprawdzaniu unikalności interesuje nas jedynie nazwa.
//        Jeżeli produkt o takiej samej nazwie był już dodany do bazy produktów wcześniej,
//        to program powinien zapytać, czy ma nadpisać poprzedni obiekt (który może mieć inną cenę),
//        czy ma zignorować nowo dodawany produkt.
//
//        Po wybraniu opcji "koniec programu", w konsoli powinny zostać wyświetlone wszystkie
//        dodane produkty i program powinien zakończyć swoje działanie.
public class ProductApp {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();

        productManager.mainLoop();
    }
}
