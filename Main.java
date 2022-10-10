import java.util.Scanner;

public class Main {
    static void menu() {
        System.out.println(
                "Please select one of the following options: \n(1)Power\n(2)Mute\n(3)Channel Up\n(4)Channel down");
        System.out.println("(5)Volume up\n(6)Volume down\n(7)Previous channel\n(8)Select channel\n(9)Exit");
    }

    public static void main(String[] args) {
        TV tv1 = new TV();
        Remote remote1 = new Remote();
        int option;

        Scanner scanner = new Scanner(System.in);
        do {

            menu();
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    remote1.pushButton(Button.POWER, tv1);
                    break;
                case 2:
                    remote1.pushButton(Button.MUTE, tv1);
                    break;
                case 3:
                    remote1.pushButton(Button.CHANNEL_UP, tv1);
                    break;
                case 4:
                    remote1.pushButton(Button.CHANNEL_DOWN, tv1);
                    break;
                case 5:
                    remote1.pushButton(Button.VOLUME_UP, tv1);
                    break;
                case 6:
                    remote1.pushButton(Button.VOLUME_DOWN, tv1);
                    break;
                case 7:
                    remote1.pushButton(Button.PREV_CHANNEL, tv1);
                    break;
                case 8:
                    System.out.println("Please enter a channel number 1-9999");
                    int channel = scanner.nextInt();
                    remote1.channelNum(channel, tv1);
                    break;
                case 9:
                    System.out.println("Closing application");
                    break;
                default:
                    System.out.println("Invalid input.");
            }
        } while (option != 9);

    }
}
