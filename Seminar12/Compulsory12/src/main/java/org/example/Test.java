package org.example;

public class Test {
    public String name;
    public String Lastname;
    public Test(String name){
   this.name=name;
   }
    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", Lastname='" + Lastname + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return Lastname;
    }
}
