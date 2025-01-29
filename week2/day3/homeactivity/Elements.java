package week2.day3.homeactivity;

public class Elements extends Button {
//Execution Class: Elements
//	- Create execution class named , also inheriting from the Button subclass
	/*
	 Hints to Solve:
	- Use appropriate keyword for inheritance.
	- Finally, in a separate class Elements create objects for sub classes and
	 call their respective methods..
 	 * */
	public static void main(String[] args) {
		RadioButton btnRadioButton = new RadioButton();
		btnRadioButton.selectRadioButton();
		CheckBoxButton btnCheckBoxButton = new CheckBoxButton();
		btnCheckBoxButton.clickCheckButton();
		TextField objTextField = new TextField();
		objTextField.getText();
		Elements btnElements = new Elements();
		btnElements.click();
		btnElements.setText("Check");
		btnElements.submit();
		
		
	}
}
