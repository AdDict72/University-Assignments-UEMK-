/* Define an exception called “NoMatchFoundException” that is thrown when a string is 
   not equal to “University”. Write a program that uses this exception. */

import java.util.Scanner;

class NoMatchFoundException extends Exception{
    NoMatchFoundException(String message){
        super(message);
    }
}
class MatchString{
    private String inString;
    MatchString(String inString){
        this.inString = inString;
    }
    void CheckMatch() throws NoMatchFoundException{
        if(!inString.equals("University")){
            throw new NoMatchFoundException("String does not match 'University'");
        }
        else{
            System.out.println("String Matched...!!");
        }
    }
}

public class Q_3 {
    public static void main(String[] args) {
        
        try{Scanner sc = new Scanner(System.in);
            String inStr;
            System.out.println("Entert a String : ");
            inStr = sc.nextLine();
            MatchString ms = new MatchString(inStr);
            ms.CheckMatch();
        }
        catch(NoMatchFoundException e){
            System.out.println("ERROR : " + e);

        }
        
    }
}
