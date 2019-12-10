public class Main {
    public static void main(String[] args) {
        Pet cow=()-> "Я корова- Мууу-Мууу";
        Pet cat=()-> "Я кіт- Мяууу-Мяууу";
        Pet dog=()-> "Я пес-Гаууу-Гаууу”";

        System.out.println(cow.voice());
        System.out.println(cat.voice());
        System.out.println(dog.voice());
    }
}
