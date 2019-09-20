/*
 * Copyright 2015-2018 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTests {
	
	Calculator calculator = new Calculator();
	/*@Test
    void addition() {
        assertEquals(2, calculator.soma(1, 1));
    }
	@Test
	void sub() {
        assertEquals(1, calculator.sub(2, 1));
    }
	@Test
	void div() {
        assertEquals(1, calculator.div(2, 2));
    }
	@Test
	void mult() {
        assertEquals(10, calculator.mult(2, 5));
    }
	*/
	
	@ParameterizedTest(name = "{0} + {1} = {2}")
	@CsvSource({
			"5, 1, 6",
			"1.5,    2,   3.5",
			"49,  32, 11"
	})
	void add(double first, double second, double expectedResult) {
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.add(first, second),
				() -> first + " + " + second + " should equal " + expectedResult);
	}
	
	@ParameterizedTest(name = "{0} * {1} = {2}")
	@CsvSource({
			"6, 4,  24",
			"1.5,    2,   3",
			"2, 3, 4"
	})
	void mult(double first, double second, double expectedResult) {
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.mul(first, second),
				() -> first + " * " + second + " should equal " + expectedResult);
	}
	
	@ParameterizedTest(name = "{0} - {1} = {2}")
	@CsvSource({
			"3, 4, -1",
			"2.5,    1,   1.5",
			"2,  2, 0",
			"15,  10, 5"
	})
	void subt(double first, double second, double expectedResult) {
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.sub(first, second),
				() -> first + " - " + second + " should equal " + expectedResult);
	}
	
	@ParameterizedTest(name = "{0} / {1} = {2}")
	@CsvSource({
			"3, 3, 1",
			"7, 2,  3.5"
	})
	void divid(double first, double second, double expectedResult) {
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.div(first, second),
				() -> first + " / " + second + " should equal " + expectedResult);
	}
}	
