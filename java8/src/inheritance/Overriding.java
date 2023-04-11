package inheritance;
/**
 * 1.method name must be same
 * 2.argument list must be same
 * 3.return type must be same(but this statement till java1.4 from 1.5 onward there is some
 *   flexibility in return type.means while overriding you can return child type also this
 *   concept is known as co-variant return type).
 * 4.you can not reduce the scope of visibility(public>protected>default>private)but you can
 *   increase
 * 5.you can not override private method,final method and static method
 * Q.1 why you can not override private method?
 * ans:because it is visible within same class only
 * Q.2 why you can not override final method?
 * ans:final method is against implementation but overriding is favour to implementation 
 *     hence contradict will happen.
 * Q.3 why you can not override static method?
 * ans:static method is related to class and overriding concept is related to object(instance
 *     method)
 *     
 * @author prtks
 *
 */
public class Overriding {

}
