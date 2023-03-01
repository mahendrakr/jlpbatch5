package encapsulation;
/**
 * 1.it will check exact matching
 * 2.if not then it will check nearest widening (byte<short<char<int<long<float<double)
 * 3.if not then it will check exact wrapper class
 * 4.if not then it will check object argument
 * 5.if not then it will check var-arg
 *
 * 6.if not then it will give compilation error 
 *  
 * @author K L Bopche
 *
 */

public class ExecutionOrder {

}
