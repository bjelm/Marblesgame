package se.mah.highscore;




import se.mah.marbles.MainActivity;
import se.mah.marbles.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.TextView;

public class Sorry extends Activity {
	//private ImageButton Restart;

	private TextView Sorry;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sorry);	
		
		
		Sorry = (TextView) findViewById(R.id.firstTxt);
		
		//String s2= getIntent().getExtras().getString("Sorry");
		Sorry.setText("Tyvärr, du fick inte tillräckligt med poäng för topplistan! \n Din poäng: " + "blabla");
		
}
	public void start (View v){
		Intent i = new Intent(this, HighScore.class);
		i.putExtra("sorry", true);
		startActivity(i);
		finish();
	
	}
}