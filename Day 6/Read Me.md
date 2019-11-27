# Day 6
### Custom exception
* SUN/ORACLE has given readymade exception classes for exceptional conditions which are already known to JVM
* e.g
    1. NullPointerException
    2. NumberFormatException
* JVM can not understand exceptional conditions/situations occurs in business logic. If we want to handle such situations then we should define Custom/User defined exception.
* If we want to define checked exception class then we should extend class from java.lang.Exception class and If we want to define unchecked exception class then we should extend class from java.lang.RuntimeException class
* Example : Custom Checked Exception
```java
class StackOverflowException extends Exception
{   }
```
* Example : Custom UnChecked Exception
```java
class StackOverflowException extends RuntimeException
{   }
```
### Abstract class and method
* abstract is keyword in java.
* According to clients requirement, if implementation of super class method is logically 100% incomplete then we should declare such method abstract.
* Abstract method do not contain body.
* If we declare any method abstract then it is mandatory to declare that class abstract.
* We can not instantiate abstract class but we can create reference of abstract class.
* Without declaring method abstract, we can declare class abstract. In other words, abstract class can contain:
1. Abstract method
2. Concrete method( static or non static )
3. Field
4. Constructor
* Example:
    1. java.lang.Number
    2. java.lang.Enum
    3. java.util.Dictionary
    4. java.util.Calendar
* It is mandatory to override abstract in sub class otherwise sub class can be considered as abstract.
```java
abstract class A
{
    public abstract void f1();
}
abstract class B extends A //OK
{   }
class C extends A
{
    @Override
    public void f1( )   //OK
    {   }
}
```
* If implementation of a method is logically 100% complete then we should declare such method final.
* Final method inherit into sub class but we can not override it into sub class.
* We can declare overriden method final.
* e.g
    1. getClass()
    2. wait()
    3. notify()
    4. notifyAll()
* If implementation of a class is logically 100% complete then we should declare such class final.
* We can not extend final class i.e we can not create sub class of final class.
* Example
    1. java.lang.System
    2. java.lang.String, StringBuffer, StringBuilder
    3. All Wrapper classes
    4. java.lang.Math
    5. java.util.Scanner
* instanceof is operator in java which returns boolean value.
* If we want to check inheritance at runtime then we can use instanceof operator
```java
private static void acceptRecord(Shape shape) 
{
    if( shape instanceof Rectangle )
    {
        Rectangle rect = (Rectangle) shape;	//downcasting
    }
    else
    {
        Circle c = (Circle) shape;	//downcasting
    }
}	
```
### String Handling
* In C/C++, string is array of character which ends with '\0' character.
* In java String is collection of character object which do not ends with '\0' character.
```java
//String str = "SunBeam";
//StringBuffer str = new StringBuffer("SunBeam");
StringBuilder str = new StringBuilder("SunBeam");
char ch = str.charAt(str.length()); //StringIndexOutOfBoundsException
```
* If we want to manipulate string then we can use following classes
1. java.lang.String
2. java.lang.StringBuffer
3. java.lang.StringBuilder
4. java.util.StringTokenizer
5. java.util.regex.Pattern
6. java.util.regex.Matcher

#### java.lang.String
* It is a final class declared in java.lang package.
* It implements Serializable, Comparable<String> and  CharSequence inteface.
    * Serializable is a marker/tagging interface.
    * Comparable<String> is a interface havin "compareTo()" method
    * Following are abstract methods of CharSequence interface
        1. char charAt(int index)
        2. int length()
        3. CharSequence subSequence(int start, int end)
* String is not a built-in / primitive type. It is a class hence considered as reference type.
* We can create instance of String with and without new operator.
```java
String str = new String("SunBeam Karad");
```
* "new String("SunBeam Karad")" -> String instance.
* String instance get space on heap section.
```java
String str = "KDac";
```
is equivalent to
```java
char[] arr = new char[ ]{ 'K','D','a','c'};
String str = new String( arr );
```
* "KDac" -> String literal.
* String lietrals get space on String literal pool / String pool.
* In java, String objects are constant/immutable. It means that, if we try to modify state of String instance then JVM create new instance of it.
* "public String concat(String str)" is a method of String class which is used to concat two strings.
```java
String s1 = "Pre";
String s2 = "cat";
String s3 =  s1.concat(s2); //Precat
```
```java
String str = "SunBeam";
str = str.concat( 12345 );	//Not OK
```
* If we want to concat state of instance of any primitive as well non primitive to String then we should use "+" operator.
```java
String str = "SunBeam";
//str = str + 123;	//OK
str = str + new Date();//OK
```
* Constructor's of String
1. public String()
```java
String str = new String( );
```
2. public String(char[] value)
```java
char[] data = { 'A','B', 'C'};
String str = new String( data );
```
3. public String(byte[] bytes)
```java
byte[] bs = { 65, 66, 67 };
String str = new String( bs );
```
4. public String(String original)
```java
String s1 = "Karad";
String s2 = new String( s1 );
```
5. public String(StringBuffer buffer)
```java
StringBuffer sb = new StringBuffer("Sandeep");
String str = new String( sb );
```
6. public String(StringBuilder builder)
```java
StringBuilder sb = new StringBuilder("SunBeam");
String str = new String( sb );
```
* Methods of String Class
1. public char charAt(int index)
2. public int codePointAt(int index)
3. public int compareToIgnoreCase(String str)
4. public String concat(String str)
5. public boolean contains(CharSequence s)
6. public boolean startsWith(String prefix)
7. public boolean endsWith(String suffix)
8. public boolean equalsIgnoreCase(String anotherString)
9. public static String format(String format, Object... args)
10. public byte[] getBytes()
11. public String intern()
12. public boolean isEmpty()
13. public int indexOf(String str)
14. public int lastIndexOf(String str)
15. public int length()
16. public boolean matches(String regex)
17. public String[] split(String regex)
18. public String substring(int beginIndex)
19. public char[] toCharArray()
20. public String toLowerCase()
21. public String toUpperCase()
22. public String trim()
23. public static String valueOf(Object obj)
```java
public static void main(String[] args) 
{
    String str = "SunBeam Infotech Pune";
    //String subStr =  str.substring(8);	//Infotech Pune
    String subStr =  str.substring(8, 16);	//Infotech
    System.out.println(subStr);
}
```

```java
public static void main(String[] args) 
{
    String regex = " ";
    String str = "SunBeam Infotech Pune";
    String[] words = str.split(regex);
    for (String word : words) 
        System.out.println(word);
}
```
#### String twisters
```java
String s1 = new String("SunBeam");
String s2 = new String("SunBeam");
if( s1 == s2 )
    System.out.println("Equal");
else
    System.out.println("Not Equal");
//Output : Not Equal
```
```java
String s1 = new String("SunBeam");
String s2 = new String("SunBeam");
if( s1.equals(s2) )
    System.out.println("Equal");
else
    System.out.println("Not Equal");
//Output : Equal
```
```java
String s1 = new String("SunBeam");
String s2 = "SunBeam";
if( s1 == s2 )
    System.out.println("Equal");
else
    System.out.println("Not Equal");
//Output : Not Equal
```
```java
String s1 = new String("SunBeam");
String s2 = "SunBeam";
if( s1.equals(s2) )
    System.out.println("Equal");
else
    System.out.println("Not Equal");
//Output : Equal
```
```java
String s1 = "SunBeam";
String s2 = "SunBeam";
if( s1 == s2 )
    System.out.println("Equal");
else
    System.out.println("Not Equal");
//Output : Equal
```
```java
String s1 = "SunBeam";
String s2 = "SunBeam";
if( s1.equals(s2))
    System.out.println("Equal");
else
    System.out.println("Not Equal");
//Output : Equal
```
```java
String s1 = "Sun"+"Beam";	//SunBeam
String s2 = "SunBeam";
if( s1 == s2)
    System.out.println("Equal");
else
    System.out.println("Not Equal");
//Output : Equal
```
```java
String str1 = "SunBeam";
String str = "Sun";
String str2 = str + "Beam";
if( str1 == str2 )
    System.out.println("Equal");
else
    System.out.println("Not Equal");
//Output : Not Equal
```
```java
String str1 = "SunBeam";
String str = "Sun";
String str2 = (str + "Beam").intern();
if( str1 == str2 )
    System.out.println("Equal");
else
    System.out.println("Not Equal");
//Output : Equal
```
* Enumeration is interface declared in java.util package.
* Methods of Enumeration:
    1. boolean hasMoreElements()
    2. E nextElement()

* On the basis of delimeter, if we want to split tokens/string then we should use StringTokenizer class.
* It is declared in java.util package.
* Constructors of StringTokenizer
1. public StringTokenizer(String str)
2. public StringTokenizer(String str, String delim)
3. public StringTokenizer(String str, String delim, 
    boolean returnDelims);
* Methods of StringTokenizer
1. public int countTokens()
2. public boolean hasMoreTokens()
3. public String nextToken()
```java
String str = "SunBeam Infocom Karad";
StringTokenizer stk = new StringTokenizer(str);
System.out.println(stk.countTokens());	//3
```
```java
String str = "SunBeam Infocom Karad";
StringTokenizer stk = new StringTokenizer(str);
String token = "";
while( stk.hasMoreElements() )
{
    token = (String) stk.nextElement();
    System.out.println(token);
}
```java
String str = "SunBeam Infocom Karad";
StringTokenizer stk = new StringTokenizer(str);
String token = "";
while( stk.hasMoreTokens() )
{
    token = stk.nextToken();
    System.out.println(token);
}
```
```java
String str = "www.gmail.com";
String delim = ".";
StringTokenizer stk = new StringTokenizer(str,delim);
String token = "";
while( stk.hasMoreTokens() )
{
    token = stk.nextToken();
    System.out.println(token);
}
```
```java
String str = "ab+bc*cd-de/ef";
String delim = "+*-/";
StringTokenizer stk = new StringTokenizer(str,delim);
String token = "";
while( stk.hasMoreTokens() )
{
    token = stk.nextToken();
    System.out.println(token);
}
```



