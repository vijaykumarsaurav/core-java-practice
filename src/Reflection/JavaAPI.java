package Reflection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.Annotation;
import java.util.Scanner;
import java.util.Set;

import javax.management.ReflectionException;

public class JavaAPI implements Runnable
{
	public static void main(String[] args) throws InstantiationException, IllegalAccessException 
	{
		Class c = null;
		try 
		{
			System.out.println("Enter the Class name with pachage  :");			
		//	c = Class.forName(new Scanner(System.in).nextLine());
			c = Class.forName("Reflection.RefTest");
		} 
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		System.out.println("Call the package");
		Package pack =c.getPackage();
		Package pk[] =  pack.getPackages();
		
		for (Package package1 : pk) {
			System.out.println("\n"+package1);
		}
		System.out.println("Package : "+pack.getPackages());
		System.out.println("Package : "+pack.getImplementationVendor());
		System.out.println("Classes ===");
	 	Object oc[] = c.getClasses();
	 	for (Object object : oc) {
			System.out.println("\n"+object);
		}
		
		System.out.println("Constructors : ");
	//	Constructor cons[] =  c.getConstructors(); //only public constructor show 
		Constructor cons[] = c.getDeclaredConstructors();
		for (Constructor constructor : cons) 
		{
			System.out.println(constructor);
		}
		System.out.println("\nMethods : ");		
//		Method md[] =  c.getMethods(); //only public method and all object methods 
		Method md[] =  c.getDeclaredMethods();
		
		for (Method method : md) 
		{
			System.out.println(method);
		}
		
		Method md1[] =  c.getDeclaredMethods();		
		for (Method method : md1) 
		{
			int am=  method.getModifiers();
			if(Modifier.isPublic(am))
			System.out.println("Public :"+method.getName());
			
			if(Modifier.isPrivate(am))
				System.out.println("Private : "+method.getName());
			if(Modifier.isProtected(am))
				System.out.println("protected : "+method.getName());
			if(Modifier.isStatic(am))
				System.out.println("Static : "+method.getName());
		}
	
		System.out.println("\nFields : ");
		Field fld[] = c.getDeclaredFields();
		for (Field field : fld) {
			System.out.println(field);
		}
		System.out.println("\nInterfaces : ");
		Object ci[] = c.getInterfaces();
		for (Object obj : ci) {
			System.out.println(obj);
		}
		System.out.println("\nSuper class  : \n"+c.getSuperclass());
		System.out.println("\n ---- \n"+c.getCanonicalName());
		System.out.println("\n ----- \n"+c.getSimpleName());
		System.out.println("\n ----- \n"+c.asSubclass(c));
		System.out.println("\n ----- \n"+c.desiredAssertionStatus());
		System.out.println("\n ----- \n"+c.getAnnotation(c));
		java.lang.annotation.Annotation[] dd = c.getAnnotations();
		for (java.lang.annotation.Annotation annotation : dd) {
			System.out.println(annotation.toString());
		}

		
		System.out.println("\n ----- \n"+c.getDeclaringClass());
		System.out.println("\n ----- \n"+c.getDeclaredClasses());
		System.out.println("\n ----- \n"+c.getName());
		Object cls[] =  c.getSigners();
		for (Object object : cls) {
			System.out.println(object.toString());
		}
		System.out.println("\n ----- \n"+c.getEnclosingClass());
		System.out.println("\n ----- \n"+c.getEnclosingClass().getName());
		System.out.println("\n ----- \n"+c.getSigners());
			
		try {
			Object st = (Class) c.newInstance();
			System.out.println("Class name : "+st.toString());
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		Class st;
		try {
			st = Class.forName("RefTest");
			System.out.println("Class name : "+st.toString());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
class SuperClass
{}

class RefTest extends SuperClass implements Runnable,ActionListener
{
	static String name ="vijay kumar";
	static int age = 23;
	private RefTest()
	{}
	public RefTest(int a)
	{}
	
	private void mainPrivate()
	{
		System.out.println("main()"+name + age);
	}

	private void mainPrivate2()
	{
		System.out.println("main()"+name + age);
	}
	
	class InnerClss{}
	
	public void mainPublic(int a,int b)
	{
		System.out.println("main(int ,int )"+a+b);
	}
	static public  void mainStatic(int a)
	{
		System.out.println("main(int )"+a);
	}
	protected int mainProtected(int a,int b,int c)
	{
		return a+b+c;
	}
	static public  void mainStatic2(int a)
	{
		System.out.println("main(int )"+a);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}