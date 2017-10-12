import javax.swing.JOptionPane;

public class challenge2 {

	public static void main(String[] args) {
		//make list with 9 numbers
		int [] listNum = {5, 6, 9, 4, 1, 2, 8, 3, 10};
		//7 is the missing number
		
		//check if 1-10 is in the list
		int sumNum = 0;
		for (int i = 0; i < listNum.length; i++) {
			sumNum = sumNum + listNum[i];
		}
		int numMissing = 55 - sumNum;
		//print missing number
		JOptionPane.showMessageDialog(null, 
				"Missing number from your list is " + numMissing + ".");

	}

}
