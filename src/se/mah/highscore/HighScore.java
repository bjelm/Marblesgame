package se.mah.highscore;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

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

public class HighScore extends Activity{
	private TextView T1, T2, T3, T4, T5, T6, T7, T8, T9, T10,P1,P2,P3,P4,P5,P6,P7,P8,P9,P10, sorry;
	private Button submit;
	private EditText scoreinput;
	private ArrayList<Person> scoreList;


	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.highscore_main);		
		 scoreList = new ArrayList<Person>();// Skapa listan samt stoppa in lite folk
		 scoreList.add(new Person("Peter","Pan"));
		 scoreList.add(new Person("Peter","Pin"));
		 scoreList.add(new Person("Per","Gurka"));
		 scoreList.add(new Person("Per","Skal"));
		 scoreList.add(new Person("Per","oP�l"));
		 scoreList.add(new Person("Per","L�rka"));
		 scoreList.add(new Person("Pelle","Er�vrare"));
		 scoreList.add(new Person("Perla","Po"));
		 scoreList.add(new Person("Kalle", "Av"));
		 scoreList.add(new Person("Perka", "Lerka"));
		
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
		updateScoreList();	//Uppdatera visning.
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
		Log.i("filip", "hittar extras" + " "+ s );
		//Om man h�r vill l�gga till en ny post i listan s� h�r 
		Random r = new Random(); //K�r lite random s� det kan bli olika poster
		int score = r.nextInt(100); //Ger ett random mellan 1 o 100;
		if (score > scoreList.get(9).getPoints()){
		Person p = new Person(s, "A" +score);
		p.addPoints(score);
		scoreList.add(p);
		updateScoreList();
		}else{
			Intent j = new Intent(this, Sorry.class);
			startActivity(j);
		}
	}
		
	
	//Uppdaterar listan och skriver ut namnen p� de som "platsar"
	public void updateScoreList(){
		
		Collections.sort(scoreList);
		T1.setText("1. "+ scoreList.get(0).getFirstname());
		T2.setText("2. "+ scoreList.get(1).getFirstname());
		T3.setText("3. "+ scoreList.get(2).getFirstname());
		T4.setText("4. "+ scoreList.get(3).getFirstname());
		T5.setText("5. "+ scoreList.get(4).getFirstname());
		T6.setText("6. "+ scoreList.get(5).getFirstname());
		T7.setText("7. "+ scoreList.get(6).getFirstname());
		T8.setText("8. "+ scoreList.get(7).getFirstname());
		T9.setText("9. "+ scoreList.get(8).getFirstname());
		T10.setText("10. "+scoreList.get(9).getFirstname());
		
		P1.setText("Po�ng: "+scoreList.get(0).getPoints());
		P2.setText("Po�ng: "+scoreList.get(1).getPoints());
		P3.setText("Po�ng: "+scoreList.get(2).getPoints());
		P4.setText("Po�ng: "+scoreList.get(3).getPoints());
		P5.setText("Po�ng: "+scoreList.get(4).getPoints());
		P6.setText("Po�ng: "+scoreList.get(5).getPoints());
		P7.setText("Po�ng: "+scoreList.get(6).getPoints());
		P8.setText("Po�ng: "+scoreList.get(7).getPoints());
		P9.setText("Po�ng: "+scoreList.get(8).getPoints());
		P10.setText("Po�ng: "+scoreList.get(9).getPoints());
	
				
				
		
	
		}
    //denna ska bytas ut och s�ttas i if satsen som s�ger if score>= scoreList.get(9).getPoints(); fast utan onClick
	public void onClick(View v){
		Intent i = new Intent(this, NameInput.class);
		startActivityForResult(i, 0); //Det var fel metod denna g�r att vi v�ntar p� svar
	
	}

 }
