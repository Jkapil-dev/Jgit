package repository;

import java.io.File;
import java.util.Arrays;

public class Status {
    public static void status(){
        System.out.println("Untracked files.");
        scan(".");

    }
    static void scan(String directroy){

        File current = new File(directroy);
        File[] files = current.listFiles();
        if(current.isDirectory()){
            if(files == null){
                System.out.println("Unable to read directory");
            }

            for (File file  : files) {
                if (files == null) {
                    System.out.println("Unable to read directory");
                    return;
                }
                if(file.equals(".jgit"))
                    continue;

                if(file.isFile())
                    System.out.println("File : "+file.getName());

                if(file.isDirectory())
                    System.out.println("Dir : " + file.getName());


                scan(file.toString());
            }
        }


    }
}
