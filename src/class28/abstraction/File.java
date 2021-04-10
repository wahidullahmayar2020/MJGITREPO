package class28.abstraction;

public abstract class File {
    public void edit(){
        System.out.println("Editing the file");
    }
    public void close(){
        System.out.println("file closed");
    }
     abstract void open();


}
class JavaFile extends File{

    @Override
    void open() {
        System.out.println("special class to open Java files");
    }
}

class WordFile extends File{

    @Override
    void open() {
        System.out.println("opening the word file");
    }
}
class  PDFFile extends File{

    @Override
    void open() {
        System.out.println("opening the PDF file");
    }
}
