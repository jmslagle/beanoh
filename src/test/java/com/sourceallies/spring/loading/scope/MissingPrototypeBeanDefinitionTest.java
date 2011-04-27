/*
Copyright (c) 2011  Source Allies

This library is free software; you can redistribute it and/or
modify it under the terms of the GNU Lesser General Public
License as published by the Free Software Foundation version 3.0.

This library is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public
License along with this library; if not, please visit 
http://www.gnu.org/licenses/lgpl-3.0.txt.
*/

package com.sourceallies.spring.loading.scope;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.sourceallies.spring.BeanCreationExceptionTestCase;

@ContextConfiguration
public class MissingPrototypeBeanDefinitionTest extends BeanCreationExceptionTestCase{
	
	@Test
	public void testMissing(){
		assertMissing("homeAddress");
	}
}
