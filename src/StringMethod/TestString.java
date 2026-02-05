package StringMethod;

import java.lang.reflect.AccessibleObject;

public class TestString {
   public static void main() {
        String name = "Ankita  Dubey";
        int length = name.length();
       System.out.println("length");
       char c = name.charAt(5);
       System.out.println(c);

       String name2 = "Ankit Kumar Dubey";
       System.out.println(name.equals(name2));
       System.out.println(name.equalsIgnoreCase(name2));

       String str1 = "Remote";
       String str2 = "Car";
       int i = str1.compareTo(str2);
       System.out.println(i);

       String substring = name.substring(5,name.length());
       System.out.println(substring);
       System.out.println(name.toUpperCase());
       System.out.println(name2.toUpperCase());

       String Replace = name.replace("Dubey","Kumari");
       System.out.println(Replace);

       String contains = String.valueOf(name.contains(("A")));
       System.out.println(contains);

       System.out.println(name.startsWith("An"));
       System.out.println(name.endsWith("a"));
       System.out.println(name.isEmpty());
       System.out.println(name.isBlank());

       System.out.println(name2.indexOf('u'));
       System.out.println(name2.lastIndexOf("u"));
       System.out.println(name2.indexOf("A",5));

       int a = 10;
       String  s = String.valueOf(a);
       System.out.println(s);

       String formattedStr = String.format("My name is %s and I am %d years old.","Ankit",20);
       System.out.println(formattedStr);

       System.out.println(name.substring(2,8));
       System.out.println(name.subSequence(2,8));
    }
}
