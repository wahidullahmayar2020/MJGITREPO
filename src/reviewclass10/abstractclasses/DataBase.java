package reviewclass10.abstractclasses;

public abstract class DataBase {

    public abstract void readFromDataBase(String databaseName);
    public abstract void writeFromDataBase(String databaseName);
    public abstract void modifyFromDataBase(String databaseName);

}

class OracleDatabase extends DataBase{

    @Override
    public void readFromDataBase(String databaseName) {
        System.out.println("we are the oracle experts we have provided the implementation" +
                " Reading data from OracleDatabase");
    }

    @Override
    public void writeFromDataBase(String databaseName) {
        System.out.println("we are the oracle experts we have provided the implementation" +
                " write data from OracleDatabase");
    }

    @Override
    public void modifyFromDataBase(String databaseName) {
        System.out.println("we are the oracle experts we have provided the implementation" +
                " modify data from OracleDatabase");
    }
}

class MicrosoftDatabase extends DataBase{

    @Override
    public void readFromDataBase(String databaseName) {
        System.out.println("we are the Microsoft experts we have provided the implementation" +
                " Reading data from OracleDatabase");
    }

    @Override
    public void writeFromDataBase(String databaseName) {
        System.out.println("we are the Microsoft experts we have provided the implementation" +
                " write data from OracleDatabase");
    }

    @Override
    public void modifyFromDataBase(String databaseName) {
        System.out.println("we are the Microsoft experts we have provided the implementation" +
                " modify data from OracleDatabase");
    }
}

abstract class IBMDatabase extends DataBase{
    @Override
    public void readFromDataBase(String databaseName) {
        System.out.println("we are the IBM experts we have provided the implementation" +
                " Reading data from OracleDatabase");
    }
}
