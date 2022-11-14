public class Main {
    public static void main(String[] args) {
        System.out.println("Задача к билету №5:" +
                "\n" +
                "Дан массив пар названий книг и авторов, необходимо привести каждую пару в строку вида: «Название книги» И.О.Автора");

        System.out.println();
        System.out.println("Решение:");
        String[] namesOfBooks = {"The Count of Monte Cristo", "Love of live"};
        String[] authors = {"Alexandre Dumas", "Jack London"};
        for (int i = 0; i < namesOfBooks.length; i++) {
            System.out.println("«" + namesOfBooks[i] + "»" + " by " + authors[i]);
        }
    }
}