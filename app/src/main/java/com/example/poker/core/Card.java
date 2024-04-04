package com.example.poker.core;
import com.example.poker.core.Types.Suit;
public class Card {
    private Suit suit;

    public Suit getSuit(){
        return this.suit;
    }
    public void setSuit(Suit suit){
        this.suit = suit;
    }
    private int rank;
    public int getRank(){
        return this.rank;
    }
    public void setRank(int rank){
        try{
            if(rank>13||rank<1){
                throw new IllegalArgumentException("Rank must be between 1 and 13 "+rank+" is not valid");
            }else{
                this.rank=rank;
            }
        }catch (IllegalArgumentException e){
            //log error
        }finally{
            this.rank = 1;
        }

    }
}
