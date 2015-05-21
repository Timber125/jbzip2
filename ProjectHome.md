jbzip2 is a Java bzip2 compression/decompression library. It can be used as a replacement for the Apache [CBZip2InputStream / CBZip2OutputStream](https://svn.apache.org/repos/asf/ant/core/trunk/src/main/org/apache/tools/bzip2/) classes

## News ##
  * 13/10/2011 [jbzip2-0.9.1](http://code.google.com/p/jbzip2/downloads/detail?name=jbzip2-0.9.1.jar) is now available. This release fixes numerous bugs in both compression and decompression
  * 25/05/2011 jbzip2-0.9 is now available

## Features ##
  * A decompressor that is typically 5% to 10% faster than CBZip2InputStream
  * A compressor of broadly comparable speed to CBZip2OutputStream (slightly slower in some cases, rather faster in others)
  * Legible, well factored code suitable for studying how the algorithms of BZip2 work

## Usage ##
  * To compress data, pass it through a [BZip2OutputStream](http://code.google.com/p/jbzip2/source/browse/trunk/jbzip2/src/org/itadaki/bzip2/BZip2OutputStream.java)
  * To decompress data, pass it through a [BZip2InputStream](http://code.google.com/p/jbzip2/source/browse/trunk/jbzip2/src/org/itadaki/bzip2/BZip2InputStream.java)
  * See the [source](http://code.google.com/p/jbzip2/source/browse/#svn%2Ftrunk%2Fjbzip2%2Fsrc%2Forg%2Fitadaki%2Fbzip2) for worked examples of how to [compress](http://code.google.com/p/jbzip2/source/browse/trunk/jbzip2/src/demo/Compress.java) and [decompress](http://code.google.com/p/jbzip2/source/browse/trunk/jbzip2/src/demo/Decompress.java) data

## Testers Wanted ##
  * jbzip2 has been tested successfully on a moderately large and diverse body of data, but more is needed. Please help by testing jbzip2 on your own data
  * Testing can be carried out using the `RoundTrip` utility included in the distribution :
```
bash# java -cp jbzip2-0.9.1.jar demo.RoundTrip /path/to/test/data
```
  * Each ordinary readable file beneath the given path will be compressed into a temporary file, then decompressed (no files will be created or altered in place). If any error is encountered, the test will stop with an exception
  * Reports of success, as well as failure would be most welcome. Feedback can be sent to the [author](http://code.google.com/u/111143823085622288727/)