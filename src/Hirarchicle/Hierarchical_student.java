package Hirarchicle;

public class Hierarchical_student {
public static void main(String[] args) {
	Art_Student a =new Art_Student();
	a.age();
	a.BA();
	a.MA();
	a.rollnum();
	Medical m= new Medical();
	m.age();
	m.rollnum();
	m.MBBS();
	m.BAMS();
	Engineering_student e= new Engineering_student();
	e.age();
	e.rollnum();
	e.mechanical();
	e.electrical();
	e.cs();
}
}
