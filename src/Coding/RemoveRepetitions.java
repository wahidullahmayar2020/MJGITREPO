package Coding;

public class RemoveRepetitions {
    public static String transform(String input) {
        StringBuilder fina=new StringBuilder();
        char myFirscah=' ';
        int mysize=input.length();
        for(int i=0 ;i<mysize;i++){
            char mycahr=input.charAt(i);
            if(mycahr!=myFirscah){
                myFirscah=mycahr;
                fina.append(myFirscah);
            }
        }
        return fina.toString();
    }
    public static void main(String[] args) {
        System.out.println(RemoveRepetitions.transform("abbcbbb"));
    }
}