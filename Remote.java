//Tien Hoang
public class Remote {
    public Remote(String key1) {
        manuCode = key1;
    }

    final private String manuCode;
    void pushButton(Button b, TV tv1) {
        if (b == Button.POWER) {
            tv1.powerState();
        } else if (b == Button.MUTE) {
            tv1.setMute();
        } else if (b == Button.VOLUME_UP) {
            tv1.volumeUp();
        } else if (b == Button.VOLUME_DOWN) {
            tv1.volumeDown();
        } else if (b == Button.CHANNEL_UP) {
            tv1.channelUp();
        } else if (b == Button.CHANNEL_DOWN) {
            tv1.channelDown();
        } else if (b == Button.PREV_CHANNEL) {
            tv1.flashback();
        }
    }
    String getManuCode() { return manuCode;}
    void channelNum(int x, TV tv1) {
        tv1.setCurrentChannel(x);
    }
}
