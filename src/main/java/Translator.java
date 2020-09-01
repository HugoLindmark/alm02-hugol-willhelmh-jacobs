//Class Translator – The rules for the message that will be displayed. It will contain
//methods that will take a RandomFactor object and the inputs that were filled in the
//form and, then, based on certain rules that you will define, e.g. if first name starts with
//a-h or l-z, if the person is under 20 yo, etc, will return a String with a fortune message.


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Translator {

    RandomFactor randomFactor = new RandomFactor();
    List<String> fortuneList = new ArrayList<>();


    public  int getTheNumber() {
        int intFromName = randomFactor.getIntFromName("Carl af Linné");
        int intFromNationality = randomFactor.getIntFromNationality("Schweden");
        int intFromAge = randomFactor.getIntFromAge(103);
        int randomNr = (intFromAge + intFromNationality + intFromName ) / 4;

        if (randomNr > 100){
            randomNr ++;
        }else {
            randomNr --;
        }
        return randomNr;
    }


    public List<String> getFortuneList() throws FileNotFoundException {

        File file = new File(getClass().getClassLoader().getResource("fortunes.txt").getFile());
        List<String> fortuneList = new ArrayList<>();
        try {
            Scanner sc = new Scanner(file);
            String line = "";
            while (sc.hasNextLine()){
                line = sc.nextLine();
                fortuneList.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return fortuneList;
    }

    public void getFortuneFromList(int row) throws FileNotFoundException {
        System.out.println(getFortuneList().get(row));
    }

    public static void main(String[] args) throws FileNotFoundException {
        Translator getTheNr = new Translator();
        getTheNr.getTheNumber();
        getTheNr.getFortuneList();
        getTheNr.getFortuneFromList(getTheNr.getTheNumber());
    }
}
