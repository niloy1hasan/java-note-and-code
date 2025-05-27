import java.io.*;

public class Buffered_Database {
    private String path;
    private File file;
    public Buffered_Database(String path){
        this.path = path;
        createFile();
    }

    public void writeInFile(String text){
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.append(text);
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            System.out.println("Can't write in the file");
        }
    }

    public void readFile(){
        try {
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while((line = bufferedReader.readLine())!=null){
                System.out.println(line);
            }

            bufferedReader.close();
            reader.close();

        } catch (IOException e) {
            System.out.println("Can't read the file");
        }
    }


    private void createFile(){
        file = new File(path);
        if(!file.exists()){
            try{
                if(file.createNewFile()){
                    System.out.println("File is created");
                } else {
                    System.out.println("File can't create");
                }
            } catch (IOException e) {
                System.out.println("Face exception when try to create the file");
            }
        }
    }
}
