/**
 * This code is released under the
 * Apache License Version 2.0 http://www.apache.org/licenses/.
 *
 * (c) Daniel Lemire, http://lemire.me/en/
 */

package me.lemire.integercompression;


/**
 * NewPFD/NewPFOR: fast patching scheme by Yan et al.
 * <p>
 * Follows:
 * </p><p>
 * H. Yan, S. Ding, T. Suel, Inverted index compression and query processing
 * with optimized document ordering, in: WWW 09, 2009, pp. 401-410.
 * </p>
 * using Simple16 as the secondary coder.
 * 
 * It encodes integers in blocks of 128 integers. For arrays containing
 * an arbitrary number of integers, you should use it in conjunction
 * with another CODEC: 
 * 
 *  <pre>IntegerCODEC ic = 
 *  new Composition(new NewPDF(), new VariableByte()).</pre>
 * 
 * Note that this does not use differential coding: if you are working on sorted
 * lists, you must compute the deltas separately. (Yes, this is true even though
 * the "D" at the end of the name probably stands for delta.)
 * 
 * For multi-threaded applications, each thread should use its own NewPFD
 * object.
 * 
 * @author Daniel Lemire
 */
public final class NewPFD extends BasePFD {
      

}
