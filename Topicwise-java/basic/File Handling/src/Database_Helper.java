import java.io.*;
import java.util.Scanner;

public class Database_Helper {
    private String path;
    private File file;
    public Database_Helper(String path){
        this.path = path;
        createFile();
    }

    private void createFile(){
        file = new File(path);

         if (!file.exists()) {
             try {
                 if (file.createNewFile()) {
                     System.out.println("File created");
                 } else {
                     System.out.println("File already exist");
                 }
             } catch (IOException e) {
                 System.out.println("File cannot create");
             }
         }
    }

    public void writeInFile(String message){
        try{
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.append(message).append("\n");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("can't create, something error");
        }
    }

    public void readFile(){
        try{
            FileReader fileReader = new FileReader(file);
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
            scanner.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found for read");
        } catch (IOException e){
            System.out.println("Can't read");
        } finally {
            System.out.println("File reading complete");
        }
    }

    public void deleteFile(){
        if(file.delete()){
            System.out.println("deleted the file successfully");
        } else {
            System.out.println("Can't delete");
        }
    }

    public void getFileInfo(){
        if(!file.exists()){
            System.out.println("file not exist");
            return;
        }

        System.out.println("File Name : " + file.getName());
        System.out.println("Absolute Path : " + file.getAbsolutePath());
        System.out.println("Readable : " + file.canRead());
        System.out.println("Writable : " + file.canWrite());
        System.out.println("File size in byte : " + file.length());
    }

}
