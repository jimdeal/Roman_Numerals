package org.example;

public class RomanNumerals {
    public final int ONE = 1;
    public final int TWO = 2;
    public final int THREE = 3;
    public final int FOUR = 4;
    public final int FIVE = 5;
    public final int SIX = 6;
    public final int SEVEN = 7;
    public final int EIGHT = 8;
    public final int NINE = 9;
    public final int TEN = 10;

    public final String ONE_NUMERAL = "I";
    public final String TWO_NUMERAL = "II";
    public final String THREE_NUMERAL = "III";
    public final String FOUR_NUMERAL = "IV";
    public final String FIVE_NUMERAL = "V";
    public final String SIX_NUMERAL = "VI";
    public final String SEVEN_NUMERAL= "VII";
    public final String EIGHT_NUMERAL = "VIII";
    public final String NINE_NUMERAL = "IX";

    public String convert(int i) {

        String returnNumerals = new String();

        int numberSize = String.valueOf(i).length();

        for(int numIt = numberSize; numIt > 0; numIt--){
            switch(numIt){
                case 4:
                    int thousand = (int)(i/1000);
                    i = i - (thousand * 1000);
                    String addM = "";
                    for(int m = 0; m<thousand;m++){
                        addM += "M";
                    }
                    returnNumerals += addM;
                    break;
                case 3:
                    break;
                case 2:
                    break;
                case 1:
                    break;
                default:
                    break;
            }
        }
        return returnNumerals;
    }

    private String convertLessThanTenToNumerals(int i) {
        System.out.println("in convertLessThanTenToNumerals");

        String retNumerals = "";

        switch (i) {
            case 1:
                retNumerals = ONE_NUMERAL;
                break;
            case 2:
                retNumerals = TWO_NUMERAL;
                break;
            case 3:
                retNumerals = THREE_NUMERAL;
                break;
            case 4:
                retNumerals = FOUR_NUMERAL;
                break;
            case 5:
                retNumerals = FIVE_NUMERAL;
                break;
            case 6:
                retNumerals = SIX_NUMERAL;
                break;
            case 7:
                retNumerals = SEVEN_NUMERAL;
                break;
            case 8:
                retNumerals = EIGHT_NUMERAL;
                break;
            case 9:
                retNumerals = NINE_NUMERAL;
                break;
            default:
                break;
        }
        return retNumerals;
    }
}
