import com.sun.javafx.binding.Logging;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class StringDemo {


    /*
    Java String class provides a lot of methods to perform operations on strings such as compare(), concat(), equals(), split(), length(), replace(), compareTo(), intern(), substring() etc.

    The java.lang.String class implements Serializable, Comparable and CharSequence interfaces.

    The Java String is immutable which means it cannot be changed. Whenever we change any string, a new instance is created.
    For mutable strings, you can use StringBuffer and StringBuilder classes.

    In Java, string is an object that represents a sequence of characters. The java.lang.String class is used to create a string object.

    Java String literal is created by using double quotes. For Example:

    String s="welcome";
    Each time you create a string literal, the JVM checks the "string constant pool" first. If the string already exists in the pool, a reference to the pooled instance is returned. If the string doesn't exist in the pool, a new string instance is created and placed in the pool. For example:

    String objects are stored in a special memory area known as the "string constant pool".


*/



    public static void main(String args[]){
        System.out.println("String Demo");

        // String Constructors

        String str1="java";//creating string by Java string literal
        char ch[]={'s','t','r','i','n','g','s'};
        String str2=new String(ch);//converting char array to string
        String str3=new String("example");//creating Java string by new keyword
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        String s1="Welcome";
        String s2="Welcome";//It doesn't create a new instance
        System.out.println("s1 = "+s1+" s2 = "+s2);
        System.out.println("s1 == s2 : " + (s1 == s2));
        System.out.println("s1.equals(s2) : "+s1.equals(s2));


        String s3 = new String("Ravindra");
        String s4 = new String("Ravindra");//It doesn't create a new instance
        System.out.println("s3 = "+s3+" s4 = "+s4);
        System.out.println("s3 == s4 : " + (s3 == s4));
        System.out.println("s3.equals(s4) : "+s3.equals(s4));

        String str = "Sample String for Demo";

        System.out.println("str.charAt(1) : "+str.charAt(1));
        System.out.println("Length : "+str.length());

        System.out.println("String.format(str,'length') : "+String.format("String Format %s","Example"));
        System.out.println("String.format(Locale.US,str,'length') : "+String.format(Locale.US,"String Format %s","Example"));
        System.out.println("String.format(Locale.JAPAN,str,'length') : "+String.format(Locale.JAPAN,"String Format %s","Example"));
        System.out.println("String.format(Locale.FRENCH,str,'length') : "+String.format(Locale.FRENCH,"String Format %s","Example"));
        System.out.println("String.format(Locale.CHINA,str,'length') : "+String.format(Locale.CHINA,"String Format %s","Example"));

        System.out.println(str);
        System.out.println("str.substring(10) : "+str.substring(10));
        System.out.println("str.substring(10,15) : "+str.substring(10,15));
        System.out.println("str.contains('for') : "+str.contains("for"));
        System.out.println("String.join(\"-\",\"One\",\"Two\",\"Three\",\"Four\") : "+String.join("-","One","Two","Three","Four"));

        List<String> strings = new ArrayList<String>();
        strings.add("one");
        strings.add("two");
        strings.add("three");
        strings.add("four");
        strings.add("five");

        System.out.println("String.join(\", \",strings) : "+String.join(", ",strings));
        System.out.println("s1.equals(s2) : "+s1.equals(s2));
        System.out.println("s1.equals(s3) : "+s1.equals(s3));

        System.out.println("s1 : "+s1);
        System.out.println("s2 : "+s2);
        System.out.println("s3 : "+s3);
        System.out.println("s4 : "+s4);
        String s5 = "";
        String s6 = null;
        System.out.println("s5 : "+s5);
        System.out.println("s6 : "+s6);

        System.out.println("s5.isEmpty() : "+s5.isEmpty());
        System.out.println("s4.isEmpty() : "+s4.isEmpty());
//        System.out.println("s6.isEmpty() : "+s6.isEmpty());  Null Pointer Exception
        System.out.println("s1.concat(s3) "+s1.concat(s3));
        System.out.println("s1 : "+s1);
        System.out.println("s3 : "+s3);

        String s7 = "test1 test2 test3 test4 test5";

        System.out.println("s7 : "+s7);
        System.out.println("s7.replace() : "+s7.replace("test","aaaa"));
        System.out.println("s7.replace() : "+s7.replace('t','r'));
        System.out.println("s7 : "+s7);

        s1 = "Welcome";
        s2 = "WELCOME";

        System.out.println("s1 : "+s1);
        System.out.println("s3 : "+s3);

        System.out.println("s1.equalsIgnoreCase(s2) : "+s1.equalsIgnoreCase(s2));
        System.out.println("s1.equals(s2) : "+s1.equals(s2));

//        System.out.println("Classloader of this class: " + PrintClassLoader.class.getClassLoader());

        System.out.println("Classloader of Logging : " + Logging.class.getClassLoader());

        System.out.println("Classloader of ArrayList : " + ArrayList.class.getClassLoader());

    }
}
