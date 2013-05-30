package se.mah.marbles;

import java.util.HashMap;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;



public class Effects {

	private static final String TAG = Effects.class.toString();

	private static final Effects INSTANCE = new Effects();
	//Testar lite kukGit blabla

	// Ljudets ID, kan inte vara 0 (noll)
	public static final int SOUND_1 = 1;
	public static final int SOUND_2 = 2;
	public static final int SOUND_3 = 3;
	public static final int SOUND_4 = 4;
	public static final int SOUND_5 = 5;
	public static final int SOUND_6 = 6;
	public static final int SOUND_7 = 7;

	private Effects() {
		
	}

	public static Effects getInstance() {
	return INSTANCE;
	}

	private SoundPool soundPool;
	private HashMap<Integer, Integer> soundPoolMap;
	int priority = 1;
	int no_loop = 0;
	private int volume;
	float normal_playback_rate = 1f;

	private Context context;



	public void init(Context context) {
		
	this.context = context;
	soundPool = new SoundPool(4, AudioManager.STREAM_MUSIC, 100);
	soundPoolMap = new HashMap<Integer, Integer>();

	//----HÄR LÄGGER MAN IN LJUDEN---------------------------------------------------------------
	soundPoolMap.put(SOUND_1, soundPool.load(context, R.raw.button29, 1));
	soundPoolMap.put(SOUND_2, soundPool.load(context, R.raw.cartoon017, 2));
	soundPoolMap.put(SOUND_1, soundPool.load(context, R.raw.button11, 3));
	soundPoolMap.put(SOUND_2, soundPool.load(context, R.raw.cartoon024, 4));
	soundPoolMap.put(SOUND_5, soundPool.load(context, R.raw.kidscheering, 5));
	soundPoolMap.put(SOUND_6, soundPool.load(context, R.raw.nope, 6));
	soundPoolMap.put(SOUND_7, soundPool.load(context, R.raw.wood, 7));

	AudioManager audioManager = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);
	volume = audioManager.getStreamVolume(AudioManager.STREAM_SYSTEM);
	}

	public void playSound(int soundId) {
	soundPool.play(soundId, volume, volume, priority, no_loop, normal_playback_rate);
	}

}
