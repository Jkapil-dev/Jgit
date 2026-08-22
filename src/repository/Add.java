package repository;


import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;

public class Add {

    public static void add(String fileName){
            if(fileName==null){
                System.out.println("No argument found!");
                return;
            }
            if(isFileExists(fileName)){
                byte[] byteFileRead = null;
                try{
                    byteFileRead = Files.readAllBytes(Path.of(fileName));
                    MessageDigest digest = MessageDigest.getInstance("SHA-1");

                    // Hashing the byte data of the file
                    digest.update(byteFileRead); //loding encrypted data

                    //Generating the SHA-1 hash as a byte array
                    byte[] hashByte = digest.digest();

                }catch (Exception e){
                     e.printStackTrace();
                }

            }

    }
    public static boolean isFileExists( String filename){
        File current = new File(filename);
        return current.exists();
    }

}
