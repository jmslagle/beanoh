package com.sourceallies.beanoh.util;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sourceallies.beanoh.util.DefaultContextLocationBuilder;

public class DefaultContextLocationBuilderTest {
	
	@Test
	public void testBuild(){
		DefaultContextLocationBuilder builder = new DefaultContextLocationBuilder();
		assertEquals("java/lang/String-BeanohContext.xml", builder.build(String.class));
	}

}
