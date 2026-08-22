package commands;
import repository.Init;
import repository.Status;
import  repository.Add;

public class  CommandHandler{
    public void execute(String command , String argument){
        if(command.equals("init")){
            Init.init();
        } else if (command.equals("status")) {
           try{
               Status.status();
           }catch (Exception e){
               System.out.println(e.toString());
           }
        } else if (command.equals("add")) {
                Add.add(argument);
        } else {
            System.out.println("Unknown command");
        }
    }

}