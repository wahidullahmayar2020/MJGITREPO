package class23.task2;

public class Programming {
    Programming(){
        System.out.println("I love programming languages");
    }

    Programming(String value){
        System.out.println("I love "+value);
    }

    public static void main(String[] args) {
        new Programming();
        new Programming("C++");
    }
}
