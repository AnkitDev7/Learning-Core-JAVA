package FileHandling.FileActions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileActions {

    // Create a File in Folder
    public static void CreateFile(String filepath)  {
        File MyObj = new File(filepath);

        try {
            if (MyObj.createNewFile()){
                System.out.println("File Created :- "+ MyObj.getName());
            }else {
                System.out.println("File is already exist.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    // Writing data intro file
    public static void WriteFile(String filePath){

        try {
            FileWriter myWritter = new FileWriter(filePath);
            myWritter.write("Welcome to java File Handling...");
            myWritter.close();
            System.out.println("Succefully wrote tot he file...");
        }catch (IOException e){
            System.out.println("An error occuere...");
            e.printStackTrace();
        }

    }


    // Reading data from the file
    public static void ReadFile(String filePath){
        File myObj = new File(filePath);

//        Scanner myReader = new Scanner(myObj);
    }

    public static void main(String[] args) {
        String filepathAddress = "/home/ankit/Backup/myfiles_1//myFiles.txt";
        CreateFile(filepathAddress);

        WriteFile(filepathAddress);

    }
}
