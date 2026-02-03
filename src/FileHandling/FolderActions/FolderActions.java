package FileHandling.FolderActions;

import java.io.File;

public class FolderActions {

    // Create folder
    public static void createFolder(String folderpath){
        File folder = new File(folderpath);
        if (!folder.exists()){
            folder.mkdir();
            System.out.println("Folder created :" +folderpath);
        }
    }

    // Cheack if folder exist
    public static boolean cheackFolderExists(String folderpath){
        File folder = new File(folderpath);
       return folder.exists();
    }

    // Rename a folder
    public static void renameFolder(String oldPath , String newPath){
        File oldFolder = new File(oldPath);
        File newFolder = new File(newPath);

        if (oldFolder.exists()){
            oldFolder.renameTo(newFolder);
            System.out.println("Folder nenamed to:" + newPath);
        }
    }

    // Delete a Folder
    public static void DeleFolder(String folderPath){
        File folder = new File(folderPath);
        if (folder.exists()){
            for (File file:folder.listFiles()){
                file.delete();
            }
            folder.delete();
            System.out.println("Folder deleted:" +folderPath);
        }
    }

    public static void main(String[] args) {
        String folderpath = "/home/ankit/Backup//myfiles";

        createFolder(folderpath);

       boolean folderExists =  cheackFolderExists(folderpath);
       System.out.println("Folder Exists :- " +folderExists);

        String  newFolderPath = "/home/ankit/Backup//myfiles_1";
        renameFolder(folderpath,newFolderPath);

        DeleFolder(newFolderPath);
    }
}
