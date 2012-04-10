package scala.fastfibonacci
import org.scalatest.FunSuite
 
class FastFibonacciTest extends FunSuite { 
  test("test 1-20 slow vs slowIt") {
    for(i <- 1 to 20) {
      expect(FastFibonacci.slow(i), i) {FastFibonacci.slowIt(i);};
    }
  }
  
  test("test 1-1000 slowIt vs fib") {
    for(i <- 1 to 1000) {
      expect(FastFibonacci.slowIt(i), i) {FastFibonacci.fib(i);};
    }
  }
  
  test("test 1-1000 fib vs fast") {
    for(i <- 1 to 1000) {
      expect(FastFibonacci.slowIt(i), i) {FastFibonacci.fib(i);};
    }
  }
}
