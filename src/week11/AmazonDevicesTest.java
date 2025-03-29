package week11;

import java.util.ArrayList;

import java.util.Arrays;
public class AmazonDevicesTest {
    public static void main(String[] args) {
        // Create object before adding constructor
        Device fireStick=new Device();//deafult-no-args
        fireStick.name =" Amazon Firestick Tv";
        fireStick.price=19.99;
        fireStick.rating=4.6;
        System.out.println(fireStick);

        Device blinkCamera = new Device("Blink mini 2",19.99,4.4);
        Device amazonEcho = new Device("Amazon Echo 5",69.99,4.4);
        System.out.println(blinkCamera);
        System.out.println(amazonEcho);

        //Amazon Echos Show 5 costs $69.99 on Amazon.com
        System.out.println(amazonEcho.name +"cost$"+amazonEcho.price + "on Amazon.com");

        //List of Device objects
        ArrayList<Device> amazonDevices = new ArrayList<>();
        amazonDevices.add(fireStick);
        amazonDevices.add(blinkCamera);
        amazonDevices.add(amazonEcho);
        amazonDevices.add(new Device("Nuwave Forever Smart Air Purifier", 399.96, 4.7));

        for(Device device:amazonDevices){
            System.out.println(device.name);
        }

    }
}
