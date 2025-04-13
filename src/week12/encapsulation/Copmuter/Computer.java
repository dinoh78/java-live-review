package week12.encapsulation.Copmuter;
/*
-Create a super class Computer:
    - instance variables os, memory with getters and setters
    - 2 constructors
    - toString
    - use(String purpose)
 */
public class Computer {
    private String os;
    private int memory;

    public Computer() {
        this.os = "unknown";
        this.memory = 0;
    }

    public Computer(String os, int memory) {
        this.os = os;
        this.memory = memory;
    }

    public void use(String purpose) {
        System.out.println("Using " + os + " computer for " + purpose);
    }
    @Override
    public String toString() {
        return "Computer{" +
                "os='" + os + '\'' +
                ", memory=" + memory +
                '}';
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}