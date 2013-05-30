package se.mah.highscore;


import java.util.ArrayList;
import java.util.Collections;

import se.mah.marbles.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HighScore extends Activity{
	private TextView T1, T2, T3, T4, T5, T6, T7, T8, T9, T10,P1,P2,P3,P4,P5,P6,P7,P8,P9,P10, sorry;
	private Button submit;
	private EditText scoreinput;
	//private ArrayList<Person> scoreList;
	private int mPoints;
    Boolean checkIfStarted = false;
    
    //Skapa highscore av klassen HighScoreScores 
    HighScoreScores highscore;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.highscore_main);		
		
		highscore = new HighScoreScores(HighScore.this); //"this" is the Context


		T1= (TextView) findViewById(R.id.firstTxt);
		T2= (TextView) findViewById(R.id.secondTxt);
		T3= (TextView) findViewById(R.id.thirdTxt);
		T4= (TextView) findViewById(R.id.fourthTxt);
		T5= (TextView) findViewById(R.id.fifthTxt);
		T6= (TextView) findViewById(R.id.sixthTxt);
		T7= (TextView) findViewById(R.id.seventhTxt);
		T8= (TextView) findViewById(R.id.eighthTxt);
		T9= (TextView) findViewById(R.id.ninthTxt);
		T10= (TextView) findViewById(R.id.tenthTxt);
		
		P1=(TextView) findViewById(R.id.firstPts);
		P2=(TextView) findViewById(R.id.secondPts);
		P3=(TextView) findViewById(R.id.thirdPts);
		P4=(TextView) findViewById(R.id.fourthPts);
		P5=(TextView) findViewById(R.id.fifthPts);
		P6=(TextView) findViewById(R.id.sixthPts);
		P7=(TextView) findViewById(R.id.seventhPts);
		P8=(TextView) findViewById(R.id.eighthPts);
		P9=(TextView) findViewById(R.id.ninthPts);
		P10=(TextView) findViewById(R.id.tenthPts);
		
		scoreinput= (EditText) findViewById(R.id.namn);
		submit= (Button) findViewById(R.id.restart);

		
        mPoints = getIntent().getExtras().getInt("score");

        
		checkIfStarted = getIntent().getExtras().getBoolean("sorry");

		Log.i("HIGHSCOREscoreonCreate", "score "+mPoints);
		updateScoreList();
		
        if (checkIfStarted == false){
        
	        if (highscore.inHighscore(mPoints)){

	        	Log.i("HIGHSCORE", "Kör detta intent "+mPoints);

	        	Intent j = new Intent(this, NameInput.class);
	        	j.putExtra("points", mPoints);
	        	startActivityForResult(j, 0); 
				
	        }else{
	    		Log.i("HIGHSCOREscore", "score "+mPoints);
				Intent j = new Intent(this, Sorry.class);
				startActivity(j);
				
			}
	        
        }
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
			// TODO Auto-generated method stub
		
		String s = data.getExtras().getString("name");
		
		Log.i("HIGHSCOREnamn", "namn "+s);
		Log.i("HIGHSCOREscore", "score "+mPoints);
		
	    if (highscore.addScore(s,mPoints)){
	    	
	    	Log.i("HIGHSCOREexists", "nya points "+mPoints);
	    	Log.i("HIGHSCOREnamn", "namn "+s);

	    }else{
	    	Log.i("HIGHSCORE", "finns "+mPoints);
	    	Log.i("HIGHSCOREnamn", "namn "+s);
	    
	    }
	 
	    updateScoreList();
	}
		
	
	//Uppdaterar listan och skriver ut namnen på de som "platsar"
		public void updateScoreList(){
		
		Log.i("HIGHSCOREupdate", "uppdaterar highscore, finns 1000 i highscore: "+highscore.inHighscore(1000));
		
		T1.setText("1. "+ highscore.getName(0));
		T2.setText("2. "+ highscore.getName(1));
		T3.setText("3. "+ highscore.getName(2));
		T4.setText("4. "+ highscore.getName(3));
		T5.setText("5. "+ highscore.getName(4));
		T6.setText("6. "+ highscore.getName(5));
		T7.setText("7. "+ highscore.getName(6));
		T8.setText("8. "+ highscore.getName(7));
		T9.setText("9. "+ highscore.getName(8));
		T10.setText("10. "+highscore.getName(9));
		
		P1.setText("Poäng: "+highscore.getScore(0));
		P2.setText("Poäng: "+highscore.getScore(1));
		P3.setText("Poäng: "+highscore.getScore(2));
		P4.setText("Poäng: "+highscore.getScore(3));
		P5.setText("Poäng: "+highscore.getScore(4));
		P6.setText("Poäng: "+highscore.getScore(5));
		P7.setText("Poäng: "+highscore.getScore(6));
		P8.setText("Poäng: "+highscore.getScore(7));
		P9.setText("Poäng: "+highscore.getScore(8));
		P10.setText("Poäng: "+highscore.getScore(9));

		}

 }
