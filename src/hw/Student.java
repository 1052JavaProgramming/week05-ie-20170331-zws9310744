package hw;

public class Student {
	private String name,id;
	private int score;
	public Student(String name1,String id1,int score){
		name = name1;
		id = id1;
		this.setScore(score);
	}
	public void setScore(int num){	
		if(score >= 0){
			score = num;
		}else{
			System.out.println("error!");
		}
	}
	public int getScore(){	return score;	}
	public String getInfo(){
		return this.name+"("+this.id+")"+this.getScore();
	}
}
