package week3day1;

public class Automation extends MultipleLanguage implements Language, TestTool {
	
	



	@Override
	public void Selenium() {
		System.out.println("Print Selenium");
		
	}

	@Override
	public void Java() {
		System.out.println("Print Java");
		
	}

	@Override
	public void ruby() {
		System.out.println("Print ruby");
		
	}public static void main(String[] args) {
		Automation ab1 = new Automation();
		ab1.Python();
		ab1.Java();
		ab1.ruby();
		ab1.Selenium();
		

	}


}





