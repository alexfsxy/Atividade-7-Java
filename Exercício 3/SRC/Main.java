import controle_reversão.UndoManagerOption;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Controle de Reversão");
        Scanner scanner = new Scanner(System.in);
        UndoManagerOption undoManagerOption;
        undoManagerOption = new UndoManagerOption(scanner);
        undoManagerOption.showMenu();
    }
}
