//Tien Hoang
public class TV {
    // class attributes
    final private String manuCode;
    private int currentChannel = 1;
    private int prevChannel;
    private int prevVolume = 0;
    private int volume = 10;
    private boolean mute = false;
    private boolean power = false;

    public TV(String manuCode) {
        this.manuCode = manuCode;
    }

    // methods of the class, all methods only execute if the tv is powered on
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
            if (volume < 40){
                if (!mute) {
                    volume = volume + 1;
                }else {
                    mute = false;
                    int temp = volume;
                    volume = prevVolume;
                    prevVolume = temp;
                    volume += 1;
                }
            }
            System.out.println("The volume is now " + volume + "\n");
        }
    }

    public void volumeDown() {
        if (power) {
            if (volume > 0){
                if (!mute) {
                    volume = volume - 1;
                }else {
                    mute = false;
                    int temp = volume;
                    volume = prevVolume;
                    prevVolume = temp;
                    volume -= 1;
                }
            }
            System.out.println("The volume is now " + volume + "\n");
        }
    }

    public void setCurrentChannel(int x) {
        if (power) {
            setPrevChannel(getCurrentChannel());
            currentChannel = x;
            System.out.println("The current channel is now " + currentChannel + "\n");
        }
    }

    public void setMute() {
        if (this.power) {
            if (!mute) {
                mute = true;
                prevVolume = volume;
                setVolume(0);
                System.out.println("The TV is now muted\n");
            } else {
                mute = false;
                int temp = volume;
                setVolume(prevVolume);
                prevVolume = temp;
                System.out.println("The TV is now unmuted\n");
                System.out.println("The volume is now " + volume + "\n");
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
            System.out.println("The TV is now powered on\n");
        } else {
            power = false;
            System.out.println("The TV is now powered off\n");
        }
    }

    public void channelUp() {
        if (power) {
            setPrevChannel(currentChannel);
            currentChannel = currentChannel + 1;
            System.out.println("The current channel is now " + currentChannel + "\n");
        }
    }

    public void channelDown() {
        if (this.power) {
            setPrevChannel(currentChannel);
            currentChannel = currentChannel - 1;
            System.out.println("The current channel is now " + currentChannel + "\n");
        }
    }
}
