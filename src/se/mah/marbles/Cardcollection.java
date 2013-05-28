package se.mah.marbles;
//Cardcollections
import java.util.ArrayList;
import java.util.Collections;

public class Cardcollection {

	private ArrayList<Picture> cards_simple;
	private ArrayList<Picture> cards_medium;
	private ArrayList<Picture> cards_hard;
	
	
	public Cardcollection(){
		
		//Simple collection
		cards_simple= new ArrayList<Picture>();
		
		cards_simple.add(new Picture(R.drawable.card_1, 1));
		cards_simple.add(new Picture(R.drawable.card_1_1, 1));
		
		cards_simple.add(new Picture(R.drawable.card_2, 2));
		cards_simple.add(new Picture(R.drawable.card_2_2, 2));
		
		cards_simple.add(new Picture(R.drawable.card_3, 3));
		cards_simple.add(new Picture(R.drawable.card_3_3, 3));
		
		cards_simple.add(new Picture(R.drawable.card_4, 4));
		cards_simple.add(new Picture(R.drawable.card_4_4, 4));
		
		cards_simple.add(new Picture(R.drawable.card_5, 5));
		cards_simple.add(new Picture(R.drawable.card_5_5, 5));
		
		cards_simple.add(new Picture(R.drawable.card_6, 6));
		cards_simple.add(new Picture(R.drawable.card_6_6, 6));
		
		cards_simple.add(new Picture(R.drawable.card_7, 7));
		cards_simple.add(new Picture(R.drawable.card_7_7, 7));
		
		cards_simple.add(new Picture(R.drawable.card_8, 8));
		cards_simple.add(new Picture(R.drawable.card_8_8, 8));
		
		cards_simple.add(new Picture(R.drawable.card_9, 9));
		cards_simple.add(new Picture(R.drawable.card_9_9, 9));
		
		cards_simple.add(new Picture(R.drawable.card_10, 10));
		cards_simple.add(new Picture(R.drawable.card_10_10, 10));
		
		//
		
		cards_simple.add(new Picture(R.drawable.card_1, 1));
		cards_simple.add(new Picture(R.drawable.card_1_1, 1));
		
		cards_simple.add(new Picture(R.drawable.card_2, 2));
		cards_simple.add(new Picture(R.drawable.card_2_2, 2));
		
		cards_simple.add(new Picture(R.drawable.card_3, 3));
		cards_simple.add(new Picture(R.drawable.card_3_3, 3));
		
		cards_simple.add(new Picture(R.drawable.card_4, 4));
		cards_simple.add(new Picture(R.drawable.card_4_4, 4));
		
		cards_simple.add(new Picture(R.drawable.card_5, 5));
		cards_simple.add(new Picture(R.drawable.card_5_5, 5));
		
		cards_simple.add(new Picture(R.drawable.card_6, 6));
		cards_simple.add(new Picture(R.drawable.card_6_6, 6));
		
		cards_simple.add(new Picture(R.drawable.card_7, 7));
		cards_simple.add(new Picture(R.drawable.card_7_7, 7));
		
		cards_simple.add(new Picture(R.drawable.card_8, 8));
		cards_simple.add(new Picture(R.drawable.card_8_8, 8));
		
		cards_simple.add(new Picture(R.drawable.card_9, 9));
		cards_simple.add(new Picture(R.drawable.card_9_9, 9));
		
		cards_simple.add(new Picture(R.drawable.card_10, 10));
		cards_simple.add(new Picture(R.drawable.card_10_10, 10));
		
		//
		
		cards_simple.add(new Picture(R.drawable.card_11, 11));
		cards_simple.add(new Picture(R.drawable.card_11_11, 11));
		
		cards_simple.add(new Picture(R.drawable.card_12, 12));
		cards_simple.add(new Picture(R.drawable.card_12_12, 12));
		
		cards_simple.add(new Picture(R.drawable.card_13, 13));
		cards_simple.add(new Picture(R.drawable.card_13_13, 13));
		
		cards_simple.add(new Picture(R.drawable.card_14, 14));
		cards_simple.add(new Picture(R.drawable.card_14_14, 14));
		
		cards_simple.add(new Picture(R.drawable.card_15, 15));
		cards_simple.add(new Picture(R.drawable.card_15_15, 15));

		cards_simple.add(new Picture(R.drawable.card_16, 16));
		cards_simple.add(new Picture(R.drawable.card_16_16, 16));
		
		cards_simple.add(new Picture(R.drawable.card_17, 17));
		cards_simple.add(new Picture(R.drawable.card_17_17, 17));
		
		cards_simple.add(new Picture(R.drawable.card_18, 18));
		cards_simple.add(new Picture(R.drawable.card_18_18, 18));
		
		cards_simple.add(new Picture(R.drawable.card_19, 19));
		cards_simple.add(new Picture(R.drawable.card_19_19, 19));

		cards_simple.add(new Picture(R.drawable.card_20, 20));
		cards_simple.add(new Picture(R.drawable.card_20_20, 20));
		
		//
		cards_simple.add(new Picture(R.drawable.card_11, 11));
		cards_simple.add(new Picture(R.drawable.card_11_11, 11));
		
		cards_simple.add(new Picture(R.drawable.card_12, 12));
		cards_simple.add(new Picture(R.drawable.card_12_12, 12));
		
		cards_simple.add(new Picture(R.drawable.card_13, 13));
		cards_simple.add(new Picture(R.drawable.card_13_13, 13));
		
		cards_simple.add(new Picture(R.drawable.card_14, 14));
		cards_simple.add(new Picture(R.drawable.card_14_14, 14));
		
		cards_simple.add(new Picture(R.drawable.card_15, 15));
		cards_simple.add(new Picture(R.drawable.card_15_15, 15));

		cards_simple.add(new Picture(R.drawable.card_16, 16));
		cards_simple.add(new Picture(R.drawable.card_16_16, 16));
		
		cards_simple.add(new Picture(R.drawable.card_17, 17));
		cards_simple.add(new Picture(R.drawable.card_17_17, 17));
		
		cards_simple.add(new Picture(R.drawable.card_18, 18));
		cards_simple.add(new Picture(R.drawable.card_18_18, 18));
		
		cards_simple.add(new Picture(R.drawable.card_19, 19));
		cards_simple.add(new Picture(R.drawable.card_19_19, 19));

		cards_simple.add(new Picture(R.drawable.card_20, 20));
		cards_simple.add(new Picture(R.drawable.card_20_20, 20));	
		
		
		//Medium collection
		cards_medium= new ArrayList<Picture>();
		
		cards_medium.add(new Picture(R.drawable.card_1, 1));
		cards_medium.add(new Picture(R.drawable.card_1_1, 1));
		
		cards_medium.add(new Picture(R.drawable.card_2, 2));
		cards_medium.add(new Picture(R.drawable.card_2_2, 2));
		
		cards_medium.add(new Picture(R.drawable.card_3, 3));
		cards_medium.add(new Picture(R.drawable.card_3_3, 3));
		
		cards_medium.add(new Picture(R.drawable.card_4, 4));
		cards_medium.add(new Picture(R.drawable.card_4_4, 4));
		
		cards_medium.add(new Picture(R.drawable.card_5, 5));
		cards_medium.add(new Picture(R.drawable.card_5_5, 5));
		
		cards_medium.add(new Picture(R.drawable.card_6, 6));
		cards_medium.add(new Picture(R.drawable.card_6_6, 6));
		
		cards_medium.add(new Picture(R.drawable.card_7, 7));
		cards_medium.add(new Picture(R.drawable.card_7_7, 7));
		
		cards_medium.add(new Picture(R.drawable.card_8, 8));
		cards_medium.add(new Picture(R.drawable.card_8_8, 8));
		
		cards_medium.add(new Picture(R.drawable.card_9, 9));
		cards_medium.add(new Picture(R.drawable.card_9_9, 9));
		
		cards_medium.add(new Picture(R.drawable.card_10, 10));
		cards_medium.add(new Picture(R.drawable.card_10_10, 10));
		
		cards_medium.add(new Picture(R.drawable.card_11, 11));
		cards_medium.add(new Picture(R.drawable.card_11_11, 11));
		
		cards_medium.add(new Picture(R.drawable.card_12, 12));
		cards_medium.add(new Picture(R.drawable.card_12_12, 12));
		
		cards_medium.add(new Picture(R.drawable.card_13, 13));
		cards_medium.add(new Picture(R.drawable.card_13_13, 13));
		
		cards_medium.add(new Picture(R.drawable.card_14, 14));
		cards_medium.add(new Picture(R.drawable.card_14_14, 14));
		
		cards_medium.add(new Picture(R.drawable.card_15, 15));
		cards_medium.add(new Picture(R.drawable.card_15_15, 15));

		cards_medium.add(new Picture(R.drawable.card_16, 16));
		cards_medium.add(new Picture(R.drawable.card_16_16, 16));
		
		cards_medium.add(new Picture(R.drawable.card_17, 17));
		cards_medium.add(new Picture(R.drawable.card_17_17, 17));
		
		cards_medium.add(new Picture(R.drawable.card_18, 18));
		cards_medium.add(new Picture(R.drawable.card_18_18, 18));
		
		cards_medium.add(new Picture(R.drawable.card_19, 19));
		cards_medium.add(new Picture(R.drawable.card_19_19, 19));
		
		cards_medium.add(new Picture(R.drawable.card_20, 20));
		cards_medium.add(new Picture(R.drawable.card_20_20, 20));
		

		cards_medium.add(new Picture(R.drawable.card_31, 31));
		cards_medium.add(new Picture(R.drawable.card_31_31, 31));
		
		cards_medium.add(new Picture(R.drawable.card_32, 32));
		cards_medium.add(new Picture(R.drawable.card_32_32, 32));
		
		cards_medium.add(new Picture(R.drawable.card_33, 33));
		cards_medium.add(new Picture(R.drawable.card_33_33, 33));
		
		cards_medium.add(new Picture(R.drawable.card_34, 34));
		cards_medium.add(new Picture(R.drawable.card_34_34, 34));
		
		cards_medium.add(new Picture(R.drawable.card_35, 35));
		cards_medium.add(new Picture(R.drawable.card_35_35, 35));
		
		cards_medium.add(new Picture(R.drawable.card_36, 36));
		cards_medium.add(new Picture(R.drawable.card_36_36, 36));
		
		cards_medium.add(new Picture(R.drawable.card_37, 37));
		cards_medium.add(new Picture(R.drawable.card_37_37, 37));

		cards_medium.add(new Picture(R.drawable.card_38, 38));
		cards_medium.add(new Picture(R.drawable.card_38_38, 38));
		
		cards_medium.add(new Picture(R.drawable.card_39, 39));
		cards_medium.add(new Picture(R.drawable.card_39_39, 39));
		
		cards_medium.add(new Picture(R.drawable.card_40, 40));
		cards_medium.add(new Picture(R.drawable.card_40_40, 40));	

		
		cards_medium.add(new Picture(R.drawable.card_31, 31));
		cards_medium.add(new Picture(R.drawable.card_31_31, 31));
		
		cards_medium.add(new Picture(R.drawable.card_32, 32));
		cards_medium.add(new Picture(R.drawable.card_32_32, 32));
		
		cards_medium.add(new Picture(R.drawable.card_33, 33));
		cards_medium.add(new Picture(R.drawable.card_33_33, 33));
		
		cards_medium.add(new Picture(R.drawable.card_34, 34));
		cards_medium.add(new Picture(R.drawable.card_34_34, 34));
		
		cards_medium.add(new Picture(R.drawable.card_35, 35));
		cards_medium.add(new Picture(R.drawable.card_35_35, 35));
		
		cards_medium.add(new Picture(R.drawable.card_36, 36));
		cards_medium.add(new Picture(R.drawable.card_36_36, 36));
		
		cards_medium.add(new Picture(R.drawable.card_37, 37));
		cards_medium.add(new Picture(R.drawable.card_37_37, 37));

		cards_medium.add(new Picture(R.drawable.card_38, 38));
		cards_medium.add(new Picture(R.drawable.card_38_38, 38));
		
		cards_medium.add(new Picture(R.drawable.card_39, 39));
		cards_medium.add(new Picture(R.drawable.card_39_39, 39));
		
		cards_medium.add(new Picture(R.drawable.card_40, 40));
		cards_medium.add(new Picture(R.drawable.card_40_40, 40));		

		
		//Difficult collection
		cards_hard= new ArrayList<Picture>();
		
		cards_hard.add(new Picture(R.drawable.card_1, 1));
		cards_hard.add(new Picture(R.drawable.card_1_1, 1));
		
		cards_hard.add(new Picture(R.drawable.card_2, 2));
		cards_hard.add(new Picture(R.drawable.card_2_2, 2));
		
		cards_hard.add(new Picture(R.drawable.card_3, 3));
		cards_hard.add(new Picture(R.drawable.card_3_3, 3));
		
		cards_hard.add(new Picture(R.drawable.card_4, 4));
		cards_hard.add(new Picture(R.drawable.card_4_4, 4));
		
		cards_hard.add(new Picture(R.drawable.card_5, 5));
		cards_hard.add(new Picture(R.drawable.card_5_5, 5));
		
		cards_hard.add(new Picture(R.drawable.card_6, 6));
		cards_hard.add(new Picture(R.drawable.card_6_6, 6));
		
		cards_hard.add(new Picture(R.drawable.card_7, 7));
		cards_hard.add(new Picture(R.drawable.card_7_7, 7));
		
		cards_hard.add(new Picture(R.drawable.card_8, 8));
		cards_hard.add(new Picture(R.drawable.card_8_8, 8));
		
		cards_hard.add(new Picture(R.drawable.card_9, 9));
		cards_hard.add(new Picture(R.drawable.card_9_9, 9));
		
		cards_hard.add(new Picture(R.drawable.card_10, 10));
		cards_hard.add(new Picture(R.drawable.card_10_10, 10));
		
		cards_hard.add(new Picture(R.drawable.card_11, 11));
		cards_hard.add(new Picture(R.drawable.card_11_11, 11));
		
		cards_hard.add(new Picture(R.drawable.card_12, 12));
		cards_hard.add(new Picture(R.drawable.card_12_12, 12));
		
		cards_hard.add(new Picture(R.drawable.card_13, 13));
		cards_hard.add(new Picture(R.drawable.card_13_13, 13));
		
		cards_hard.add(new Picture(R.drawable.card_14, 14));
		cards_hard.add(new Picture(R.drawable.card_14_14, 14));
		
		cards_hard.add(new Picture(R.drawable.card_15, 15));
		cards_hard.add(new Picture(R.drawable.card_15_15, 15));

		cards_hard.add(new Picture(R.drawable.card_16, 16));
		cards_hard.add(new Picture(R.drawable.card_16_16, 16));
		
		cards_hard.add(new Picture(R.drawable.card_17, 17));
		cards_hard.add(new Picture(R.drawable.card_17_17, 17));
		
		cards_hard.add(new Picture(R.drawable.card_18, 18));
		cards_hard.add(new Picture(R.drawable.card_18_18, 18));
		
		cards_hard.add(new Picture(R.drawable.card_19, 19));
		cards_hard.add(new Picture(R.drawable.card_19_19, 19));

		cards_hard.add(new Picture(R.drawable.card_20, 20));
		cards_hard.add(new Picture(R.drawable.card_20_20, 20));
		
		cards_hard.add(new Picture(R.drawable.card_21, 21));
		cards_hard.add(new Picture(R.drawable.card_21_21, 21));
		
		cards_hard.add(new Picture(R.drawable.card_22, 22));
		cards_hard.add(new Picture(R.drawable.card_22_22, 22));
		
		cards_hard.add(new Picture(R.drawable.card_23, 23));
		cards_hard.add(new Picture(R.drawable.card_23_23, 23));
		
		cards_hard.add(new Picture(R.drawable.card_24, 24));
		cards_hard.add(new Picture(R.drawable.card_24_24, 24));
		
		cards_hard.add(new Picture(R.drawable.card_25, 25));
		cards_hard.add(new Picture(R.drawable.card_25_25, 25));

		cards_hard.add(new Picture(R.drawable.card_26, 26));
		cards_hard.add(new Picture(R.drawable.card_26_26, 26));
		
		cards_hard.add(new Picture(R.drawable.card_27, 27));
		cards_hard.add(new Picture(R.drawable.card_27_27, 27));
		
		cards_hard.add(new Picture(R.drawable.card_28, 28));
		cards_hard.add(new Picture(R.drawable.card_28_28, 28));
		
		cards_hard.add(new Picture(R.drawable.card_29, 29));
		cards_hard.add(new Picture(R.drawable.card_29_29, 29));
		
		cards_hard.add(new Picture(R.drawable.card_30, 30));
		cards_hard.add(new Picture(R.drawable.card_30_30, 30));
		
		cards_hard.add(new Picture(R.drawable.card_31, 31));
		cards_hard.add(new Picture(R.drawable.card_31_31, 31));
		
		cards_hard.add(new Picture(R.drawable.card_32, 32));
		cards_hard.add(new Picture(R.drawable.card_32_32, 32));
		
		cards_hard.add(new Picture(R.drawable.card_33, 33));
		cards_hard.add(new Picture(R.drawable.card_33_33, 33));
		
		cards_hard.add(new Picture(R.drawable.card_34, 34));
		cards_hard.add(new Picture(R.drawable.card_34_34, 34));
		
		cards_hard.add(new Picture(R.drawable.card_35, 35));
		cards_hard.add(new Picture(R.drawable.card_35_35, 35));
		
		cards_hard.add(new Picture(R.drawable.card_36, 36));
		cards_hard.add(new Picture(R.drawable.card_36_36, 36));
		
		cards_hard.add(new Picture(R.drawable.card_37, 37));
		cards_hard.add(new Picture(R.drawable.card_37_37, 37));

		cards_hard.add(new Picture(R.drawable.card_38, 38));
		cards_hard.add(new Picture(R.drawable.card_38_38, 38));
		
		cards_hard.add(new Picture(R.drawable.card_39, 39));
		cards_hard.add(new Picture(R.drawable.card_39_39, 39));
		
		cards_hard.add(new Picture(R.drawable.card_40, 40));
		cards_hard.add(new Picture(R.drawable.card_40_40, 40));
		
	}
	
	public ArrayList<Picture> getMycards(String choice){
		
		//VŠlj random 12 bilder och returneras
		ArrayList<Picture> shuffledCards = new ArrayList<Picture>();
		
		if(choice.equals("simple")){
			
			Collections.shuffle(cards_simple);

			for (int i=0;i<12; i++){
				shuffledCards.add(cards_simple.get(i));
			}

			
		}else if(choice.equals("medium")){
			
			Collections.shuffle(cards_medium);
			
			for (int i=0;i<12; i++){
				shuffledCards.add(cards_medium.get(i));
			}
			
		}else if(choice.equals("hard")){
			
			Collections.shuffle(cards_hard);
			
			for (int i=0;i<12; i++){
				shuffledCards.add(cards_hard.get(i));
			}
			
		}

		return shuffledCards;
		
	}
	

}


