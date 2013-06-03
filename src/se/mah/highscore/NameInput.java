package se.mah.highscore;


import se.mah.marbles.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class NameInput extends Activity {
    private ImageButton Submit;
	private EditText inputName;
	private TextView score;
	
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.nameinput);
		
		int points = getIntent().getExtras().getInt("points");
		Submit = (ImageButton) findViewById(R.id.restart);
		inputName= (EditText)findViewById(R.id.namn);
		inputName.setText(" ");
		score= (TextView) findViewById(R.id.congratz);
		score.setText("Grattis, du fick: " + points + " poäng. Skriv in ditt namn!");
		
			
	
		
		Submit.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String name =inputName.getText().toString();
				Intent data = new Intent();
				data.putExtra("name", name);
				setResult(Activity.RESULT_OK, data);
			
				
				finish();
			}
		});
	}
}
