package class28.abstraction;

public class FileTester {
    public static void main(String[] args) {
        File[] files={new JavaFile(),new PDFFile(),new WordFile()};
        for ( File file:files
             ) {
            file.open();
            file.edit();
            file.close();
        }

    }
}
