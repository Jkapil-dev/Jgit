import commands.CommandHandler;

public class Main {

    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("Usage: Command received<commands> ");
            return;// this is called guard clause
        }
        CommandHandler handler = new CommandHandler();
        if(args.length>1)
            handler.execute(args[0] , args[1]);
        else
            handler.execute(args[0] , null);
    }
}


