//Name: Abdoul-Aziz Diagne
//Date: 9/27/2026
//Description: A program in which a set of characters can be created and manipulated, as well as a company's name being able to be put into said characters
public class Soup {
    //these are instance variables 
    private String letters;
    private String company;

    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters ="";
        company = "none";
    }


    //sets the name of the company to the provided name
    public void setCompany(String company){
        this.company = company;
    }

    //returns the company name
    public String getCompany(){
        return company;
    }

    //returns letters
    public String getLetters(){
        return letters;
    }

//below are the functions you'll be writing.

    //adds a word to the pool of letters known as "letters"
    // precondition: expected input is a string called "word" which would be the word the user wants to add
    // postcondition: no return, per the void, just changes the variable letters
    public void add(String word){
        letters += word.substring(0);
    }


    //Use Math.random() to get a random character from the letters string and return it.
    // precondition: variable "letters" must not be empty or null
    // postcondition: returns a random letter as a char
    public char randomLetter(){
            char letter = letters.charAt((int)(Math.random()*letters.length()));
            return letter;
    }


    //returns the letters currently stored with the company name placed directly in the center of all
    //the letters
    // precondition: N/A
    // postcondition: returns String that contains original string with the company put in the middle 
    public String companyCentered(){
       String charactersWithCompany = letters.substring(0, letters.length()/2) + company + letters.substring(letters.length()/2); 
        return charactersWithCompany;
    }


    //should remove the first available vowel from letters. If there are no vowels this method has no effect.
    // precondition: N/A
    // postcondition: returns nothing, but changes the string "letters" so it lacks the first vowel available
    public void removeFirstVowel(){
    letters = letters.replaceFirst("[aeiouAEIOU]", "");
    }

    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    // precondition: requires String "letters" to contain at least the amount of letters 'num' is input as
    // postcondition: returns nothing, simply removes 'num' letters and adjusts original string
    public void removeSome(int num){
        try{
        int startingIndex = (int)(Math.random()*(letters.length()-num));
        letters =  letters.substring(0, startingIndex) + letters.substring(startingIndex + num);
        }
        catch(Exception e) {

        }
    }
    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
    // precondition: input, which is a String called word
    // postcondition: returns nothing, simply removes indicated word from the "letters" string
    public void removeWord(String word){
        letters = letters.replaceAll(word, "");
    }
}