/**
 * 1)public
 * 2)protected
 * 3)private
 * 4)static
 * 5)synchronized
 * 6)strictfp
 * 7)final
 * 8)abstract
 * 9)native
 * 10)transient
 * 11)volatile
 * 
 * @author ASUS
 *Q1)Applicable modifiers for a class:final,public,abstract,strictfp[ FPAS ]
 *Q2)Modifiers are not permitted for variables:native,abstract,synchronized;strictfp[NASS]
 *Q3)Modifiers are not permitted for method:transient,volatile[TV]
 *
 *
 */
public strictfp abstract class Modifiers {
	int age;
	public transient void m1() {}
}
