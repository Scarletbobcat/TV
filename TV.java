public class TV {
    private:
        int
            currentChannel, prevChannel, volume;
        boolean
            mute, power;

        int getCurrentChannel() {return currentChannel;}
        void setCurrentChannel(int x) {currentChannel = x;}
        void setPrevChannel(int x) {prevChannel = x;}
        void volumeUp() {volume++;}
        void volumeDown() {volume--;}
}
