# Day 1
### Language
* e.g C, C++, Java, C#, Python, Go etc.
* Data Types
* Tokens
* Syntax and semantics
* Built-in features
* Application Development(CUI,GUI,Lib)
* If we want to implement business logic then we should language.

### Technology
* e.g ASP.NET, Java etc.
* If we want to develop application the we should use technology.
* Every language is a technoly but every technology is not a language.

### Platform
* It is either hardware or software environment in which we can run/execute application.
* Types of platform
1. Hardware based platform
    * All operating systems
2. Software Only Platform
    * MS.NET, Java etc.
> Java lanaguage is both i.e technology as well as platform.

### History
* Java is developed by James Gosling and his team in 1991 at Sun MicroSystems.
* Since 2010, Java is a product of Oracle.
* Initial name of java was "Oak". Due to name ambiguity it was renamed to Java.
* First version of Java "1.0" was released in 1996.

### Java Platforms
1. Java SE Platform
2. Java EE Platform
3. Java ME Platform
4. Java FX 
> In java , class, interface, Enum, Error, Exception is also called as API.
#### Java SE Platform
* Java Standard Edition
* It is also called as Core Java
* We can use it to develop CUI, GUI, Networking application, libraries( .jar )
* Java SE API's are sub set of Java EE API.

#### Java EE Platform
* Java Enterprise Edition
* It is also called as JEE / Web java / Advanced Java / Enterprise Java. 
* We can use it to develop Web application and Distributed application( Web Servervics,REST services, Micro Services etc. )
* Java EE API's are super set of Java SE and Java ME API's

#### Java ME Platform
* Java Micro Edition
* It is used to develop application for consumer devices
* e.g Mobile Phone
* Java ME API's are sub set of Java SE API.

#### Java FX
* It is used to develop rich application for internet.

### Achitecture of Java SE Application
* Java SE Platform contains 2 components
1. Java API
2. Java Virtual Machine( JVM )

* SDK = Lang Tools + Documentation + Supporting Libs + Runtime environment.

* JDK = Java Lang Tools + Java Docs + rt.jar + JVM
* If we want to develop java application then we must install JDK software
* Vendor : SUN/Oracle
* JDK = Java Lang Tools + Java Docs +
 JRE[ rt.jar + JVM ]
 * If we want to deploy/install java application then we must install JRE software on client's machine.
 * rt.jar file contains Java SE API's.

### JDK's Installation Directory Structure
* bin :
    - It comtains java language tools
* include :
    - In context of java, C/C++ code is called native code.
    - Java Native Interface( JNI ) is a java language feature that is used to access native code.
    - It contains header files which are required to access native code.
* lib :
    - It contains library files which are required for third party tools
* src :
    - Java is open source technology.
    - It contains source code of Java SE API.
* jre :
    - It contains JVM implementation and rt.jar file.
* docs :
    - It contains documentation of java's source code
* man : 
    - It contains documentation of java language tools
### "Hello World!!!" Application
* Create Program.java and write following code:
```java
class Program
{
    public static void main( String[] args )
    {
        System.out.println("Hello World");
    }
}
```
* javac Program.java
* java Program