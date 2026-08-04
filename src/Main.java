import java.io.File;
import java.util.Arrays;
import java.io.File;
import java.io.IOException;
import commands.CommandHandler;

public class Main {

    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("Usage: Command received<commands> ");
            return;// this is called guard clause
        }
        CommandHandler handler = new CommandHandler();
        handler.execute(args[0]);

    }
}


