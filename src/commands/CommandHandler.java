package commands;
import repository.Init;
import repository.Status;

public class  CommandHandler{
    public void execute(String command){
        if(command.equals("init")){
            Init.init();
        } else if (command.equals("status")) {
           try{
               Status.status();
           }catch (Exception e){
               System.out.println(e.toString());
           }
        } else {
            System.out.println("Unknown command");
        }
    }

}