import duplo_controle_reversao.DoublyUndoManagerOption;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Duplo Controle de Reversão");
        Scanner scanner = new Scanner(System.in);
        DoublyUndoManagerOption doublyUndoManagerOption;
        doublyUndoManagerOption = new DoublyUndoManagerOption(scanner);
        doublyUndoManagerOption.showMenu();
    }
}
