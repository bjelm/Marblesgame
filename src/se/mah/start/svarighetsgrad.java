package se.mah.start;



import se.mah.marbles.MainActivity;
import se.mah.marbles.R;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class svarighetsgrad extends Activity {
	

	private String Nysvarighet = "simple" ;
	private int selectedID;
	RadioGroup rg;
    private ImageView flameView;
    private AnimationDrawable flame2;
	
	final OnCheckedChangeListener lyssnare = new OnCheckedChangeListener() {
		
		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			// TODO Auto-generated method stub
			if (checkedId == R.id.easy) {
		         Nysvarighet = "simple";
			 }
			 if (checkedId == R.id.medium) {
		         Nysvarighet = "medium";
			 }
			 if (checkedId == R.id.hard) {
		         Nysvarighet = "hard";
			 }
			 
			 Log.i("testa svårighet", Nysvarighet);
		}
	};
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.svarighet);

		rg = (RadioGroup) findViewById(R.id.svarighet);
		rg.setOnCheckedChangeListener(lyssnare);
		
	    flameView = (ImageView)findViewById(R.id.img1);
		flameView.setImageBitmap(null);
		flameView.setBackgroundResource( R.drawable.bigflameanim);
		flame2= (AnimationDrawable) flameView.getBackground();
		flame2.start();
		

		
		
	}

		
		
		public void play (View v){
			Intent i = new Intent(this, MainActivity.class);
			i.putExtra("svar", Nysvarighet);
			startActivity(i);
			finish();
		
		}
    
}
