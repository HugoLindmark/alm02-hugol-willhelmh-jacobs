//Class Translator – The rules for the message that will be displayed. It will contain
//methods that will take a RandomFactor object and the inputs that were filled in the
//form and, then, based on certain rules that you will define, e.g. if first name starts with
//a-h or l-z, if the person is under 20 yo, etc, will return a String with a fortune message.


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Translator {

    RandomFactor randomFactor = new RandomFactor();

    public  void getTheNumber() {
        int intFromName = randomFactor.getIntFromName("Carl af Linné");
        int intFromNationality = randomFactor.getIntFromNationality("Schweden");
        int intFromAge = randomFactor.getIntFromAge(103);
        int randomNr = (intFromAge + intFromNationality + intFromName ) / 4;


        if (randomNr > 100){
            randomNr ++;
        }else {
            randomNr --;
        }

        System.out.println(randomNr);

    }


    public List<String> getFortuneFromList() throws FileNotFoundException {
        String fortune = "";
        File file;
        List<String> fortuneList = new ArrayList<>();


        try {
            file = new File ("classpath:fortunes.txt");
            Scanner sc = new Scanner(file);
            String line = null;
            while (sc.hasNext()){
                fortuneList.add(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return fortuneList;
    }




    public static void main(String[] args) {
        Translator getTheNr = new Translator();
        getTheNr.getTheNumber();
    }
}
