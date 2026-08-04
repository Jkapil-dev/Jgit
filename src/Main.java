import java.io.File;
import java.util.Arrays;
import java.io.File;
import java.io.IOException;
public class Main {
    static void init(){

            File directory = new File(".jgit/");
            File commits = new File(directory, "commits");
            File objects = new File(directory , "objects");
            File refs = new File(directory , "refs");
            File HEAD = new File(directory, "HEAD");
        try {
          boolean isDirectory = directory.mkdirs();
          boolean isCommitsDir = commits.mkdirs();
          boolean isObjectsDir = objects.mkdirs();
          boolean isRefsDir = refs.mkdirs();

            if (!directory.exists()) {
                System.out.println("Failed to create repository.");
                return;
            }

          if(!(isDirectory && isCommitsDir && isObjectsDir && isRefsDir)){
              System.out.println("Issue Creating Files");
              return;
          }
            if (!HEAD.exists()) {
                HEAD.createNewFile();
            }
            System.out.println("Repository Initialized Successfully");

        } catch (IOException e) {
            System.out.println("Failed to initialize repository.");;
       }
    }
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("Usage: Command received<commands> ");
            return;// this is called guard clause
        }

       if(args[0].equals("init")){
           init();
       }else {
           System.out.println("Unknown command");
       }
    }
}


