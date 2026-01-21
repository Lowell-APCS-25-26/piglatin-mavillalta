package org.APCSLowell;

public class PigLatin {
    public int findFirstVowel(String word) {
        //precondition: sWord is a valid String of length greater than 0.
        //postcondition: returns the position of the first vowel in sWord.  If there are no vowels, returns -1
	    for(int i=0;i<word.length();i++){
            if("aeiou".indexOf(word.charAt(i))!=-1)
             return i;
         }
        return -1;
    }

    public String pigLatin(String w) {
        //precondition: sWord is a valid String of length greater than 0
        //postcondition: returns the pig latin equivalent of sWord
        if(findFirstVowel(w)==-1){
            return w +"ay";
        }
        if(findFirstVowel(w)==0){
            return w +"way";
        }
        if(w.substring(0,2).equals("qu")){
            return w.substring(2,w.length())+"quay";

        }
        if(findFirstVowel(w)>0){
            return w.substring(findFirstVowel(w),w.length())+w.substring(0,findFirstVowel(w))+"ay";
        }
        return null;
    }
}
