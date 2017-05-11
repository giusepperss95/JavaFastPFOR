/**
 * This code is released under the
 * Apache License Version 2.0 http://www.apache.org/licenses/.
 *
 * (c) Daniel Lemire, http://lemire.me/en/
 */
package me.lemire.integercompression;


/**
 * This is a patching scheme designed for speed.
 *  It encodes integers in blocks of integers within pages of
 *  up to 65536 integers. Note that it is important, to get good
 *  compression and good performance, to use sizeable arrays (greater than 1024 integers).
 *  For arrays containing a number of integers that is not divisible by BLOCK_SIZE, you should use
 * it in conjunction with another CODEC:
 *
 *  IntegerCODEC ic = new Composition(new FastPFOR(), new VariableByte()).
 * <p>
 * For details, please see:
 * </p><p>
 * Daniel Lemire and Leonid Boytsov, Decoding billions of integers per second
 * through vectorization Software: Practice &amp; Experience
 * <a href="http://onlinelibrary.wiley.com/doi/10.1002/spe.2203/abstract">http://onlinelibrary.wiley.com/doi/10.1002/spe.2203/abstract</a>
 * <a href="http://arxiv.org/abs/1209.2137">http://arxiv.org/abs/1209.2137</a>
 * </p>
 * <p>For sufficiently compressible and long arrays, it is faster and better than other PFOR
 * schemes.</p>
 *
 * Note that this does not use differential coding: if you are working on sorted
 * lists, you should first compute deltas, @see me.lemire.integercompression.differential.Delta#delta.
 * 
 * For multi-threaded applications, each thread should use its own FastPFOR
 * object.
 *
 * @author Daniel Lemire
 */
public class FastPFOR extends BaseFastPFOR  {

	public static final int BLOCK_SIZE = 256;

	public FastPFOR() {
		super(BLOCK_SIZE);
	}

}
