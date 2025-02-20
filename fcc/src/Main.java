// import java.util.Scanner;
// import java.util.Arrays;
// import java.util.ArrayList;
// import java.util.HashMap;


public class Main {
    public static void main(String[] args) {

        User ataylor = new User("Andrew Taylor", "1986-11-05");
        // System.out.printf("%s is %s years old.", ataylor.getName(), ataylor.age());

        Book book = new Book("Carmilla", 200, new String[]{"Sheridan Le Fanu"});
        Ebook ebook = new Ebook("Frankenstein", 220, new String[]{"Mary Shelley"}, "EPUB");
        AudioBook audioBook = new AudioBook("Dracula", new String[]{"Bram Stoker"}, 160);

        ataylor.borrow(new Book[]{book, ebook});

        ataylor.borrow(audioBook);

        System.out.printf("\n%s has borrowed these books: %s", ataylor.getName(), ataylor.getBorrowedBooks());
        
        ataylor.returnBook(ebook);
        
        System.out.printf("\n%s has borrowed these books: %s", ataylor.getName(), ataylor.getBorrowedBooks());

        System.out.println("\n" + ebook.length());
        System.out.println("\n" + audioBook.length());

        // HashMap<String, Integer> kids = new HashMap<>();

        // kids.put("Silas", 14);
        // kids.put("Elayna", 11);
        // kids.put("Titus", 6);
        // kids.put("Linus",3);

        // System.out.printf(kids.toString());

        // kids.replace("Linus", 4);

        // System.out.println(kids.get("Linus"));

        // ArrayList<String> kids = new ArrayList<>();

        // kids.add("Silas");
        // kids.add("Elayna");
        // kids.add("Titus");
        // kids.add("Linus");

        // System.out.println(kids.get(2));

        // for (int number = 0; number <= 10; number++) {
        // System.out.println(number);
        // }

        // String kids[] = {"Silas", "Elayna", "Titus"};

        // System.out.println(Arrays.toString(kids));

        // String meals[][] = {
        // {"Breakfast", "Lunch", "Dinner"},
        // {"Breakfast", "Lunch", "Dinner"},
        // {"Breakfast", "Lunch", "Dinner"},
        // {"Breakfast", "Lunch", "Dinner"},
        // {"Breakfast", "Lunch", "Dinner"},
        // {"Lunch", "Dinner"},
        // {"Lunch", "Dinner"},
        // };

        // System.out.println(Arrays.deepToString(meals).replace("], ","]\n"));

        // Scanner scanner = new Scanner(System.in);

        // System.out.print("What's your name? ");
        // String name = scanner.nextLine();

        // System.out.printf("So %s, how old are you? ", name);

        // int age = scanner.nextInt();
        // scanner.nextLine();

        // if (age >= 40) {
        // System.out.println("That is a little old...");
        // }

        // System.out.printf("Cool! %d is a good age to start programming! \nWhat
        // language are you learning? ", age);
        // String language = scanner.nextLine();

        // System.out.printf("Ah! %s is a solid language.", language);

        // scanner.close();

    }
}
