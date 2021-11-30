package info.istamendil.notebook;

import info.istamendil.notebook.utils.UserInteractorWriteException;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Note Book. UserInteractor and DB modules.
 */
public class App extends Application {
    private String[] notes;
    private final int INIT_SIZE = 4;
    private String[] commandNames;
    private Command[] commands;
    private int notesCount;
    private Scanner sc;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UserInteractorWriteException {
        App app = new App();
        app.init();
        app.start();
    }
    @Override
    public void init() {
        notes = new String[INIT_SIZE];
        sc = new Scanner(System.in);
        commandNames = new String[]{"readAll", "save", "exit"};
        commands = new Command[]{
                new ReadAllCommands(this),
                new SaveCommand(this),
                new ExitCommand()
        };
    }

    @Override
    public void start() throws UserInteractorWriteException {
        while (true) {
            int indexOf = 0;
            String inputCommand = sc.nextLine();
            boolean executed = false;
            for (String commandName : commandNames) {
                if (inputCommand.equals(commandName)) {
                    try {
                        printOutput(commandName);
                        commands[indexOf].execute();
                    }catch (UserInteractorWriteException ex){
                        System.out.println("Can't save user's note: ");
                        System.err.println(ex.getMessage());
                    }
                    executed = true;
                    break;
                }
                indexOf++;
            }
            if (!executed) {
                printOutput(inputCommand);
                System.out.println("Unknown command");
            }
        }
    }
    public void saveCommand(String note){
        notes[notesCount] = note;
        notesCount ++;
    }
    public String[] getNotes() {
        return Arrays.copyOf(notes, notes.length);
    }

    public Scanner getScanner() {
        return sc;
    }
    public static void printOutput(String out){
        System.out.println(">> " + out);
        System.out.print("<< ");
    }
}
