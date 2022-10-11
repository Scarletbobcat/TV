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
        if (power) {
            volume = volume + 1;
            System.out.print("The volume is now " + volume + "\n");
        }
    }

    public void volumeDown() {
        if (power) {
            volume = volume - 1;
            System.out.print("The volume is now " + volume + "\n");
        }
    }

    public void setCurrentChannel(int x) {
        if (power) {
            setPrevChannel(getCurrentChannel());
            currentChannel = x;
            System.out.print("The current channel is now " + currentChannel + "\n");
        }
    }

    public void setMute() {
        if (this.power) {
            if (!mute) {
                mute = true;
                prevVolume = volume;
                setVolume(0);
                System.out.print("The TV is now muted\n");

            } else {
                mute = false;
                int temp = volume;
                setVolume(prevVolume);
                prevVolume = temp;
                System.out.print("The TV is now unmuted \n");
            }
        }
    }

    public void flashback() {
        if (power) {
            int temp = getCurrentChannel();
            setCurrentChannel(prevChannel);
            setPrevChannel(temp);
        }
    }

    public void powerState() {
        if (!power) {
            power = true;
            System.out.print("The TV is now powered on\n");
        } else {
            power = false;
            System.out.print("The TV is now powered off\n");
        }
    }

    public void channelUp() {
        if (power) {
            setPrevChannel(currentChannel);
            currentChannel = currentChannel + 1;
            System.out.print("The current channel is now " + currentChannel + "\n");
        }
    }

    public void channelDown() {
        if (power) {
            setPrevChannel(currentChannel);
            currentChannel = currentChannel - 1;
            System.out.print("The current channel is now " + currentChannel + "\n");
        }
    }
}
