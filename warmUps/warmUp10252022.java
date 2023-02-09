package warmUps;

import java.util.ArrayList;

public class warmUp10252022 {
    public static void main(String[] args) {
        String[] emails = {"aaaa@gmail.com", "bbbbb@yahoo.com", "ccccc@hotmail.com", "dddd@outlook.com", "eeee@yahoo.com", "ffff@hotmail.com", "gggg@outlook.com"};
        ArrayList<String> gmailList = new ArrayList<>();
        for(int i = 0; i<emails.length ; i++){
            if(emails[i].contains("gmail")) {
                System.out.println("Only gmails - "+emails[i]);
            }
        }

        ArrayList<String> gmailOut = new ArrayList<>();
        for(int i = 0; i<emails.length ; i++){
            if(!emails[i].contains("gmail")){
                gmailOut.add(emails[i]);
            }
        }
        System.out.println("Non gmail emails - "+gmailOut);

        for(int i = 0; i<emails.length ; i++){
            System.out.println(emails[i].split("@")[0]);
        }
    }
}
