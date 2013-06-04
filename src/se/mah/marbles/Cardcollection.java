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
		
		cards_simple.add(new Picture(R.drawable.card_1, 1,1));
		cards_simple.add(new Picture(R.drawable.card_1_1, 1,2));
		
		cards_simple.add(new Picture(R.drawable.card_2, 2,1));
		cards_simple.add(new Picture(R.drawable.card_2_2, 2,2));
		
		cards_simple.add(new Picture(R.drawable.card_3, 3,1));
		cards_simple.add(new Picture(R.drawable.card_3_3, 3,2));
		
		cards_simple.add(new Picture(R.drawable.card_4, 4,1));
		cards_simple.add(new Picture(R.drawable.card_4_4, 4,2));
		
		cards_simple.add(new Picture(R.drawable.card_5, 5,1));
		cards_simple.add(new Picture(R.drawable.card_5_5, 5,2));
		
		cards_simple.add(new Picture(R.drawable.card_6, 6,1));
		cards_simple.add(new Picture(R.drawable.card_6_6, 6,2));
		
		cards_simple.add(new Picture(R.drawable.card_7, 7,1));
		cards_simple.add(new Picture(R.drawable.card_7_7, 7,2));
		
		cards_simple.add(new Picture(R.drawable.card_8, 8,1));
		cards_simple.add(new Picture(R.drawable.card_8_8, 8,2));
		
		cards_simple.add(new Picture(R.drawable.card_9, 9,1));
		cards_simple.add(new Picture(R.drawable.card_9_9, 9,2));
		
		cards_simple.add(new Picture(R.drawable.card_10, 10,1));
		cards_simple.add(new Picture(R.drawable.card_10_10, 10,2));
		
		//
		
		cards_simple.add(new Picture(R.drawable.card_1, 1,1));
		cards_simple.add(new Picture(R.drawable.card_1_1, 1,2));
		
		cards_simple.add(new Picture(R.drawable.card_2, 2,1));
		cards_simple.add(new Picture(R.drawable.card_2_2, 2,2));
		
		cards_simple.add(new Picture(R.drawable.card_3, 3,1));
		cards_simple.add(new Picture(R.drawable.card_3_3, 3,2));
		
		cards_simple.add(new Picture(R.drawable.card_4, 4,1));
		cards_simple.add(new Picture(R.drawable.card_4_4, 4,2));
		
		cards_simple.add(new Picture(R.drawable.card_5, 5,1));
		cards_simple.add(new Picture(R.drawable.card_5_5, 5,2));
		
		cards_simple.add(new Picture(R.drawable.card_6, 6,1));
		cards_simple.add(new Picture(R.drawable.card_6_6, 6,2));
		
		cards_simple.add(new Picture(R.drawable.card_7, 7,1));
		cards_simple.add(new Picture(R.drawable.card_7_7, 7,2));
		
		cards_simple.add(new Picture(R.drawable.card_8, 8,1));
		cards_simple.add(new Picture(R.drawable.card_8_8, 8,2));
		
		cards_simple.add(new Picture(R.drawable.card_9, 9,1));
		cards_simple.add(new Picture(R.drawable.card_9_9, 9,2));
		
		cards_simple.add(new Picture(R.drawable.card_10, 10,1));
		cards_simple.add(new Picture(R.drawable.card_10_10, 10,2));
		
		//
		
		cards_simple.add(new Picture(R.drawable.card_11, 11,1));
		cards_simple.add(new Picture(R.drawable.card_11_11, 11,2));
		
		cards_simple.add(new Picture(R.drawable.card_12, 12,1));
		cards_simple.add(new Picture(R.drawable.card_12_12, 12,2));
		
		cards_simple.add(new Picture(R.drawable.card_13, 13,1));
		cards_simple.add(new Picture(R.drawable.card_13_13, 13,2));
		
		cards_simple.add(new Picture(R.drawable.card_14, 14,1));
		cards_simple.add(new Picture(R.drawable.card_14_14, 14,2));
		
		cards_simple.add(new Picture(R.drawable.card_15, 15,1));
		cards_simple.add(new Picture(R.drawable.card_15_15, 15,2));

		cards_simple.add(new Picture(R.drawable.card_16, 16,1));
		cards_simple.add(new Picture(R.drawable.card_16_16, 16,2));
		
		cards_simple.add(new Picture(R.drawable.card_17, 17,1));
		cards_simple.add(new Picture(R.drawable.card_17_17, 17,2));
		
		cards_simple.add(new Picture(R.drawable.card_18, 18,1));
		cards_simple.add(new Picture(R.drawable.card_18_18, 18,2));
		
		cards_simple.add(new Picture(R.drawable.card_19, 19,1));
		cards_simple.add(new Picture(R.drawable.card_19_19, 19,2));

		cards_simple.add(new Picture(R.drawable.card_20, 20,1));
		cards_simple.add(new Picture(R.drawable.card_20_20, 20,2));
		
		//
		cards_simple.add(new Picture(R.drawable.card_11, 11,1));
		cards_simple.add(new Picture(R.drawable.card_11_11, 11,2));
		
		cards_simple.add(new Picture(R.drawable.card_12, 12,1));
		cards_simple.add(new Picture(R.drawable.card_12_12, 12,2));
		
		cards_simple.add(new Picture(R.drawable.card_13, 13,1));
		cards_simple.add(new Picture(R.drawable.card_13_13, 13,2));
		
		cards_simple.add(new Picture(R.drawable.card_14, 14,1));
		cards_simple.add(new Picture(R.drawable.card_14_14, 14,2));
		
		cards_simple.add(new Picture(R.drawable.card_15, 15,1));
		cards_simple.add(new Picture(R.drawable.card_15_15, 15,2));

		cards_simple.add(new Picture(R.drawable.card_16, 16,1));
		cards_simple.add(new Picture(R.drawable.card_16_16, 16,2));
		
		cards_simple.add(new Picture(R.drawable.card_17, 17,1));
		cards_simple.add(new Picture(R.drawable.card_17_17, 17,2));
		
		cards_simple.add(new Picture(R.drawable.card_18, 18,1));
		cards_simple.add(new Picture(R.drawable.card_18_18, 18,2));
		
		cards_simple.add(new Picture(R.drawable.card_19, 19,1));
		cards_simple.add(new Picture(R.drawable.card_19_19, 19,2));

		cards_simple.add(new Picture(R.drawable.card_20, 20,1));
		cards_simple.add(new Picture(R.drawable.card_20_20, 20,2));	
		
		
		//Medium collection
		cards_medium= new ArrayList<Picture>();
		
		cards_medium.add(new Picture(R.drawable.card_1, 1,1));
		cards_medium.add(new Picture(R.drawable.card_1_1, 1,2));
		
		cards_medium.add(new Picture(R.drawable.card_2, 2,1));
		cards_medium.add(new Picture(R.drawable.card_2_2, 2,1));
		
		cards_medium.add(new Picture(R.drawable.card_3, 3,1));
		cards_medium.add(new Picture(R.drawable.card_3_3, 3,2));
		
		cards_medium.add(new Picture(R.drawable.card_4, 4,1));
		cards_medium.add(new Picture(R.drawable.card_4_4, 4,2));
		
		cards_medium.add(new Picture(R.drawable.card_5, 5,1));
		cards_medium.add(new Picture(R.drawable.card_5_5, 5,2));
		
		cards_medium.add(new Picture(R.drawable.card_6, 6,1));
		cards_medium.add(new Picture(R.drawable.card_6_6, 6,2));
		
		cards_medium.add(new Picture(R.drawable.card_7, 7,1));
		cards_medium.add(new Picture(R.drawable.card_7_7, 7,2));
		
		cards_medium.add(new Picture(R.drawable.card_8, 8,1));
		cards_medium.add(new Picture(R.drawable.card_8_8, 8,2));
		
		cards_medium.add(new Picture(R.drawable.card_9, 9,1));
		cards_medium.add(new Picture(R.drawable.card_9_9, 9,2));
		
		cards_medium.add(new Picture(R.drawable.card_10, 10,1));
		cards_medium.add(new Picture(R.drawable.card_10_10, 10,2));
		
		cards_medium.add(new Picture(R.drawable.card_11, 11,1));
		cards_medium.add(new Picture(R.drawable.card_11_11, 11,2));
		
		cards_medium.add(new Picture(R.drawable.card_12, 12,1));
		cards_medium.add(new Picture(R.drawable.card_12_12, 12,2));
		
		cards_medium.add(new Picture(R.drawable.card_13, 13,1));
		cards_medium.add(new Picture(R.drawable.card_13_13, 13,2));
		
		cards_medium.add(new Picture(R.drawable.card_14, 14,1));
		cards_medium.add(new Picture(R.drawable.card_14_14, 14,2));
		
		cards_medium.add(new Picture(R.drawable.card_15, 15,1));
		cards_medium.add(new Picture(R.drawable.card_15_15, 15,2));

		cards_medium.add(new Picture(R.drawable.card_16, 16,1));
		cards_medium.add(new Picture(R.drawable.card_16_16, 16,2));
		
		cards_medium.add(new Picture(R.drawable.card_17, 17,1));
		cards_medium.add(new Picture(R.drawable.card_17_17, 17,2));
		
		cards_medium.add(new Picture(R.drawable.card_18, 18,1));
		cards_medium.add(new Picture(R.drawable.card_18_18, 18,2));
		
		cards_medium.add(new Picture(R.drawable.card_19, 19,1));
		cards_medium.add(new Picture(R.drawable.card_19_19, 19,2));
		
		cards_medium.add(new Picture(R.drawable.card_20, 20,1));
		cards_medium.add(new Picture(R.drawable.card_20_20, 20,2));
		

		cards_medium.add(new Picture(R.drawable.card_31, 31,1));
		cards_medium.add(new Picture(R.drawable.card_31_31, 31,2));
		
		cards_medium.add(new Picture(R.drawable.card_32, 32,1));
		cards_medium.add(new Picture(R.drawable.card_32_32, 32,2));
		
		cards_medium.add(new Picture(R.drawable.card_33, 33,1));
		cards_medium.add(new Picture(R.drawable.card_33_33, 33,2));
		
		cards_medium.add(new Picture(R.drawable.card_34, 34,1));
		cards_medium.add(new Picture(R.drawable.card_34_34, 34,2));
		
		cards_medium.add(new Picture(R.drawable.card_35, 35,1));
		cards_medium.add(new Picture(R.drawable.card_35_35, 35,2));
		
		cards_medium.add(new Picture(R.drawable.card_36, 17,2));
		cards_medium.add(new Picture(R.drawable.card_36_36, 17,1));
		
		cards_medium.add(new Picture(R.drawable.card_37, 37,1));
		cards_medium.add(new Picture(R.drawable.card_37_37, 37,2));

		cards_medium.add(new Picture(R.drawable.card_38, 38,1));
		cards_medium.add(new Picture(R.drawable.card_38_38, 38,2));
		
		cards_medium.add(new Picture(R.drawable.card_39, 39,1));
		cards_medium.add(new Picture(R.drawable.card_39_39, 39,2));
		
		cards_medium.add(new Picture(R.drawable.card_40, 40,1));
		cards_medium.add(new Picture(R.drawable.card_40_40, 40,2));	


		cards_medium.add(new Picture(R.drawable.card_31, 31,1));
		cards_medium.add(new Picture(R.drawable.card_31_31, 31,2));
		
		cards_medium.add(new Picture(R.drawable.card_32, 32,1));
		cards_medium.add(new Picture(R.drawable.card_32_32, 32,2));
		
		cards_medium.add(new Picture(R.drawable.card_33, 33,1));
		cards_medium.add(new Picture(R.drawable.card_33_33, 33,2));
		
		cards_medium.add(new Picture(R.drawable.card_34, 34,1));
		cards_medium.add(new Picture(R.drawable.card_34_34, 34,2));
		
		cards_medium.add(new Picture(R.drawable.card_35, 35,1));
		cards_medium.add(new Picture(R.drawable.card_35_35, 35,2));
		
		cards_medium.add(new Picture(R.drawable.card_36, 17,2));
		cards_medium.add(new Picture(R.drawable.card_36_36, 17,1));
		
		cards_medium.add(new Picture(R.drawable.card_37, 37,1));
		cards_medium.add(new Picture(R.drawable.card_37_37, 37,2));

		cards_medium.add(new Picture(R.drawable.card_38, 38,1));
		cards_medium.add(new Picture(R.drawable.card_38_38, 38,2));
		
		cards_medium.add(new Picture(R.drawable.card_39, 39,1));
		cards_medium.add(new Picture(R.drawable.card_39_39, 39,2));
		
		cards_medium.add(new Picture(R.drawable.card_40, 40,1));
		cards_medium.add(new Picture(R.drawable.card_40_40, 40,2));	

	

		
		//Difficult collection
		cards_hard= new ArrayList<Picture>();
		
		cards_hard.add(new Picture(R.drawable.card_1, 1,1));
		cards_hard.add(new Picture(R.drawable.card_1_1, 1,2));
		
		cards_hard.add(new Picture(R.drawable.card_2, 2,1));
		cards_hard.add(new Picture(R.drawable.card_2_2, 2,1));
		
		cards_hard.add(new Picture(R.drawable.card_3, 3,1));
		cards_hard.add(new Picture(R.drawable.card_3_3, 3,2));
		
		cards_hard.add(new Picture(R.drawable.card_4, 4,1));
		cards_hard.add(new Picture(R.drawable.card_4_4, 4,2));
		
		cards_hard.add(new Picture(R.drawable.card_5, 5,1));
		cards_hard.add(new Picture(R.drawable.card_5_5, 5,2));
		
		cards_hard.add(new Picture(R.drawable.card_6, 6,1));
		cards_hard.add(new Picture(R.drawable.card_6_6, 6,2));
		
		cards_hard.add(new Picture(R.drawable.card_7, 7,1));
		cards_hard.add(new Picture(R.drawable.card_7_7, 7,2));
		
		cards_hard.add(new Picture(R.drawable.card_8, 8,1));
		cards_hard.add(new Picture(R.drawable.card_8_8, 8,2));
		
		cards_hard.add(new Picture(R.drawable.card_9, 9,1));
		cards_hard.add(new Picture(R.drawable.card_9_9, 9,2));
		
		cards_hard.add(new Picture(R.drawable.card_10, 10,1));
		cards_hard.add(new Picture(R.drawable.card_10_10, 10,2));
		
		cards_hard.add(new Picture(R.drawable.card_11, 11,1));
		cards_hard.add(new Picture(R.drawable.card_11_11, 11,2));
		
		cards_hard.add(new Picture(R.drawable.card_12, 12,1));
		cards_hard.add(new Picture(R.drawable.card_12_12, 12,2));
		
		cards_hard.add(new Picture(R.drawable.card_13, 13,1));
		cards_hard.add(new Picture(R.drawable.card_13_13, 13,2));
		
		cards_hard.add(new Picture(R.drawable.card_14, 14,1));
		cards_hard.add(new Picture(R.drawable.card_14_14, 14,2));
		
		cards_hard.add(new Picture(R.drawable.card_15, 15,1));
		cards_hard.add(new Picture(R.drawable.card_15_15, 15,2));

		cards_hard.add(new Picture(R.drawable.card_16, 16,1));
		cards_hard.add(new Picture(R.drawable.card_16_16, 16,2));
		
		cards_hard.add(new Picture(R.drawable.card_17, 17,1));
		cards_hard.add(new Picture(R.drawable.card_17_17, 17,2));
		
		cards_hard.add(new Picture(R.drawable.card_18, 18,1));
		cards_hard.add(new Picture(R.drawable.card_18_18, 18,2));
		
		cards_hard.add(new Picture(R.drawable.card_19, 19,1));
		cards_hard.add(new Picture(R.drawable.card_19_19, 19,2));
		
		cards_hard.add(new Picture(R.drawable.card_20, 20,1));
		cards_hard.add(new Picture(R.drawable.card_20_20, 20,2));
		
		cards_hard.add(new Picture(R.drawable.card_21, 21,1));
		cards_hard.add(new Picture(R.drawable.card_21_21, 21,2));
		
		cards_hard.add(new Picture(R.drawable.card_22, 22,1));
		cards_hard.add(new Picture(R.drawable.card_22_22, 22,2));
		
		cards_hard.add(new Picture(R.drawable.card_23, 23,1));
		cards_hard.add(new Picture(R.drawable.card_23_23, 23,2));
		
		cards_hard.add(new Picture(R.drawable.card_24, 24,1));
		cards_hard.add(new Picture(R.drawable.card_24_24, 24,2));
		
		cards_hard.add(new Picture(R.drawable.card_25, 25,1));
		cards_hard.add(new Picture(R.drawable.card_25_25, 25,2));

		cards_hard.add(new Picture(R.drawable.card_26, 26,1));
		cards_hard.add(new Picture(R.drawable.card_26_26, 26,2));
		
		cards_hard.add(new Picture(R.drawable.card_27, 27,1));
		cards_hard.add(new Picture(R.drawable.card_27_27, 27,2));
		
		cards_hard.add(new Picture(R.drawable.card_28, 28,1));
		cards_hard.add(new Picture(R.drawable.card_28_28, 28,2));
		
		cards_hard.add(new Picture(R.drawable.card_29, 29,1));
		cards_hard.add(new Picture(R.drawable.card_29_29, 29,2));
		
		cards_hard.add(new Picture(R.drawable.card_30, 30,1));
		cards_hard.add(new Picture(R.drawable.card_30_30, 30,2));
		

		cards_hard.add(new Picture(R.drawable.card_31, 31,1));
		cards_hard.add(new Picture(R.drawable.card_31_31, 31,2));
		
		cards_hard.add(new Picture(R.drawable.card_32, 32,1));
		cards_hard.add(new Picture(R.drawable.card_32_32, 32,2));
		
		cards_hard.add(new Picture(R.drawable.card_33, 33,1));
		cards_hard.add(new Picture(R.drawable.card_33_33, 33,2));
		
		cards_hard.add(new Picture(R.drawable.card_34, 34,1));
		cards_hard.add(new Picture(R.drawable.card_34_34, 34,2));
		
		cards_hard.add(new Picture(R.drawable.card_35, 35,1));
		cards_hard.add(new Picture(R.drawable.card_35_35, 35,2));
		
		cards_hard.add(new Picture(R.drawable.card_36, 17,2));
		cards_hard.add(new Picture(R.drawable.card_36_36, 17,1));
		
		cards_hard.add(new Picture(R.drawable.card_37, 37,1));
		cards_hard.add(new Picture(R.drawable.card_37_37, 37,2));

		cards_hard.add(new Picture(R.drawable.card_38, 38,1));
		cards_hard.add(new Picture(R.drawable.card_38_38, 38,2));
		
		cards_hard.add(new Picture(R.drawable.card_39, 39,1));
		cards_hard.add(new Picture(R.drawable.card_39_39, 39,2));
		
		cards_hard.add(new Picture(R.drawable.card_40, 40,1));
		cards_hard.add(new Picture(R.drawable.card_40_40, 40,2));	

	
		
	}
	
	public ArrayList<Picture> getMycards(String choice){
		
		//V�lj random 12 bilder och returneras
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


