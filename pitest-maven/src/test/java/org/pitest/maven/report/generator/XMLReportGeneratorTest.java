/*
 * Copyright 2015 Jason Fehr
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */
package org.pitest.maven.report.generator;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class XMLReportGeneratorTest {

	private XMLReportGenerator fixture;
	
	@Before
	public void setUp() {
		fixture = new XMLReportGenerator();
	}
	
	@Test
	public void testName() {
		assertThat(fixture.getGeneratorName(), is("XMLReportGenerator"));
	}
	
	@Test
	public void testNotExecuted() {
		assertThat(fixture.generate(null), sameInstance(ReportGenerationResultEnum.NOT_EXECUTED));
	}

}
