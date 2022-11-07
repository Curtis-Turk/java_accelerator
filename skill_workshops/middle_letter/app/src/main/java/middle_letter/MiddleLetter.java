package middle_letter;

public class MiddleLetter {

    public String middle(String inputString){
        int strLength = inputString.length();
        int middleIndex = strLength/2;
        if(strLength % 2 == 1){
            return buildString(inputString, middleIndex);
        }else{
            return buildString(inputString, (middleIndex - 1)) +
                    buildString(inputString, middleIndex);
        }
    }
    public String buildString (String inputString, int index){
        return String.valueOf(inputString.charAt(index));
    }
}
