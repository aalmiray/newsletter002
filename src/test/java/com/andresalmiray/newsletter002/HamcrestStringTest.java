/*
 * Copyright 2017 Andres Almiray
 *
 * This file is part of Andres Almiray Newsletter
 *
 * Andres Almiray Newsletter is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Andres Almiray Newsletter is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Andres Almiray Newsletter. If not, see <http://www.gnu.org/licenses/>.
 */
package com.andresalmiray.newsletter002;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.describedAs;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.isEmptyString;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.notNullValue;

/**
 * @author Andres Almiray
 */
public class HamcrestStringTest {
    @Test
    public void testsOnString() {
        String subject = "testing";
        assertThat(subject, describedAs("subject is not null", notNullValue()));
        assertThat(subject, describedAs("subject is not empty", not(isEmptyString())));
        assertThat(subject, describedAs("subject contains 'ing'", containsString("ing")));
        assertThat(subject, describedAs("subject = 'testing'", equalTo("testing")));
    }

    @Test
    public void allChecksOnString() {
        String subject = "something";
        assertThat(subject, describedAs("subject is not null", notNullValue()));
        assertThat(subject, describedAs("subject is not empty", not(isEmptyString())));
        assertThat(subject, describedAs("subject contains 'ung'", containsString("ung")));
        assertThat(subject, describedAs("subject = 'testing'", equalTo("testing")));
    }
}
