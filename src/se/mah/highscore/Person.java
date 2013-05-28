package se.mah.highscore;


public class Person implements Comparable<Person>{ //Detta fixxa s� att man kan j�mf�ra 2 personer
	//Men vad skall man j�mf�ra? Kolla p� metoden Compare
	private String firstName;
 	private String lastName;
 	private int points;
 	public Person(String firstName, String lastName) {
		// TODO Auto-generated constructor stub
 		this.firstName = firstName;
 		this.lastName = lastName;
 		points = 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return firstName + " " + lastName + " Points: " + points;	
	}

	
	public void addPoints(int pointsToAdd){
		points = points + pointsToAdd;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	public String getFirstname(){
		return firstName;
	}

	@Override
	public int compareTo(Person another) {
		return  another.points-this.points; //Fundera p� detta och l�s
	}
}