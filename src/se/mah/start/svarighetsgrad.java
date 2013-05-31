package se.mah.start;



import se.mah.marbles.MainActivity;
import se.mah.marbles.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class svarighetsgrad extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.svarighet);}
		private String svarighet ;
		
		public void onRadioButtonClicked(View view) {
	    // Is the button now checked?
	    boolean checked = ((RadioButton) view).isChecked();
	    
	    // Check which radio button was clicked
	    switch(view.getId()) {
	        case R.id.easy:
	            if (checked)
	                svarighet = "easy";
	            break;
	        case R.id.medium:
	            if (checked)
	            	svarighet = "medium";
	            break;
	        case R.id.hard:
	            if (checked)
	            	svarighet = "hard";
	            break;
	    }
	
	    
	   // RadioGroup rg = (RadioGroup) findViewById(R.id.svarighet);
	    //int svarighet = rg.getCheckedRadioButtonId();
	    //Intent intent = new Intent(this,spela.class);
	    //intent.putExtra("svarighet",svarighet);	    
	    
/*
		ImageButton starta = (ImageButton) findViewById(R.id.starta);
		starta.setOnClickListener(new View.OnClickListener() {			
			@Override
            public void onClick(View v) {
				
		
				Intent j = new Intent(this, MainActivity.class);
                  //Intent i= new Intent(this, MainActivity.class);
                  j.putExtra("svar", svarighet);
                  startActivity(j);
                  finish();
            }
			});
		};
		*/
		}
		
		
		public void play (View v){
			Intent i = new Intent(this, MainActivity.class);
			i.putExtra("svar", svarighet);
			startActivity(i);
			finish();
		
		}
    
}
		/*	@Override
			public void onClick(View v) {
				startActivity(new Intent("com.example.miccheck.SPELA"));
			}
		});
}*/

