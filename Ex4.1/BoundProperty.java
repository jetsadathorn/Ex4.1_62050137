import java.util.Scanner;

public class BoundProperty {
    public static void main(String[] args) {
        MypropertyBean mySource = new MypropertyBean();
        listener1 listenner1 = new listener1();
        listener2 listenner2 = new listener2();
        mySource.addPropertyChangeListener(listenner1);
        mySource.addPropertyChangeListener(listenner2);
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Score Thai-UAE : ");
            String str = sc.nextLine();
            if (str.equals("")) {
                System.out.println("It works!");
                break;
            }
            String[] strArray = str.split(" ");
            int[] intArray = new int[strArray.length];
            for (int i = 0; i < strArray.length; i++) {
                intArray[i] = Integer.parseInt(strArray[i]);
            }

            mySource.setValue(intArray);
        }

    }
}
