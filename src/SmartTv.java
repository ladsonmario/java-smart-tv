public class SmartTv {
    boolean on = false;
    int channel = 1;
    int volume = 5; 
    boolean mute = false;   

    public void turnOn() {
        on = true;
        System.out.println("TV On!");        
    }    

    public void turnOff() {
        on = false;
        System.out.println("TV Off!");
    }

    public void increaseVolume() {        
        if(volume < 10) {
            volume++;            
        } else {
            System.out.println("Maximum volume!");
        }   
    }

    public void decreaseVolume() {
        if(volume > 0) {
            volume--;            
        } else {
            System.out.println("Minimum volume!");
        }
    }

    public void setChannel(int newChannel) {
        channel = newChannel;
    }

    public void increaseChannel() {        
        channel++;              
    }

    public void decreaseChannel() {
        channel--;            
    }

    public void muted() {
        mute = true;
        System.out.println("TV muted!");
    }

    public void unmuted() {
        mute = false;
        System.out.println("TV unmuted!");
    }
}