package se.mah.marbles;

public class Picture {
	private boolean isSelected;
	private int picture;
	private int category;
	
	public Picture(int pictureId, int category){
		
		this.picture= pictureId;
		this.category=category;
		
	}
	
	public int getPicture(){
		return picture;
	}
	
	public int returnCategory(){
		return category;
	}

	public boolean isSelected() {
		return isSelected;
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}

}
