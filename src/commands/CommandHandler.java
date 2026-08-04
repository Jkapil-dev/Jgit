package commands;
import repository.Repository;
import repository.Repository;
public class  CommandHandler{
    public void execute(String command){
        if(command.equals("init")){
            Repository.init();
        }else {
            System.out.println("Unknown command");
        }
    }

}