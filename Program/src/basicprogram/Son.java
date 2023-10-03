package basicprogram;

public class  Son extends Father{
public void Education() {
	System.out.println("IT");
}
public void collage() {
	System.out.println("B.R.B");
}
public static void main(String[]args) {
	Son obj=new Son();
	obj.Education();
	obj.collage();
	obj.business();
	obj.Car();
}
}
