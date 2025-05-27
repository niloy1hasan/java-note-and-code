public class Main{
    public static void main(String[] args){
        String path = "data_file.txt";
        Database_Helper databaseHelper = new Database_Helper(path);
        databaseHelper.getFileInfo();
        System.out.println();

        databaseHelper.writeInFile("Niloy");

        databaseHelper.readFile();
        //databaseHelper.deleteFile();
        String path2 = "bufferedData.txt";
        Buffered_Database bufferedDatabase = new Buffered_Database(path2);

        bufferedDatabase.writeInFile("aaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbb");
        bufferedDatabase.readFile();

    }
}