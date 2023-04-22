package demo.ExtendReport;

public class Indian {
		public static void main(String[] args) {
		String sc = "Sharan";

		System.out.println(sc);

		String[] text = sc.split("\\s");


		String text1 ="";

		for(int i=text.length-1; i>=0; i--){
		text1 = text[i];
		System.out.print(" " + text1);
		}

		}
		}

