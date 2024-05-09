public class User {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();        

        //turning on tv
        smartTv.turnOn();

        System.out.println("Channel: " + smartTv.channel);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.increaseVolume();
        smartTv.increaseVolume();
        smartTv.increaseVolume();
        smartTv.increaseVolume();
        smartTv.increaseVolume();        
        smartTv.increaseVolume(); //maximum volume

        System.out.println("Volume: " + smartTv.volume);
        
        smartTv.muted();
        smartTv.setChannel(14);

        System.out.println("Channel: " + smartTv.channel);

        smartTv.decreaseChannel();
        smartTv.decreaseChannel();
        smartTv.decreaseChannel();
        smartTv.decreaseChannel();
        smartTv.unmuted();

        System.out.println("Channel: " + smartTv.channel);

        smartTv.setChannel(7);

        System.out.println("Channel: " + smartTv.channel);

        smartTv.decreaseVolume();
        smartTv.decreaseVolume();
        smartTv.decreaseVolume(); 
        smartTv.decreaseVolume();

        System.out.println("Volume: " + smartTv.volume);

        //turning off tv
        smartTv.turnOff();
    }
}
