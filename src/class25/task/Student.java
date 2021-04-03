package class25.task;

public class Student {

    void study(){
        System.out.println("Students must study");
    }
    void doHomeWork(){
        System.out.println("Students must do homework");
    }
    void practice(){
        System.out.println("Students must practice");
    }
}
class SyntaxStudent extends Student{
    void doHomeWork(){
        System.out.println("Syntax Student must do homework to succeed and get an job");
    }
    void practice(){
        System.out.println("Syntax Students must practice additional 15 to 20 hours");
    }

    void doResearch(){
        System.out.println("Syntax Students must do their own research");
    }
}
class CollegeStudent extends  Student{
    void doHomeWork(){
        System.out.println("College Student must do homework to get good grades");
    }
}

class SchoolStudent extends Student{

}
