/* isSetPresent
random 12, 3
 */

import java.util.ArrayList;

public class Card {
    private String color;
    private String shading;
    private String shape;
    private int number;

    String[] possibleColors = {"red", "green", "purple"};
    String[] possibleShadings = {"empty", "filled", "striped"};
    String[] possibleShapes = {"diamond", "wave", "oval"};
    int[] possibleNumbers = {1, 2, 3};


    public Card(String col, String shd, String shp, int num) {
        this.color = col;
        this.shading = shd;
        this.shape = shp;
        this.number = num;
    }

    //method that creates a deck of 81 unique cards
    public  ArrayList<Card> createDeck() {
        ArrayList<Card> deck = new ArrayList<Card>(81);
        for(int i = 0; i < possibleColors.length; i++) {
            for(int j = 0; j < possibleShadings.length; j++)  {
                for(int k = 0; k < possibleShapes.length; k++) {
                    for(int l = 0; l < possibleNumbers.length; l++) {
                        deck.add(new Card(color, shading, shape, number));
                    }
                }
            }
        }
        return deck;
    }

    //method that compares 3 cards and checks whether they form a set
    public boolean isSet(Card first, Card second, Card third) {
        if(((first.color).equals(second.color) && (first.color).equals(third.color) && (second.color).equals(third.color))
                && ((first.shading).equals(second.shading) && (first.shading).equals(third.shading) && (second.shading).equals(third.shading))
                && ((first.shape).equals(second.shape) && (first.shape).equals(third.shape) && (second.shape).equals(third.shape))
                && (first.number == second.number && first.number == third.number && second.number == third.number)){
            return true;
        }else if((!(first.color).equals(second.color) && !(first.color).equals(third.color) && !(second.color).equals(third.color))
                && (!(first.shading).equals(second.shading) && !(first.shading).equals(third.shading) && !(second.shading).equals(third.shading))
                && (!(first.shape).equals(second.shape) && !(first.shape).equals(third.shape) && !(second.shape).equals(third.shape))
                && (!(first.number == second.number) && !(first.number == third.number) && !(second.number == third.number))){
          return true;
        }

        return false;
    }

    

}
