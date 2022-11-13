public class Main {
    public static void main(String[] args) {
//Exc.1,2,3
// task 1
        // сообщение в формате:
        // Привет! Меня зовут …. Я из города …. Мне  … лет.
        human Maksim = new human("Максим", "Минск", 35);
        Maksim.salute();
        System.out.println();

        human Anna = new human("Аня", "Москва", 29);
        Anna.salute();
        System.out.println();

        human Kate = new human("Катя", "Калининград", 28);
        Kate.salute();
        System.out.println();

        human Artem = new human("Артем", "Москва", 29);
        Artem.salute();
        System.out.println();

        //task 2
        // сообщение в формате :
        // ”Привет! Меня зовут …. Я из города …. Мне  … лет. Я работаю на должности… . Будем знакомы!”
        Maksim.job = "бренд-менеджер";
        Maksim.greeting();
        System.out.println();

        Anna.job = "методист образовательных программ";
        Anna.greeting();
        System.out.println();

        Kate.job = "продакт-менеджер";
        Kate.greeting();
        System.out.println();

        Artem.job = "директор по развитию бизнеса";
        Artem.greeting();
        System.out.println();

        //task 3
        car Lada = new car("Lada", "Granta", 2015, "yellow", "Russia", 1.7);
        Lada.description();
        System.out.println();

        car Audi = new car("Audi", "A8 50 L TDI quattro", 2020, "black", "Germany", 3.0);
        Audi.description();
        System.out.println();

        car BMW = new car ("BMW", "Z8", 2021, "black", "Germany", 3.0);
        BMW.description();
        System.out.println();

        car Kia = new car("Kia", "Sportage", 2018, "red", "South Korea", 2.4);
        Kia.description();
        System.out.println();

        car Huyndai = new car("Huyndai", "Avante", 2016, "orange", "South Korea", 1.6);
        Huyndai.description();
        System.out.println();


    }
}