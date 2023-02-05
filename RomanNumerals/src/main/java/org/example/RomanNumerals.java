package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RomanNumerals {

    Set<String> HundredsNumerals = new HashSet<String>(Arrays.asList("D", "C"));
    public enum numberSize{Thousands,Hundreds, Tens, Units};

    public int convertNumeralNumberTo(String m) {
        int returnNumber = 0;
        RomanNumerals.numberSize currentWorkingSize = numberSize.Thousands;
        int thousands = 0;
        String hundredsString = "";
        String tensString = "";
        String unitsString = "";

        for (char ch : m.toCharArray()) {
            switch (ch){
                case('M'):
                    if(currentWorkingSize == numberSize.Thousands)
                    {
                        thousands++;
                    } else {
                        hundredsString += ch; // ONLY time we should get here : 900
                    }
                    break;
                case('D'):
                case('C'):
                    if(currentWorkingSize != numberSize.Tens){
                        currentWorkingSize = numberSize.Hundreds;
                        hundredsString += ch;
                    } else {
                        tensString += ch;
                    }
                    break;
                case('X'):
                case('L'):
                    if(currentWorkingSize != numberSize.Units) {
                        currentWorkingSize = numberSize.Tens;
                        tensString += ch;
                    } else {
                        unitsString += ch;
                    }
                    break;
                case('V'):
                case('I'):
                    currentWorkingSize = numberSize.Units;
                    unitsString += ch;
                    break;

                default:
                    // something wrong here ?
                    break;
            }


        }
        returnNumber += (thousands * 1000);
        returnNumber += turnHundredNumeralsToInt(hundredsString);
        returnNumber += turnTenNumeralsToInt(tensString);
        returnNumber += turnUnitNumeralsToInt(unitsString);

        return returnNumber;
    }

    public int turnHundredNumeralsToInt(String hundreds){
        int returnInt = 0;
        int numberOfNumerals = hundreds.length();
        for(int h = 0; h < numberOfNumerals; h++){
            if(hundreds.charAt(h) == 'C'){
                if((h==0)&&(numberOfNumerals>1)){
                    returnInt -= 100;
                } else {
                    returnInt += 100;
                }
            } else if (hundreds.charAt(h)== 'D') {
                returnInt += 500;
            } else if (hundreds.charAt(h)== 'M') {
                returnInt += 1000;
            } else {
                // could be an M = do nothing
            }
        }
        return returnInt;
    }

    public int turnTenNumeralsToInt(String tens){
        int returnInt = 0;
        int numberOfNumerals = tens.length();
        for(int h = 0; h < numberOfNumerals; h++){
            if(tens.charAt(h) == 'X'){
                if((h==0)&&(numberOfNumerals>1)){
                    returnInt -= 10;
                } else {
                    returnInt += 10;
                }
            } else if (tens.charAt(h)== 'L') {
                returnInt += 50;
            } else if (tens.charAt(h)== 'C') {
                returnInt += 100;
            } else {
                // could be an M = do nothing
            }
        }
        return returnInt;
    }

    public int turnUnitNumeralsToInt(String units) {
        int returnInt = 0;
        int numberOfNumerals = units.length();
        for (int h = 0; h < numberOfNumerals; h++) {
            if (units.charAt(h) == 'I') {
                if ((h == 0) && (numberOfNumerals > 1)) {
                    returnInt -= 1;
                } else {
                    returnInt += 1;
                }
            } else if (units.charAt(h) == 'V') {
                returnInt += 5;
            } else if (units.charAt(h) == 'X') {
                returnInt += 10;
            } else {
                // could be an M = do nothing
            }
        }
        return returnInt;
    }


    public String convertToNumerals(numberSize numSize, int num){
        String returnNumber = "";

        if((num >= 0) && (num <= 3)){
            if(numSize == numberSize.Hundreds) {
                for (int start = 1; start <= num; start++) {
                    returnNumber += "C";
                }
            } else if(numSize == numberSize.Tens){
                for (int start = 1; start <= num; start++) {
                    returnNumber += "X";
                }
            }else if(numSize == numberSize.Units) {
                for (int start = 1; start <= num; start++) {
                    returnNumber += "I";
                }
            } else{
                // raise exception ?
            }
        } else if(num == 4) {
            if(numSize == numberSize.Hundreds) {
                returnNumber += "CD";
            }else if(numSize == numberSize.Tens){
                returnNumber += "XL";
            }else if(numSize == numberSize.Units) {
                returnNumber += "IV";
            } else{
                // raise exception ?
            }
        } else if((num >= 5) && (num <= 8)){
            if(numSize == numberSize.Hundreds){
                returnNumber += "D";
                for(int start = 6; start <= num; start++){
                    returnNumber += "C";
                }
            }else if(numSize == numberSize.Tens){
                returnNumber += "L";
                for(int start = 6; start <= num; start++){
                    returnNumber += "X";
                }
            }else if(numSize == numberSize.Units) {
                returnNumber += "V";
                for (int start = 6; start <= num; start++) {
                    returnNumber += "I";
                }
            } else{
                // raise exception ?
            }
        } else if(num==9){
            if(numSize == numberSize.Hundreds) {
                returnNumber += "CM";
            }else if(numSize == numberSize.Tens){
                returnNumber += "XC";
            }else if(numSize == numberSize.Units) {
                returnNumber += "IX";
            } else{
                // raise exception ?
            }

        } else{
            // raise exception - shouldn't get here ?
        }


        return returnNumber;
    }

    public String convertNumberToNumeral(int i) {

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
                    int hundred = (int)(i/100);
                    i = i - (hundred * 100);
                    String addH = convertToNumerals(RomanNumerals.numberSize.Hundreds,hundred);
                    returnNumerals += addH;
                    break;
                case 2:
                    int tens = (int)(i/10);
                    i = i - (tens * 10);
                    String addT = convertToNumerals(RomanNumerals.numberSize.Tens,tens);
                    returnNumerals += addT;
                    break;
                case 1:
                    returnNumerals += convertToNumerals(RomanNumerals.numberSize.Units,i);
                    break;
                default:
                    break;
            }
        }
        return returnNumerals;
    }

}
