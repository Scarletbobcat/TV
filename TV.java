public class TV {
    // class attributes
    private int currentChannel = 0;
    private int prevChannel;
    private int volume = 10;
    private boolean mute = false;
    private boolean power = false;

    // methods of the class
    private void setPrevChannel(int x) {
        this.prevChannel = x;
    }

    private int getCurrentChannel() {
        return currentChannel;
    }

    public void volumeUp() {
        this.volume = this.volume + 1;
        System.out.println("The volume is now " + this.volume + "\n");
    }

    public void volumeDown() {
        this.volume = this.volume - 1;
        System.out.println("The volume is now " + this.volume + "\n");
    }

    public void setCurrentChannel(int x) {
        setPrevChannel(getCurrentChannel());
        this.currentChannel = x;
        System.out.println("The current channel is now " + this.currentChannel + "\n");
    }

    public void setMute() {
        if (!this.mute) {
            this.mute = true;
            System.out.println("The TV is now muted\n");
        } else {
            this.mute = false;
            System.out.println("The TV is now unmuted\n");
        }
    }

    public void flashback() {
        int temp = getCurrentChannel();
        setCurrentChannel(this.prevChannel);
        setPrevChannel(temp);
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
        setPrevChannel(currentChannel);
        this.currentChannel = this.currentChannel + 1;
        System.out.println("The current channel is now " + this.currentChannel + "\n");
    }

    public void channelDown() {
        setPrevChannel(currentChannel);
        this.currentChannel = this.currentChannel - 1;
        System.out.println("The current channel is now " + this.currentChannel + "\n");
    }
}
