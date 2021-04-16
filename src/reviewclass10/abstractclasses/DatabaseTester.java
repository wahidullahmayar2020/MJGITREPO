package reviewclass10.abstractclasses;

public class DatabaseTester {
    public static void main(String[] args) {
        DataBase dataBase=new MicrosoftDatabase();
        dataBase.readFromDataBase("Database1");
        dataBase.writeFromDataBase("Database1");
        dataBase.modifyFromDataBase("Database1");
        //DataBase dataBase1= new Database(); CE

    }
}
