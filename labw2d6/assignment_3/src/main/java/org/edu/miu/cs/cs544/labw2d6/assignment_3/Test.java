package org.edu.miu.cs.cs544.labw2d6.assignment_3;

public class Test {
    private int id;
    private String name;

    public Test() {

    }

    public Test(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return name + " " + id;
    }

    public void count() {
        System.out.println("counting from Test ...");
        PrototypeBeanCounter.counter++;
    }

}
