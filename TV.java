//Tien Hoang
public class TV {
    // class attributes
    private String manuCode;
    private int currentChannel = 0;
    private int prevChannel;
    private int prevVolume = 0;
    private int volume = 10;
    private boolean mute = false;
    private boolean power = false;

    public TV(String manuCode) {
        this.manuCode = manuCode;
    }

    // methods of the class
    public String getManuCode() {return manuCode;}
    private void setPrevChannel(int x) {
        prevChannel = x;
    }

    private int getCurrentChannel() {
        return currentChannel;
    }

    private void setVolume(int x) {volume = x;}

    public void volumeUp() {
        if (this.power) {
            this.volume = this.volume + 1;
            System.out.println("The volume is now " + this.volume + "\n");
        }
    }

    public void volumeDown() {
        if (this.power) {
            this.volume = this.volume - 1;
            System.out.println("The volume is now " + this.volume + "\n");
        }
    }

    public void setCurrentChannel(int x) {
        if (this.power) {
            setPrevChannel(getCurrentChannel());
            this.currentChannel = x;
            System.out.println("The current channel is now " + this.currentChannel + "\n");
        }
    }

    public void setMute() {
        if (this.power) {
            if (!this.mute) {
                this.mute = true;
                this.prevVolume = this.volume;
                setVolume(0);
                System.out.println("The TV is now muted\n");

            } else {
                this.mute = false;
                int temp = volume;
                setVolume(this.prevVolume);
                prevVolume = temp;
                System.out.println("The TV is now unmuted \n");
            }
        }
    }

    public void flashback() {
        if (this.power) {
            int temp = getCurrentChannel();
            setCurrentChannel(this.prevChannel);
            setPrevChannel(temp);
        }
    }

    public void powerState() {
        if (!this.power) {
            this.power = true;
            System.out.println("The TV is now powered on\n");
        } else {
            this.power = false;
            System.out.println("The TV is now powered off\n");
        }
    }

    public void channelUp() {
        if (this.power) {
            setPrevChannel(currentChannel);
            this.currentChannel = this.currentChannel + 1;
            System.out.println("The current channel is now " + this.currentChannel + "\n");
        }
    }

    public void channelDown() {
        if (this.power) {
            setPrevChannel(currentChannel);
            this.currentChannel = this.currentChannel - 1;
            System.out.println("The current channel is now " + this.currentChannel + "\n");
        }
    }
}
