package se.mah.marbles;

public class Picture {
	private boolean isSelected;
	private int picture;
	private int category;
	private int category_two;
	
	public Picture(int pictureId, int category, int category_two){
		
		this.picture=pictureId;
		this.category=category;
		this.category_two=category_two;		
	}
	
	public int getPicture(){
		return picture;
	}
	
	public int returnCategory(){
		return category;
	}
	
	public int returnCategoryTwo(){
		return category_two;
	}


	public boolean isSelected() {
		return isSelected;
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}

}
