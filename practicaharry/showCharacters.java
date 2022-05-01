package harrypotter.practicaharry;

public class showCharacters {
    public static void main(String[] args) {
        Harry();
        Hermione();
        Draco();
        Severus();
        Sirius();
        }

    private static void Harry() {
        characters Harry = new characters("Harry Potter", "Male", "Gryffindor", "Dementor", "Deer");
        System.out.println(Harry.showMessage());
        System.out.println("_____THE NEXT CHARACTER IS:_____");
    }

    public static void Hermione() {
        characters Hermione = new characters("Hermione Granger", "Gryffindor", "Female", "Mcgonagall", "Otter");
        System.out.println(Hermione.showMessage());
        System.out.println("_____THE NEXT CHARACTER IS:_____");
    }

    public static void Draco() {
        characters Draco = new characters("Draco Malfoy", "Slytherin", "Male", "Lord Voldemort", "None");
        System.out.println(Draco.showMessage());
        System.out.println("_____THE NEXT CHARACTER IS:_____");
    }

    public static void Severus() {
        characters Severus = new characters("Severus Snape", "Slytherin", "Male", "Lord Voldemort", "Doe");
        System.out.println(Severus.showMessage());
        System.out.println("_____THE NEXT CHARACTER IS:_____");
    }

    public static void Sirius() {
        characters Sirius = new characters("Sirius Black", "Gryffindor", "Male", "Dementor", "Black dog");
        System.out.println(Sirius.showMessage());
        System.out.println("_____SIRIUS BLACK WAS THE LAST CHARACTER_____");
    }

}
