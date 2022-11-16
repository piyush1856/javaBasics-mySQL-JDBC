package day5.liveClass;

public class _10TransientAndStaticKeyword {
	
//	This keyword is applicable only for the variables, at the time of serialization if we don't want to save the
//	original value of a particular variable for some security reason, such type of variable we should declare
//	with transient keyword..
//	 For example, if a program accepts a user's login details and password. But we don't want to store the
//	original password in the file. Here, we can use transient keyword and when JVM reads the transient
//	keyword it ignores the original value of the object and instead stores the default value of the object.

	
	//static variables are not part of object, hence they will also not participate in serialization.
	// after serialization the initial value will be printed not the updated one
	//transient keyword will have no effect on static variable
}
