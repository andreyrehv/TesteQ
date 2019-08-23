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
	@Test
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

}	
