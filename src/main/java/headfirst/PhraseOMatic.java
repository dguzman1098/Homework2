package headfirst;

public class PhraseOMatic {
    public static void main (String[] args){
        String[] wordListOne =
        {"intelligent", "50,000 foot", "impossible", "warrior",
         "iconic", "strong-willed", "multi-tier", "elite",
         "dynamic", "1-1", "directional", "expert"
        };

        String[] wordListTwo =
        {"powerful", "clever", "saucy", "determined",
         "positioned", "organized", "feared", "controlled",
         "targeted", "valued", "fast-paced", "awakened"
         };

        String[] wordListThree =
        {"structure", "engineer", "vision", "goal",
         "tactical", "climax", "explosion", "competitor",
         "ambition", "timeless", "creator", "destroyer"
         };

        //store length of string list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //create random integer between 1 and the length of the list
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        //stores a string phrase of a random element in a three lists
        String phrase = wordListOne[rand1]+ " " + wordListTwo[rand2] +
                " " + wordListThree[rand3];

        //prints out the randomly generated phrase
        System.out.println("What we need is a " + phrase);

    }
}
