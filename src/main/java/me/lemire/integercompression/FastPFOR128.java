/**
 * This code is released under the
 * Apache License Version 2.0 http://www.apache.org/licenses/.
 *
 * (c) Daniel Lemire, http://lemire.me/en/
 */
package me.lemire.integercompression;

/**
 * This class is similar to FastPFOR but uses a small block size.
 *
 * Note that this does not use differential coding: if you are working on sorted
 * lists, you should first compute deltas, @see me.lemire.integercompression.differential.Delta#delta.
 *
 * For multi-threaded applications, each thread should use its own FastPFOR
 * object.
 *
 * @author Daniel Lemire
 */
public class FastPFOR128 extends BaseFastPFOR {

	public static final int BLOCK_SIZE = 128;

	public FastPFOR128() {
		super(BLOCK_SIZE);
	}
       
}
