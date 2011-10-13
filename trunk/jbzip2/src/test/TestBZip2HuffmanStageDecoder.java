package test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.itadaki.bzip2.BZip2HuffmanStageDecoder;
import org.itadaki.bzip2.BitInputStream;
import org.itadaki.bzip2.BitOutputStream;
import org.junit.Test;

/**
 * Tests BZip2HuffmanStageDecoder
 */
public class TestBZip2HuffmanStageDecoder {

	/**
	 * Tests decoding an invalid symbol
	 * @throws Exception 
	 */
	@Test(expected=IOException.class)
	public void testExceptionOnInvalidSymbol() throws Exception {

		byte[][] tableCodeLengths = { { 23, 23, 23, 22, 22, 21, 21, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 3, 3, 3, 3, 3, 3 } };
		byte[] selectors = new byte[1024];

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		BitOutputStream bitOutputStream = new BitOutputStream (outputStream);
		bitOutputStream.writeBits (23, 8388607); // This value would be the 4th 23-length code
		bitOutputStream.flush();

		BitInputStream bitInputStream = new BitInputStream (new ByteArrayInputStream (outputStream.toByteArray()));
		BZip2HuffmanStageDecoder decoder = new BZip2HuffmanStageDecoder (bitInputStream, tableCodeLengths[0].length, tableCodeLengths, selectors);

		decoder.nextSymbol();

	}

}
