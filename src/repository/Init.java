package repository;

import java.io.File;
import java.io.IOException;

public class Init {
    public static void init(){

        File directory = new File(".jgit/");
        File commits = new File(directory, "commits");
        File objects = new File(directory , "objects");
        File refs = new File(directory , "refs");
        File HEAD = new File(directory, "HEAD");
        try {

            boolean isDirectoryAlreadyExists = directory.exists();
            boolean isDirectory = directory.mkdirs();
            boolean isCommitsDir = commits.mkdirs();
            boolean isObjectsDir = objects.mkdirs();
            boolean isRefsDir = refs.mkdirs();

            if (isDirectoryAlreadyExists)
                System.out.println("Reinitialized existing JGit repository.");
            else
                System.out.println("Initialied empty Jgit directory.");

            if(!directory.exists() || !commits.exists() || !objects.exists() || !refs.exists()){
                System.out.println("Issue Creating Files");
                return;
            }
            if (!HEAD.exists()) {
                HEAD.createNewFile();
            }


        } catch (IOException e) {
            System.out.println("Failed to initialize repository.");;
        }
    }
}