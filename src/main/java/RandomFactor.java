    //  Class RandomFactor – Will be used to randomize a number between a certain range,
    //  e.g. 1-10 and be send the result to the translator class.


public class RandomFactor {

    public int getIntFromName(String fullName){

        return fullName.length() + 3;
    }

    public  int getIntFromNationality(String nationionality){

        return nationionality.length() - 3;
    }

    public  int getIntFromAge(int age){
        return age + 9;
    }



}
