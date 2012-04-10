package scala.fastfibonacci
import org.jscience.mathematics.number.LargeInteger
import scala.math._

/** 
 *  @author  Wes Freeman
 */
object LargeInt {

  /** Constructs a <code>LargeInt</code> whose value is equal to that of the
   *  specified integer value.
   *
   *  @param i the specified integer value
   *  @return  the constructed <code>LargeInt</code>
   */
  def apply(i: Int): LargeInt =
    new LargeInt(LargeInteger.valueOf(i))

  /** Constructs a <code>LargeInt</code> whose value is equal to that of the
   *  specified long value.
   *
   *  @param l the specified long value
   *  @return  the constructed <code>LargeInt</code>
   */
  def apply(l: Long): LargeInt =
    new LargeInt(LargeInteger.valueOf(l))

  /** Translates the decimal String representation of a LargeInt into a LargeInt.
   */
  def apply(x: String): LargeInt = 
    new LargeInt(LargeInteger.valueOf(x))

  /** Translates the string representation of a LargeInt in the
   *  specified <code>radix</code> into a LargeInt.
   *
   *  @param x     ...
   *  @param radix ...
   *  @return      ...
   */
  def apply(x: String, radix: Int): LargeInt =
    new LargeInt(LargeInteger.valueOf(x, radix)) 

  /** Implicit conversion from <code>int</code> to <code>LargeInt</code>.
   */
  implicit def int2LargeInt(i: Int): LargeInt = apply(i)

  /** Implicit copnversion from long to LargeInt
   */
  implicit def long2LargeInt(l: Long): LargeInt = apply(l)
}

/** 
 *  @author  Wes Freeman
 */
@serializable
class LargeInt(val largeInteger: LargeInteger) extends ScalaNumber with ScalaNumericConversions with Serializable
{
  /** Returns the hash code for this LargeInt. */
  override def hashCode(): Int = this.largeInteger.hashCode()

  /** Compares this LargeInt with the specified value for equality.
   */
  override def equals(that: Any): Boolean = that match {
    case that: LargeInt               => this equals that
    case that: LargeInteger           => this equals new LargeInt(that)
    case _                          => false
  }

  /** Compares this LargeInt with the specified LargeInt for equality.
   */
  def equals (that: LargeInt): Boolean = compare(that) == 0
  
  /** Compares this LargeInt with the specified LargeInt for equality.
   */
  def == (that: Int): Boolean = equals(LargeInt(that))
  
  /** Compares this LargeInt with the specified LargeInt for equality.
   */
  def == (that: Long): Boolean = equals(LargeInt(that))

  /** Compares this LargeInt with the specified LargeInt
   */
  def compare (that: LargeInt): Int = this.largeInteger.compareTo(that.largeInteger)

  /** Less-than-or-equals comparison of LargeInts
   */
  def <= (that: LargeInt): Boolean = compare(that) <= 0

  /** Greater-than-or-equals comparison of LargeInts
   */
  def >= (that: LargeInt): Boolean = compare(that) >= 0

  /** Less-than of LargeInts
   */
  def <  (that: LargeInt): Boolean = compare(that) <  0

  /** Greater-than comparison of LargeInts
   */
  def >  (that: LargeInt): Boolean = compare(that) > 0

  /** Addition of LargeInts
   */
  def +  (that: LargeInt): LargeInt = new LargeInt(this.largeInteger.plus(that.largeInteger))

  /** Subtraction of LargeInts
   */
  def -  (that: LargeInt): LargeInt = new LargeInt(this.largeInteger.minus(that.largeInteger))

  /** Multiplication of LargeInts
   */
  def *  (that: LargeInt): LargeInt = new LargeInt(this.largeInteger.times(that.largeInteger))

  /** Division of LargeInts
   */
  def /  (that: LargeInt): LargeInt = new LargeInt(this.largeInteger.divide(that.largeInteger))

  /** Remainder of LargeInts
   */
  def %  (that: LargeInt): LargeInt = new LargeInt(this.largeInteger.remainder(that.largeInteger))

  /** Returns a pair of two LargeInts containing (this / that) and (this % that).
   */
  def /% (that: LargeInt): (LargeInt, LargeInt) = {
    val d = this.largeInteger.divide(that.largeInteger)
    val r = this.largeInteger.getRemainder();
    (new LargeInt(d), new LargeInt(r));
  }

  /** Leftshift of LargeInt
   */
  def << (n: Int): LargeInt = new LargeInt(this.largeInteger.shiftLeft(n))

  /** (Signed) rightshift of LargeInt
   */
  def >> (n: Int): LargeInt = new LargeInt(this.largeInteger.shiftRight(n))

  /** Returns the greatest common divisor of abs(this) and abs(that)
   */
  def gcd (that: LargeInt): LargeInt = new LargeInt(this.largeInteger.gcd(that.largeInteger))

  /** Returns a LargeInt whose value is (this mod m).
   *  This method differs from `%' in that it always returns a non-negative LargeInt.
   */
  def mod (that: LargeInt): LargeInt = new LargeInt(this.largeInteger.mod(that.largeInteger))
  
  /** Returns a LargeInt whose value is (<tt>this</tt> raised to the power of <tt>exp</tt>).
   */
  def pow (exp: Int): LargeInt = new LargeInt(this.largeInteger.pow(exp))

  /** Returns a LargeInt whose value is
   *  (<tt>this</tt> raised to the power of <tt>exp</tt> modulo <tt>m</tt>).
   */
  def modPow (exp: LargeInt, m: LargeInt): LargeInt =
    new LargeInt(this.largeInteger.modPow(exp.largeInteger, m.largeInteger))

  /** Returns a LargeInt whose value is (the inverse of <tt>this</tt> modulo <tt>m</tt>).
   */
  def modInverse (m: LargeInt): LargeInt = new LargeInt(this.largeInteger.modInverse(m.largeInteger))

  /** Returns a LargeInt whose value is the negation of this LargeInt
   */
  def unary_- : LargeInt   = new LargeInt(this.largeInteger.times(-1))
  
  /** Returns the absolute value of this LargeInt
   */
  def abs: LargeInt = new LargeInt(this.largeInteger.abs())

  /** Returns the index of the rightmost (lowest-order) one bit in this LargeInt
   * (the number of zero bits to the right of the rightmost one bit).
   */
  def lowestSetBit: Int         = this.largeInteger.getLowestSetBit()

  /** Returns the number of bits in the minimal two's-complement representation of this LargeInt, 
   *  excluding a sign bit.
   */
  def bitLength: Int            = this.largeInteger.bitLength()
  
  def isWhole():Boolean = {
    true;
  }
  
  def underlying():Object = {
    this.largeInteger;
  }
  
  /** Returns the number of bits in the two's complement representation of this LargeInt 
   *  that differ from its sign bit.
   *//*
  def bitCount: Int             = this.largeInteger.bitCount() */

  /** Returns true if this LargeInt is probably prime, false if it's definitely composite.
   *  @param certainty  a measure of the uncertainty that the caller is willing to tolerate: 
   *                    if the call returns true the probability that this LargeInt is prime 
   *                    exceeds (1 - 1/2 ^ certainty). 
   *                    The execution time of this method is proportional to the value of 
   *                    this parameter.
   */
  def isProbablyPrime() = this.largeInteger.isProbablyPrime()
  
  /** Converts this LargeInt to a <tt>byte</tt>. 
   *  If the LargeInt is too big to fit in a byte, only the low-order 8 bits are returned. 
   *  Note that this conversion can lose information about the overall magnitude of the 
   *  LargeInt value as well as return a result with the opposite sign.
   */
  override def byteValue   = intValue.toByte

  /** Converts this LargeInt to a <tt>short</tt>. 
   *  If the LargeInt is too big to fit in a byte, only the low-order 16 bits are returned. 
   *  Note that this conversion can lose information about the overall magnitude of the 
   *  LargeInt value as well as return a result with the opposite sign.
   */
  override def shortValue  = intValue.toShort

  /** Converts this LargeInt to a <tt>char</tt>. 
   *  If the LargeInt is too big to fit in a char, only the low-order 16 bits are returned. 
   *  Note that this conversion can lose information about the overall magnitude of the 
   *  LargeInt value and that it always returns a positive result.
   */
  def charValue   = intValue.toChar

  /** Converts this LargeInt to an <tt>int</tt>. 
   *  If the LargeInt is too big to fit in a char, only the low-order 32 bits
   *  are returned. Note that this conversion can lose information about the
   *  overall magnitude of the LargeInt value as well as return a result with
   *  the opposite sign.
   */
  def intValue    = this.largeInteger.intValue

  /** Converts this LargeInt to a <tt>long</tt>.
   *  If the LargeInt is too big to fit in a char, only the low-order 64 bits
   *  are returned. Note that this conversion can lose information about the
   *  overall magnitude of the LargeInt value as well as return a result with
   *  the opposite sign.
   */
  def longValue   = this.largeInteger.longValue

  /** Converts this LargeInt to a <tt>float</tt>.
   *  if this LargeInt has too great a magnitude to represent as a float,
   *  it will be converted to <code>Float.NEGATIVE_INFINITY</code> or
   *  <code>Float.POSITIVE_INFINITY</code> as appropriate.
   */
  def floatValue  = this.largeInteger.floatValue

  /** Converts this LargeInt to a <tt>double</tt>. 
   *  if this LargeInt has too great a magnitude to represent as a float, 
   *  it will be converted to <code>Float.NEGATIVE_INFINITY</code> or
   *  <code>Float.POSITIVE_INFINITY</code> as appropriate. 
   */
  def doubleValue = this.largeInteger.doubleValue

  /** Create a GenericRange[LargeInt] in range <code>[start;end)</code>
   *  with the specified step, where start is the target LargeInt.
   *
   *  @param end    the end value of the range (exclusive)
   *  @param step   the distance between elements (defaults to 1)
   *  @return       the range
   *//*
  def until(end: LargeInt, step: LargeInt = LargeInt(1)) = Range.LargeInt(this.largeInteger, end, step) */
  
  /** Like until, but inclusive of the end value.
   *//*
  def to(end: LargeInt, step: LargeInt = LargeInt(1)) = Range.LargeInt.inclusive(this, end, step)*/

  /** Returns the decimal String representation of this LargeInt.
   */
  override def toString(): String = this.largeInteger.toString()

  /** Returns the String representation in the specified radix of this LargeInt.
   */
  def toString(radix: Int): String = this.largeInteger.toText(radix).toString

  /** Returns a byte array containing the two's-complement representation of
   *  this LargeInt. The byte array will be in big-endian byte-order: the most
   *  significant byte is in the zeroth element. The array will contain the
   *  minimum number of bytes required to represent this LargeInt, including at
   *  least one sign bit.
   *//*
  def toByteArray: Array[Byte] = this.largeInteger.toByteArray() */
}