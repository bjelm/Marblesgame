package se.mah.start;




import se.mah.highscore.HighScore;
import se.mah.marbles.MainActivity;
import se.mah.marbles.R;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Start extends Activity {
	MediaPlayer bamboosound;
	
	private AnimationDrawable flame2;
	private ImageView flameView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.starta_main);
		
//		flameView = (ImageView)findViewById(R.id.imageView1);
//		flameView.setImageBitmap(null);
//		flameView.setBackgroundResource( R.drawable.bigflameanim);
//		flame2= (AnimationDrawable) flameView.getBackground();
//		flame2.start();
		
		bamboosound = MediaPlayer.create(Start.this, R.raw.bamboo);
		bamboosound.setLooping(true);
		bamboosound.start();

		
		final ImageButton mute2 = (ImageButton)findViewById(R.id.mute);

		
		mute2.setOnClickListener(new OnClickListener() {
			boolean flag=false;
			public void onClick(View v) {
		    if (!flag ) {
		        mute2.setBackgroundResource(R.drawable.soundoff);
		        flag=true; 
		        
		    }else{
		          mute2.setBackgroundResource(R.drawable.soundon);
		          flag=false;
		    }
		    if(v == findViewById(R.id.mute)){
				if(bamboosound.isPlaying()){
					bamboosound.pause();
				}else{
					bamboosound.start();
				}	    
			}
		}	
		});
				
		
	
	
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	/*protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	
	@Override
	public void onPause() {
	    super.onPause();
	    bamboosound.pause();
	}
*/
	protected void onDestroy() {
	    super.onDestroy();
	    if(bamboosound != null) {
	        bamboosound.stop();  
	        bamboosound.release();
	    }
	}
	
	public void valjsvarighet (View v){
		Intent i = new Intent(this, svarighetsgrad.class);
		startActivity(i);
		//finish();
	
	}
	public void spelaInst (View v){
		Intent i2 = new Intent(this, Instruktions.class);
		startActivity(i2);
		
	}
	
}

