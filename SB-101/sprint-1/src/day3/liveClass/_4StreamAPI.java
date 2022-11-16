package day3.liveClass;

public class _4StreamAPI {
	/*
	 * Introduced in java 1.8
	 * 
	 * this API belongs to java.util.stream package
	 * this API is different from IO-Stream, this IO stream API belongs to java.io package
	 * 
	 * this java.util.stream package contains some library classes and interfaces by using which we can perform functional
	 * style of programming on a group of object (Collection Objects)
	 * 
	 * 
	 * java.util.stream package represents flow of data in the form of objects.
	 * 
	 * ***This API has one main Interface : java.util.stream.Stream(I);
	 * 
	 * 
	 * Note : Object of stream interface represents flow/sequence of objects from a source like collection object
	 * 
	 * 
	 * Features of Stream: 
	 * 		1. Stream doesn't store the element, it only represents the elements in a sequence.
	 * 		   example : wire doesn't store the electricity.
	 * 		
	 * 		2. It represents only flow of Objects, not the primitives.
	 * 		3. Operations(filtering / transforming, etc) performed on the streamed object doesn't modify its source
	 * 		   example : filtering a stream obtained from a source (collection) produces a new stream with the filtered elements rather than removing the elements
	 * 					 from the source collection. (filter chaining)
	 * 
	 * 		4. with the help of stream object we can perform various useful operation on the collection data in functional style,like filtering some elements,
	 * 			printing some elements, transforming some elements etc.
	 * 
	 * 
	 * Collection interface provides 2 methods to get a Stream object :
	 * 		1. Stream<T>   stream();
			2. Stream<T>   parrellalStream();  // this stream object is used in multithreaded application.
			
	 * 			
	 * Methods of the Stream(I) interface:
	 * 		there are 2 types of methods in the Stream interface:
	 * 			1. Intermediate method : these methods returns a new Stream object, instead of final output.
	 * 						--these methods never gives the final result.
	 * 						some of the  commonly used intermediate methods are: map(), filter() method.
	 * 
	 * 			2. Terminal method : stream object returns the final output only when terminal method is called on the stream object.
	 * 								these methods consumes that stream object, and after that we can not re-use that stream object again.
	 * 					
	 * 					Note: If we try to use a consumed stream object once again, then it will throw an exception.
						
						some of the commonly used terminal methods are:	forEach(Consumer c); collect(); min(); max(); count(0; get(); anyMatch(); AllMatch();						
	 * 
	 * 
	 */
}
