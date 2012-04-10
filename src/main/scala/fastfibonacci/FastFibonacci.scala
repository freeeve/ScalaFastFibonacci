package scala.fastfibonacci
import scala.collection.mutable.Stack
import scala.collection.mutable.HashMap

object FastFibonacci {
  def main(args:Array[String]):Unit = {
    var i:LargeInt = 1;
    /*var start = System.currentTimeMillis();
     print("fast("+i+"): "+ fast(i).bitLength); 
    var end = System.currentTimeMillis();
    println(" in: "+(end-start)+"ms");*/
    
     while(i<LargeInt("10000000000000")) {
       i *= 2;
       var start = System.currentTimeMillis();
       //f = new HashMap[LargeInt,LargeInt];
       print("fib("+i+"): "); 
       fib(i);
       var end = System.currentTimeMillis();
       println(" in: "+(end-start)+"ms");
       start = System.currentTimeMillis();
       print("fast("+i+"): "); 
       fast(i);
       end = System.currentTimeMillis();
       println(" in: "+(end-start)+"ms");
       start = System.currentTimeMillis();
       if(i<50) {
          print("slow("+i+"): "); 
          slow(i);
          end = System.currentTimeMillis();
          println(" in: "+(end-start)+"ms");
       }
       if(i<1000000) {
          start = System.currentTimeMillis();
          print("slowIt("+i+"): "); 
          slowIt(i);
          end = System.currentTimeMillis();
          println(" in: "+(end-start)+"ms");
       }
    }
  }
  
  // dijkstra's algorithm in recursive form with caching
  var f = new HashMap[LargeInt,LargeInt];
  def fib(n:LargeInt): LargeInt = {
    //println("entering: fib("+n+")");
    val zero:LargeInt = 0;
    val one:LargeInt = 1;
    val two:LargeInt = 2;
    f.get(n).getOrElse({
       //println("not cached: fib("+n+")");
       if(n==0) {
         0;
       } else if(n==1 || n==2) {
         1; 
       } else if(n % 2 == 0) {
         val half = n / 2;
         val nHalf = fib(half);
         f += ((n/2, nHalf));
         (2 * fib(half - 1) + nHalf) * nHalf
       } else {
         val nMinus1Halved = fib((n-1)/2);
         f += (((n-1)/2, nMinus1Halved));
         val nPlus1Halved = fib((n+1)/2); 
         f += (((n+1)/2, nPlus1Halved));
         nMinus1Halved * nMinus1Halved + nPlus1Halved * nPlus1Halved
       }
     });
  }
  
  // iterative form
  def fast(n: LargeInt): LargeInt = {
    var a:LargeInt = 1;
    var b:LargeInt = 0;
    var c:LargeInt = 0;
    var d:LargeInt = 1;
    var i:LargeInt = n+1;
    while(i > 0) {
      if(i % 2 == 1) {
         val t = (b + a) * d + (c * b);
         a = (c * a) + (d * b);
         b = t;
      }  
      
      val t = (c * 2 + d) * d;
      c = c * c + d * d;
      d = t;
      i /= 2;
    }
    a;
  }
  
  // recursive and slow
  def slow(n:LargeInt):LargeInt = {
    if(n==1 || n==2) 1;
    else slow(n-1) + slow(n-2);
  }
  
  // iterative and slow (but faster than recursive)
  def slowIt(n:LargeInt):LargeInt = {
    var sum:LargeInt = 1;
    var prev:LargeInt = 0;
    var prev2:LargeInt = 0;
    var i = sum;
    while(i < n) {
      i += 1;
      prev2 = prev;
      prev = sum;
      sum = prev + prev2;
    }
    sum;
  }
  
}
