package JavaBasics;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[] = new int[5];
		i[0] = 1;
		i[2] = 2;
		
		System.out.println(i[2]);
		Object obj[] = new Object[5];// obj aary is used to store diff data type
										// values

		obj[0] = "Tom";
		obj[1] = 1;
		obj[2] = 12.33;

		String x[][]=new String [2][2];
		for (int row=0;row<x.length;row++)
			for (int col=0;col<x[0].length;col++)
				System.out.println(x[row][col]);
		
		
	}

}
