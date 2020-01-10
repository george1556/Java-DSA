import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Algorithm {



//  ******** Method #1 allEqual ********
    public boolean allEqual(String test){
        if(test == ""){
            return false;
        }

        String currentWord = test.toLowerCase();
        char firstLetter = currentWord.charAt(0);

        for (int i = 0; i < currentWord.length(); i++) {
            if(currentWord.charAt(i) != firstLetter){
                return false;
            }
        }
        return true;
    }

//  ******** Method #2 letterCount ********
    public HashMap<String, Long> letterCount(String test){
        test = test.toLowerCase();
        HashMap<String, Long> accumulator = new HashMap<String, Long>();


        // Loop through each letter of the string passed in
        for (int i = 0; i < test.length(); i++) {
            String currentStringLetter = String.valueOf(test.charAt(i));
            boolean doesCurrentLetterExist = false;

            //Loop through the accumulator to see if the key value exists
            for(HashMap.Entry<String, Long> entry : accumulator.entrySet()){
                //Variable to hold current key name
                String currentKey = entry.getKey();

                //Compare current key name to current string letter
                if(currentKey.equals(currentStringLetter)){
                    doesCurrentLetterExist = true;
                }
            }

            //If the key name exists, increment the value. If it doesn't exist, create it and set value to 1
            if(doesCurrentLetterExist == false){
                accumulator.put(currentStringLetter, Long.valueOf(1));
            }else {
                Long count = accumulator.get(currentStringLetter)+1;
                accumulator.put(currentStringLetter, count);
            }
        }

        return accumulator;
    }

//  ******** Method #3 interleave ********
    public String interleave(List<String> list1, List<String> list2){
        String accumulator = "";

        for (int i = 0; i < list1.size(); i++) {
            accumulator += list1.get(i);
            accumulator += list2.get(i);
        }

        return accumulator;
    }


}
