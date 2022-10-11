//Tien Hoang
import java.util.Scanner;

public class Main {
    static void menu() {
        System.out.println("Please select one of the following options: \n(P)Power\n(M)Mute\n(U)Channel Up\n(D)Channel down");
        System.out.println("(+)Volume up\n(-)Volume down\n(F)Previous channel\n(C)Select channel\n(E)Exit");
    }

    public static void main(String[] args) {
        String key1 = "FirstRemote";
        String key2 = "SecondRemote";
        Remote remote1 = new Remote(key1);
        Remote remote2 = new Remote(key2);
        TV tv1 = new TV(remote1.getManuCode());
        TV tv2 = new TV(remote2.getManuCode());
        TV tv3 = new TV(remote1.getManuCode());
        char option;

        TV[] object1 = {tv1, tv2, tv3};
        int remote;
        Scanner scanner = new Scanner(System.in);
        do {
            menu();
            option = scanner.next().charAt(0);
            switch (option) {
                case 'P':
                    System.out.println("Which remote would you like to use (1 or 2)? ");
                    remote = scanner.nextInt();
                    for (int i=0; i<object1.length; i++) {
                        System.out.println("TV" + (i+1) + ":");
                        if (remote1.getManuCode().equals(object1[i].getManuCode()) && remote == 1) {
                            remote1.pushButton(Button.POWER, object1[i]);
                        }else if (remote2.getManuCode().equals(object1[i].getManuCode()) && remote == 2) {
                            remote2.pushButton(Button.POWER, object1[i]);
                        }
                    }
                    break;
                case 'M':
                    System.out.println("Which remote would you like to use (1 or 2)? ");
                    remote = scanner.nextInt();
                    for (int i=0; i<object1.length; i++) {
                        System.out.println("TV" + (i+1) + ":");
                        if (remote1.getManuCode().equals(object1[i].getManuCode()) && remote == 1) {
                            remote1.pushButton(Button.MUTE, object1[i]);
                        }else if (remote2.getManuCode().equals(object1[i].getManuCode()) && remote == 2) {
                            remote2.pushButton(Button.MUTE, object1[i]);
                        }
                    }
                    break;
                case 'U':
                    System.out.println("Which remote would you like to use (1 or 2)? ");
                    remote = scanner.nextInt();
                    for (int i=0; i<object1.length; i++) {
                        System.out.println("TV" + (i+1) + ":");
                        if (remote1.getManuCode().equals(object1[i].getManuCode()) && remote == 1) {
                            remote1.pushButton(Button.CHANNEL_UP, object1[i]);
                        }else if (remote2.getManuCode().equals(object1[i].getManuCode()) && remote == 2) {
                            remote2.pushButton(Button.CHANNEL_UP, object1[i]);
                        }
                    }
                    break;
                case 'D':
                    System.out.println("Which remote would you like to use (1 or 2)? ");
                    remote = scanner.nextInt();
                    for (int i=0; i<object1.length; i++) {
                        System.out.println("TV" + (i+1) + ":");
                        if (remote1.getManuCode().equals(object1[i].getManuCode()) && remote == 1) {
                            remote1.pushButton(Button.CHANNEL_DOWN, object1[i]);
                        }else if (remote2.getManuCode().equals(object1[i].getManuCode()) && remote == 2) {
                            remote2.pushButton(Button.CHANNEL_DOWN, object1[i]);
                        }
                    }
                    break;
                case '+':
                    System.out.println("Which remote would you like to use (1 or 2)? ");
                    remote = scanner.nextInt();
                    for (int i=0; i<object1.length; i++) {
                        System.out.println("TV" + (i+1) + ":");
                        if (remote1.getManuCode().equals(object1[i].getManuCode()) && remote == 1) {
                            remote1.pushButton(Button.VOLUME_UP, object1[i]);
                        }else if (remote2.getManuCode().equals(object1[i].getManuCode()) && remote == 2) {
                            remote2.pushButton(Button.VOLUME_UP, object1[i]);
                        }
                    }
                    break;
                case '-':
                    System.out.println("Which remote would you like to use (1 or 2)? ");
                    remote = scanner.nextInt();
                    for (int i=0; i<object1.length; i++) {
                        System.out.println("TV" + (i+1) + ":");
                        if (remote1.getManuCode().equals(object1[i].getManuCode()) && remote == 1) {
                            remote1.pushButton(Button.VOLUME_DOWN, object1[i]);
                        }else if (remote2.getManuCode().equals(object1[i].getManuCode()) && remote == 2) {
                            remote2.pushButton(Button.VOLUME_UP, object1[i]);
                        }
                    }
                    break;
                case 'F':
                    System.out.println("Which remote would you like to use (1 or 2)? ");
                    remote = scanner.nextInt();
                    for (int i=0; i<object1.length; i++) {
                        System.out.println("TV" + (i+1) + ":");
                        if (remote1.getManuCode().equals(object1[i].getManuCode()) && remote == 1) {
                            remote1.pushButton(Button.PREV_CHANNEL, object1[i]);
                        }else if (remote2.getManuCode().equals(object1[i].getManuCode()) && remote == 2) {
                            remote2.pushButton(Button.PREV_CHANNEL, object1[i]);
                        }
                    }
                    break;
                case 'C':
                    System.out.println("Which remote would you like to use (1 or 2)? ");
                    remote = scanner.nextInt();
                    System.out.println("Please enter a channel number 1-9999");
                    int channel = scanner.nextInt();
                    for (int i=0; i<object1.length; i++) {
                        System.out.println("TV" + (i+1) + ":");
                        if (remote1.getManuCode().equals(object1[i].getManuCode()) && remote == 1) {
                            remote1.channelNum(channel, object1[i]);
                        }else if (remote2.getManuCode().equals(object1[i].getManuCode()) && remote == 2) {
                            remote2.channelNum(channel, object1[i]);
                        }
                    }
                    break;
                case 'E':
                    System.out.println("Closing application");
                    break;
                default:
                    System.out.println("Invalid input.");
            }
        } while (option != 'E');

    }
}
