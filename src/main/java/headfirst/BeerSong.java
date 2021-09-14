package headfirst;

public class BeerSong {
    public static void main(String[] args){
        int beerNum = 99;
        String word = "bottles";

        //while 99 - 1 > 0
        while(beerNum > 0){
            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum--; // 99-1 through every loop

            if (beerNum == 1){
                word = "bottle";
            }

            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " of beer on the wall");

            } else {
                System.out.println("No more bottles of beer on the wall");
            }
        }

        // The flaw was that when beerNum is 1 it printed 1 bottles of the beer on the wall.
        //It was because the first if statement check was before the system.out statements.
        //It was doing beerNum - 1 after the if statement. I fixed it by moving the first if statement
        //under lines 9-13.













    }

}
