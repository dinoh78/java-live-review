package week12.encapsulation.Copmuter;

public class TestComputer{
    public static void main(String[] args) {
        //super class obect
        Computer computer =new Computer();
        computer.setOs("Unix");
        computer.setMemory(64);
        System.out.println(computer);
        computer.use("reading server file");

        //sub class object
        Windows windows = new Windows();
        windows.setOs("Windows 11");
        windows.setMemory(32);
        windows.setTouchScreen(true);
        System.out.println(windows);
        windows.use("practicing interviews");

        //create Mac sub class object
        Mac mac =new Mac("Mac Sequila",32);
        System.out.println(mac);
        mac.use("Test automation");




    }
}
