/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greeter;

/**
 *
 * @author dajones
 */
public class Greeter {
    
    private String name;
    public Greeter(String aName)
    {   name = aName;
    }
   
    public void setName(String aName)
    {   this.name = aName;
    }
    
    public String sayHello()
    {   return "Hello, " + name + "!";
    }
   
    private String getName()
    {   return name;
    }
    private String other;
    public void swapNames(Greeter other)
    {   String temp = other.getName();
        other.name = this.name;
        this.name = temp;
    }
    
    
    
   
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Greeter First = new Greeter("People");
         System.out.println(First.sayHello());
         Greeter Next = First;
         Greeter New = new Greeter("Universe");
         First.setName("Earth");
         Next.sayHello();
         First.swapNames(New);
         System.out.println(First.sayHello());
         System.out.println(New.sayHello());
        // TODO code application logic here
    }
    
}
