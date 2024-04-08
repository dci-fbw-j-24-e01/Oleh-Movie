import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("What movie you choose");
        System.out.println("#1 - Matrix, #2 - One Flew Over the Cuckoo's Nest, #3 - Mr. Bean, #4 - 300");
        printMovieDetails(new Movie());


    }


    public static void printMovieDetails(Movie movie) {
        Movie m1 = new Movie();
        m1.title = "Matrix";
        m1.genre = MovieGenre.ACTION;
        m1.price = 10;

        Movie m2 = new Movie();
        m2.title = "One Flew Over the Cuckoo's Nest";
        m2.genre = MovieGenre.DRAMA;
        m2.price = 10000;

        Movie m3 = new Movie();
        m3.title = "Mr. Bean";
        m3.genre = MovieGenre.COMEDY;
        m3.price = 1000;

        Movie m4 = new Movie();
        m4.title = "300";
        m4.genre = MovieGenre.DOCUMENTARY;
        m4.price = 10;

        int x = scanner.nextInt();

        if (x == 1) {
            System.out.println("Title " + m1.title);
            System.out.println("Genre " + m1.genre);
            System.out.println("Price " + m1.price + "$");
        }
        if (x == 2) {
            System.out.println("Title " + m2.title);
            System.out.println("Genre " + m2.genre);
            System.out.println("Price " + m2.price + "$");
        }
        if (x == 3) {
            System.out.println("Title " + m3.title);
            System.out.println("Genre " + m3.genre);
            System.out.println("Price " + m3.price + "$");
        }
        if (x == 4) {
            System.out.println("Title " + m4.title);
            System.out.println("Genre " + m4.genre);
            System.out.println("Price " + m4.price + "$");
        }


    }
}