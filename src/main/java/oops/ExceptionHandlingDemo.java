package oops;

public class ExceptionHandlingDemo {

    public static  void printArray(int[] arr) throws IndexOutOfBoundsException{
        for(int i =0; i<100;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args){

        System.out.println("-------------------------------------- before code --------------------------------------");

        try{
            System.out.println("Try Block");
            printArray(new int[]{10,20,30});
        }
        catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("Catch Block : ArrayIndexOutOfBoundsException");
            ae.printStackTrace();
        }
        catch (IndexOutOfBoundsException ae){
            System.out.println("Catch Block : IndexOutOfBoundsException");
            ae.printStackTrace();
        }
        catch (Exception e){
            System.out.println("Catch Block : Exception");
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally Block");
        }


        System.out.println("-------------------------------------- before code --------------------------------------");


        System.out.println("before code");

        try{
            System.out.println("Try Block");
            int sum = 10/0;
        }
        catch (ArithmeticException ae){
            System.out.println("Catch Block : ArithmeticException");
            ae.printStackTrace();
        }
        catch (Exception e){
            System.out.println("Catch Block : Exception");
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally Block");
        }


        System.out.println("remaining code");

        System.out.println("-------------------------------------- before code --------------------------------------");


        try{
            System.out.println("Outer Try Block");
            try{
                System.out.println("Inner Try Block");
                int sum = 10/0;
            }
            catch (ArrayStoreException ae){
                System.out.println("Inner Catch Block : ArrayStoreException");
                ae.printStackTrace();
            }
            finally {
                System.out.println("Inner Finally Block");
            }
        }
        catch (ArithmeticException ae){
            System.out.println("Outer Catch Block : ArithmeticException");
            ae.printStackTrace();
        }
        catch (Exception e){
            System.out.println("Outer Catch Block : Exception");
            e.printStackTrace();
        }
        finally {
            System.out.println("Outer Finally Block");
        }



        System.out.println("-------------------------------------- before code --------------------------------------");

        try{
            System.out.println("Try Block");
//            int sum = 10/0;
//            throw new ArithmeticException("/ by five");
            throw new InvalidAgeException("Age is not valid");

        }
        catch (ArithmeticException ae){
            System.out.println("Catch Block : ArithmeticException");
//            System.exit(1);
            ae.printStackTrace();
        }
        catch (InvalidAgeException iae){
            System.out.println("Catch Block : InvalidAgeException");
            iae.printStackTrace();
        }
        catch (Exception e){
            System.out.println("Catch Block : Exception");
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally Block");
        }
        System.out.println("remaining code");
    }

}

class InvalidAgeException  extends Exception
{
    public InvalidAgeException (String str)
    {
        // calling the constructor of parent Exception
        super(str);
    }
}
