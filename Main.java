//Tien Hoang
import java.util.Scanner;

public class Main {
    static void menu() {
        System.out.println("\nPlease select one of the following options: \n(O)Power\n(M)Mute\n(U)Channel Up\n(D)Channel down");
        System.out.println("(+)Volume up\n(-)Volume down\n(F)Flashback channel\n(N)Select channel\n(Q)Exit");
    }

    public static void main(String[] args) {
        //Initializing the "manufacturer's code"
        String key1 = "FirstRemote";
        String key2 = "SecondRemote";
        //Instantiate two remotes with different keys as manufacturer's code
        Remote remote1 = new Remote(key1);
        Remote remote2 = new Remote(key2);
        //Instantiating three tvs, 2 with matching manuCode with remote 1 and 1 with matching code with remote 2
        TV tv1 = new TV(remote1.getManuCode());
        TV tv2 = new TV(remote2.getManuCode());
        TV tv3 = new TV(remote1.getManuCode());
        char button;
        int remote;
        //Initializing array of tv objects with previously mentioned tvs
        TV[] object1 = {tv1, tv2, tv3};
        Scanner scanner = new Scanner(System.in);
        do {
            menu();
            button = scanner.next().charAt(0);
            button = Character.toUpperCase(button);
            switch (button) {
                case 'O':
                    //Collects which remote the user is using
                    System.out.println("Which remote would you like to use (1 or 2)? ");
                    remote = scanner.nextInt();
                    //Only the tvs whose manufacturer's code matches with the remote responds
                    //Same code for all other cases with minor adjustments
                    for (int i=0; i<object1.length; i++) {
                        //Prints the actions of each tv
                        System.out.println("\nTV" + (i+1) + ":");
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
                        System.out.println("\nTV" + (i+1) + ":");
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
                        System.out.println("\nTV" + (i+1) + ":");
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
                        System.out.println("\nTV" + (i+1) + ":");
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
                        System.out.println("\nTV" + (i+1) + ":");
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
                        System.out.println("\nTV" + (i+1) + ":");
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
                        System.out.println("\nTV" + (i+1) + ":");
                        if (remote1.getManuCode().equals(object1[i].getManuCode()) && remote == 1) {
                            remote1.pushButton(Button.PREV_CHANNEL, object1[i]);
                        }else if (remote2.getManuCode().equals(object1[i].getManuCode()) && remote == 2) {
                            remote2.pushButton(Button.PREV_CHANNEL, object1[i]);
                        }
                    }
                    break;
                case 'N':
                    System.out.println("Which remote would you like to use (1 or 2)? ");
                    remote = scanner.nextInt();
                    System.out.println("Please enter a channel number 1-9999");
                    int channel = scanner.nextInt();
                    //Checks if channel is valid input
                    if (channel < 1) {
                        System.out.println("Invalid channel number");
                    }else {
                        //Converts the channel to the first 4 numbers of the input
                        if (channel > 9999) {
                            int length = (int) (Math.log10(channel) + 1);
                            channel = channel / (int) Math.pow(10, length - 4);
                        }
                        for (int i=0; i<object1.length; i++) {
                            System.out.println("\nTV" + (i+1) + ":");
                            if (remote1.getManuCode().equals(object1[i].getManuCode()) && remote == 1) {
                                remote1.channelNum(channel, object1[i]);
                            }else if (remote2.getManuCode().equals(object1[i].getManuCode()) && remote == 2) {
                                remote2.channelNum(channel, object1[i]);
                            }
                        }
                    }
                    break;
                case 'Q':
                    break;
                default:
                    System.out.println("Invalid input.");
            }
        } while (button != 'Q');

    }
}
