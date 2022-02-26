package io.zipcoder;


import javax.swing.text.StyledEditorKit;

/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input){
        int strLength = input.length();
        int countLetter = 0;

        //Loops through string looking for y and z and checks if the char after those letters is a space or not before counting
        for (int i = 0; i < strLength; i++){
            if (input.charAt(i) == 'y' || input.charAt(i) == 'z'){
                if (i < strLength - 1 && !Character.isLetter(input.charAt(i + 1))){
                    countLetter++;
                }
                else if (i == strLength - 1){
                    countLetter++;
                }
            }
        }
        return countLetter;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){
        return base.replaceAll(remove, ""); //Replaces what is in remove string with empty chars, deleting them
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){

        Boolean resultCount;
        String isCount = String.valueOf(input.split("in"));
        String notCount = String.valueOf(input.split("not"));

        if (isCount.length() == notCount.length()){
            resultCount = true;
        }
        else {
            resultCount = false;
        }
        return resultCount;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){

        int strLength = input.length();
        boolean isGHappy = false;

        for (int i = 0; i < strLength - 1; i++) {
            //checks if the letter before each or after each letter is the same. Sets to true if it is and sets to false if isn't
            if (input.charAt(i) == input.charAt(i + 1) || input.charAt(i) == input.charAt(i - 1)) {
                isGHappy = true;
            }
            else {
                isGHappy = false;
            }
        }
        return isGHappy;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){

        int countTriples = 0;
        int strLength = input.length();
        //Loops through string
        for (int i = 0; i < strLength - 1; i++){
            //Compares char at i to the 2 char after it to see if they are the same. Increments countTriples if it is
            if (input.charAt(i) == input.charAt(i + 1) && input.charAt(i) == input.charAt(i + 2)){
                countTriples++;
            }
        }
        return countTriples;
    }
}
