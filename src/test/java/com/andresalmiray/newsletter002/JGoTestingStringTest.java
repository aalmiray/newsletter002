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

import org.jgotesting.rule.JGoTestRule;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.describedAs;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.isEmptyString;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.notNullValue;

/**
 * @author Andres Almiray
 */
public class JGoTestingStringTest {
    @Rule
    public final JGoTestRule t = new JGoTestRule();

    @Test
    public void testsOnString() {
        String subject = "testing";
        t.check(subject, describedAs("subject is not null", notNullValue()));
        t.check(subject, describedAs("subject is not empty", not(isEmptyString())));
        t.check(subject, describedAs("subject contains 'ing'", containsString("ing")));
        t.check(subject, describedAs("subject = 'testing'", equalTo("testing")));
    }

    @Test
    public void fluentTestsOnString() {
        String subject = "testing";
        t.check(subject, describedAs("subject is not null", notNullValue()))
            .check(subject, describedAs("subject is not empty", not(isEmptyString())))
            .check(subject, describedAs("subject contains 'ing'", containsString("ing")))
            .check(subject, describedAs("subject = 'testing'", equalTo("testing")));
    }

    @Test
    public void allChecksOnString() {
        String subject = "something";
        t.check(subject, describedAs("subject is not null", notNullValue()));
        t.check(subject, describedAs("subject is not empty", not(isEmptyString())));
        t.check(subject, describedAs("subject contains 'ung'", containsString("ung")));
        t.check(subject, describedAs("subject = 'testing'", equalTo("testing")));
    }

    @Test
    public void fluentAllChecksOnString() {
        String subject = "something";
        t.check(subject, describedAs("subject is not null", notNullValue()))
            .check(subject, describedAs("subject is not empty", not(isEmptyString())))
            .check(subject, describedAs("subject contains 'ung'", containsString("ung")))
            .check(subject, describedAs("subject = 'testing'", equalTo("testing")));
    }
}
