package middle_letter;

public class MiddleLetter {

    public String middle(String inputString){
        Integer strLength = inputString.length();
        if(strLength % 2 == 1){
            return buildString(inputString, strLength /2);
        }else{
            int middleIndex = strLength/2;
            return buildString(inputString, (middleIndex - 1)) +
                    buildString(inputString, middleIndex);
        }
    }
    public String buildString (String inputString, int index){
        return String.valueOf(inputString.charAt(index));
    }
}
