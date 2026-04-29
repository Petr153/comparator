package exception;

public class FileNotFoundException extends Exception {
    //private static int exceptionCount = 0;

    public FileNotFoundException(String message){
        super(message);
        //exceptionCount++;
    }

//    public int getNumberOfThrownExceptions (){
//        return exceptionCount;
//    }
}
