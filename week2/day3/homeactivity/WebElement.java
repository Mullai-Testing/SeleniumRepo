package week2.day3.homeactivity;
//Base Class: WebElement  Subclasses: Button and TextField
public class WebElement {
/*
 * Base Class: WebElement
 - Create a base class named WebElement with common methods such as click() and setText(String text).*/
	 /*Subclasses: Button and TextField
	 * Additional Subclass: CheckBoxButton
	 * Another Subclass: RadioButton
*/
	public void click() {
		System.out.println("base class named WebElement with common method such as click() ");

	}
	public void setText(String text) {
		System.out.println("base class named WebElement with common method such as setText() " +text );

	}
}
