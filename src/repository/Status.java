package repository;

import java.io.File;
import java.util.Arrays;

public class Status {
    public static void status(){
        System.out.println("Untracked files.");
        scan(".");

    }
   private static void scan(String directroy){

        File current = new File(directroy);
        File[] files = current.listFiles();
        if(current.isDirectory()){
            if(files == null){
                System.out.println("Unable to read directory");
                return;
            }

            for (File file  : files) {
                if(shouldIgnore(file))
                    continue;

                if(file.isFile())
                    System.out.println("File : "+file.getName());

                if(file.isDirectory()) {
                    System.out.println("Dir : " + file.getName());
                    scan(file.toString());
                }
            }
        }

    }

    private static boolean shouldIgnore(File file){
        if(file.getName().equals(".jgit") || file.getName().endsWith(".class"))return true;
        return false;
    }
}
