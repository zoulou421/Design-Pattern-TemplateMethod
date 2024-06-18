package com.formationkilo;

import com.formationkilo.mt.TemplateClass;
import com.formationkilo.mt.TemplateImpl1;
import com.formationkilo.mt.TemplateImpl2;

public class Client {

	public static void main(String[] args) {
		TemplateClass templateClass1=new TemplateImpl1();
		System.out.println(templateClass1.templateMethod());
		
		TemplateClass templateClass2=new TemplateImpl2();
		System.out.println(templateClass2.templateMethod());

	}

}
