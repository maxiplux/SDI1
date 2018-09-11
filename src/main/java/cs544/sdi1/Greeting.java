package cs544.sdi1;

/**
 * User: franc
 * Date: 11/09/2018
 * Time: 1:56
 */
public class Greeting {
    private String greeting;
    public Greeting() {}
    public Greeting(String greeting){
        this.greeting=greeting;
    }
    public void sayHello(){
        System.out.println(greeting);
    }
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
