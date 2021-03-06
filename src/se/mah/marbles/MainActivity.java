package se.mah.marbles;

import java.util.ArrayList;

import java.util.Random;






import se.mah.highscore.HighScore;
import se.mah.highscore.NameInput;



import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Checkable;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;


public class MainActivity extends Activity {


	private Animation anim;
	private Animation anim_nopar;
	private Animation anim_score;
	private Animation anim_shuffle;
	private GridView gridView;
	private ImageAdapter myImageAdapter;	
	private CheckableImageView cv;
	private CheckableImageView cv_first;
	private static int numOfChecks;
	private int i=0;
	private int firstClick,secondClick;
	private boolean mChecked;
    private TextView scoreTxt ;
    private TextView scoreTxt2;
	private Cardcollection myCards = new Cardcollection();
	private Game myGame;
	private String newLevel;
	
	private boolean shuffleTest=false;
	
	private AnimationDrawable  boomAnim;
	private AnimationDrawable  glitterAnim;
	// Saker till tidsr�kningen
	ProgressBar mProgressBar;
	CountDownTimer mCountDownTimer;
	
	
	 int tidsint = 60;
	 int time= 60000;
	 int sec = 1000;
	 
	 
	 long tidms;
	 private MyTimer myTimer;
	//
	
    private ArrayList<Picture> randomList;
   
    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		getWindow().addFlags(LayoutParams.FLAG_KEEP_SCREEN_ON);
		
		setContentView(R.layout.activity_main);
		
	
		//till tiden
		myTimer = new MyTimer(50000, 1000);
		myTimer.start();
		myTimer.cancel();
		mProgressBar=(ProgressBar)findViewById(R.id.progressbar);
		
		mProgressBar.setProgress(0);
		myTimer = new MyTimer(time, sec);
		myTimer.start();
		/////
		
		
		newLevel = getIntent().getExtras().getString("svar");
		if (newLevel == null) {
			newLevel = getIntent().getExtras().getString("level");
		}
		
		myGame	= new Game(newLevel);
		 randomList = new ArrayList<Picture>(myCards.getMycards(myGame.getLevel()));
		
		
		
		
		
		
		
		
		
		
        ImageView flame = (ImageView)findViewById(R.id.imageanim);
		flame.setImageBitmap(null);
		flame.setBackgroundResource( R.drawable.flameanim);
		AnimationDrawable flameAnim = (AnimationDrawable) flame.getBackground();
		
		flameAnim.start();
		
		ImageView boom = (ImageView)findViewById(R.id.imageanim2);
		boom.setImageBitmap(null);
		boom.setBackgroundResource( R.drawable.boomanim);
		boomAnim = (AnimationDrawable) boom.getBackground();


		ImageView glitter = (ImageView)findViewById(R.id.imageanim3);
		glitter.setImageBitmap(null);
		glitter.setBackgroundResource( R.drawable.glitteranim);
		glitterAnim = (AnimationDrawable) glitter.getBackground();
		
		
		/////
		scoreTxt = (TextView) findViewById(R.id.scoreview);
		scoreTxt2 = (TextView) findViewById(R.id.scoreview2);
		
		anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.myanim);
		anim_nopar = AnimationUtils.loadAnimation(MainActivity.this, R.anim.noparanim);
		anim_score = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scoreanim);
		
		anim_shuffle=AnimationUtils.loadAnimation(this,R.anim.rotateanim);
		
		Effects.getInstance().init(this);
		gridView = (GridView) findViewById(R.id.gridview);
		myImageAdapter=new ImageAdapter(this);
		
		
		
		myImageAdapter.notifyDataSetChanged();
		gridView.setAdapter(myImageAdapter);
		gridView.invalidateViews();
		scoreTxt.setText("Score:");
		scoreTxt2.setText(""+myGame.getScore());
	
		
		gridView.setOnItemClickListener(new OnItemClickListener() {
			 
			boolean clicked=false;
			@Override
			public void onItemClick(AdapterView parent, View v, int position,long id) {
				
				scoreTxt.setText("Score:");
				scoreTxt2.setText(""+myGame.getScore());
			
				
				
				  cv = (CheckableImageView) v;
				  cv.toggle();
				if (!clicked){
				cv_first = (CheckableImageView) v;
				
				clicked=true;
				}
				
				
				Effects.getInstance().playSound(Effects.SOUND_1);
				
				
				 
				  
//				  cv.toggle();
			      
		          i++;
			      if (i%2 !=0){
			    	  
			    	  firstClick=position;
			    	
			      }else{
			    	  
			    	  secondClick=position;
			    	
			    	 if (firstClick == secondClick){
			    		 cv.startAnimation(anim_nopar);
				    	 cv_first.startAnimation(anim_nopar);
				    	 RemoveTime(5000);
				    	 Effects.getInstance().playSound(Effects.SOUND_6);
				    	 
			    	 }
			    	 
			    	 else if ((randomList.get(firstClick).returnCategory() == randomList.get(secondClick).returnCategory()) &&
			    			 (randomList.get(firstClick).returnCategoryTwo() != randomList.get(secondClick).returnCategoryTwo())){
			    		 
				         randomList.set(firstClick, myCards.getMycards(myGame.getLevel()).get(randomInt()));
				    	 randomList.set(secondClick,myCards.getMycards(myGame.getLevel()).get(randomInt()));
				    	
				    	 cv.startAnimation(anim);
				    	 cv_first.startAnimation(anim);
				    	 
				    	Effects.getInstance().playSound(Effects.SOUND_9);
				    	boomAnim.stop();
				    	boomAnim.start();
				    	Effects.getInstance().playSound(Effects.SOUND_5);
				    	
				    	 
				    	
				    	 glitterAnim.stop();
						 glitterAnim.start();
				    	 myGame.addScore(1000);
				    	
				          scoreTxt.setText("Score:");
						  scoreTxt2.setText(""+myGame.getScore());
				    	  scoreTxt2.startAnimation(anim_score);
				    	 glitterAnim.stop();
						 glitterAnim.start();
						 if (tidsint < 60){
					    	 AddTime(10000);
							 }
			    	 }
			    	 
			    	 else if (randomList.get(firstClick).returnCategory() == randomList.get(secondClick).returnCategory()){			    	
				         randomList.set(firstClick, myCards.getMycards(myGame.getLevel()).get(randomInt()));
				    	 randomList.set(secondClick,myCards.getMycards(myGame.getLevel()).get(randomInt()));
				    	
				    	 cv.startAnimation(anim);
				    	 cv_first.startAnimation(anim);
				    	 
				    	 Effects.getInstance().playSound(Effects.SOUND_2);
				    	 glitterAnim.stop();
						    glitterAnim.start();
				    	 myGame.addScore(500);
				    	 
				    	 
				    	 scoreTxt.setText("Score:");
						 scoreTxt2.setText(""+myGame.getScore());
				    	 scoreTxt2.startAnimation(anim_score);
				    	 glitterAnim.stop();
						 glitterAnim.start();
						 
						 if (tidsint < 60){
				    	 AddTime(5000);
						 }
			    	 }
			    	 
			    	 else{
			    		scoreTxt2.startAnimation(anim_nopar);
			    		 RemoveTime(5000);
			    		 cv.startAnimation(anim_nopar);
			    		 cv_first.startAnimation(anim_nopar);
			    		 Effects.getInstance().playSound(Effects.SOUND_6);

			    	 }
			    	 ///teeeeeeeeeeeeeeeeest
			    
			    	 
			    	 shuffleTest=false;
			    	 mChecked=false;
			    	 clicked=false;
                 
			    	//   myImageAdapter.notifyDataSetChanged();
//			    		
//			    	 cv.setBackgroundResource(R.drawable.movie);
//				    AnimationDrawable megAnimation =(AnimationDrawable)cv.getBackground();
//					 megAnimation.start();
			    	
			    
			    
			    	 
				    	Handler myHandler = new Handler();
			    	 myHandler.postDelayed(myRunnable, 500);

			      }
			   
			}
		});

	}

    
    
	public void shuffleClick(View v) {
		


Effects.getInstance().playSound(Effects.SOUND_7);
	randomList.clear();
	randomList = myCards.getMycards(myGame.getLevel());
	//myImageAdapter.imageView.startAnimation(anim_shuffle);
	shuffleTest=true;
	myImageAdapter.notifyDataSetChanged();
	

	}
	
	public class ImageAdapter extends BaseAdapter {
		private Context context;
		CheckableImageView imageView;
		public ImageAdapter(Context c) {
			context = c;

		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			// return randomList.size();
			return 12;
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {

		
			
			if (convertView == null) {
				imageView = new CheckableImageView(context, null);
				imageView.setLayoutParams(new GridView.LayoutParams(170,181));
				//imageView.setLayoutParams(new GridView.LayoutParams(200,213));
				imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
				imageView.setPadding(10,10,10,10);
				

			} else {
				imageView = (CheckableImageView) convertView;
				

			}

			
			
		
			
			 imageView.setImageResource(randomList.get(position).getPicture());
			
		if(shuffleTest == true){
			 imageView.startAnimation(anim_shuffle);
			
		}
           
			return imageView;
		}
		

	}

	 

	public class CheckableImageView extends ImageView implements Checkable {
		
		
		//private boolean mChecked;

		public CheckableImageView(final Context context,
				final AttributeSet attrs) {
			super(context, attrs);
		}

	    @Override
		public void toggle() {
			setChecked(!mChecked);
			//Toast.makeText(getBaseContext(), "toggle  "+mChecked, Toast.LENGTH_SHORT).show();
						
		}

		@Override
		public boolean isChecked() {
			//Toast.makeText(getBaseContext(), "checked", Toast.LENGTH_SHORT).show();
			return mChecked;
		}

		@Override
		public void setChecked(final boolean checked) {
			
			
			if (mChecked == checked)
				return;
			mChecked = checked;
	        invalidate();
			
			if(checked==true){
			numOfChecks++;
			}
			else if(checked==false){
				numOfChecks--;
			}
			
			Log.i("checkcount",numOfChecks+"");
			
		}

		 @Override
		 protected void onDraw(Canvas canvas) {
			 super.onDraw(canvas);
			 if(mChecked) {
				 Bitmap check = BitmapFactory.decodeResource(getResources(), R.drawable.rep);
				 canvas.drawBitmap(check, 3,3, new Paint());
				 mChecked=false;
				 
				
			 
		}
	}
		 }
	
	public int randomInt(){
		Random r = new Random ();
		int i = r.nextInt(12-0);
		return i;
	}
	
	
	private Runnable myRunnable = new Runnable()
	{
	    @Override
	    public void run()
	    {
	    	 myImageAdapter.notifyDataSetChanged();
	    	//mChecked= false;
	    	//Change state here
	    }
	 };
	 

	 public void gameOver(){
	 
		 int p =  myGame.getScore();
		
         Intent i = new Intent(this,HighScore.class );
	     i.putExtra("score",p);	
	     i.putExtra("level",newLevel);
	     startActivity(i);
		 finish();
}
	 
	 
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		getActionBar().hide();
		return true;
	}
	
	
 // h�r till tiden
	public void AddTime(int newTime){
		myTimer.cancel();
		time = (int)tidms +newTime;
		myTimer = new MyTimer(time, sec);
		myTimer.start();
	}
	
	public void RemoveTime(int newTime){
		myTimer.cancel();
		time = (int)tidms -newTime;
		myTimer = new MyTimer(time, sec);
		myTimer.start();
	}
	
	// timer-klass
	private class MyTimer extends CountDownTimer {

	    public MyTimer(int millisInFuture, int countDownInterval) {
			super(millisInFuture, countDownInterval);
			// TODO Auto-generated constructor stub
		}

		@Override
	    public void onTick(long millisUntilFinished) {
	    	
	    	Log.v("Log_tag", time +"      Tick of Progress       " + tidsint + "          " + millisUntilFinished / 100);
	    	tidms = millisUntilFinished;
	    	tidsint = (int) tidms/1000;
	       
	        mProgressBar.setProgress(tidsint);		 
	    }
	    
	    @Override
	    public void onFinish() {
	   
	        tidsint--;
	        mProgressBar.setProgress(tidsint);		         
	        
	        gameOver();
	    }
	 }

	
	@Override
	protected void onDestroy() {
		super.onDestroy();

		myTimer.cancel();
		
		
		
	}
	
}







