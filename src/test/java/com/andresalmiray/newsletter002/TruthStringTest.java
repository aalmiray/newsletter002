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

import com.google.common.truth.Expect;
import org.junit.Rule;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

/**
 * @author Andres Almiray
 */
public class TruthStringTest {
    @Test
    public void testsOnString() {
        String subject = "testing";
        assertThat(subject).named("subject is not null").isNotNull();
        assertThat(subject).named("subject is not null").isNotEmpty();
        assertThat(subject).named("subject contains 'ing'").contains("ing");
        assertThat(subject).named("subject has size = 7").hasLength(7);
        assertThat(subject).named("subject = 'testing'").isEqualTo("testing");
    }

    @Rule
    public final Expect expect = Expect.create();

    @Test
    public void allChecksOnString() {
        String subject = "something";
        expect.that(subject).named("subject").isNotNull();
        expect.that(subject).named("subject").isNotEmpty();
        expect.that(subject).named("subject").contains("ung");
        expect.that(subject).named("subject").hasLength(7);
        expect.that(subject).named("subject").isEqualTo("testing");
    }
}
