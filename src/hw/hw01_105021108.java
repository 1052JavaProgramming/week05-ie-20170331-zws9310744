package hw;
/*
 * Topic: ArrayList(Student資料輸入)
 * Date: 2017/4/3
 * Author: 105021108 張惟舜
 */
import java.util.Scanner;
import java.util.ArrayList;
public class hw01_105021108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		ArrayList<Student> dataList = new ArrayList<Student>();
		String str = "Y";
		
		while(str.charAt(0) == 'Y' || str.charAt(0) == 'y'){
			System.out.print("請輸學生姓名,id,成績:");;
			dataList.add(new Student(scn.next(),scn.next(),scn.nextInt()));
			for(int i=0;i<dataList.size();i++){
				for(int j=i+1;j<dataList.size();j++){
					if(dataList.get(i).getScore()<dataList.get(j).getScore()){
						Student tmp = dataList.get(i);
						dataList.set(i,dataList.get(j));
						dataList.set(j,tmp);
					}
				}
			}
			for(int i=0;i<dataList.size();i++){
				System.out.print(dataList.get(i).getInfo()+"\t");
			}
			System.out.print("\n是否繼續輸入(Y/N):");
			str = scn.next();
			System.out.println("－－－－－－－－－－－－－－－－－");
			if(str.charAt(0) == 'N' || str.charAt(0) == 'n'){
				System.out.println("END!");
			}
		}
	}

}
