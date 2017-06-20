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

import org.assertj.core.api.JUnitSoftAssertions;
import org.junit.Rule;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Andres Almiray
 */
public class AssertJStringTest {
    @Test
    public void testsOnString() {
        String subject = "testing";
        assertThat(subject).as("subject is not null").isNotNull();
        assertThat(subject).as("subject is not null").isNotEmpty();
        assertThat(subject).as("subject is not blank").isNotBlank();
        assertThat(subject).as("subject contains 'ing'").contains("ing");
        assertThat(subject).as("subject has size = 7").hasSize(7);
        assertThat(subject).as("subject = 'testing'").isEqualTo("testing");
    }

    @Test
    public void fluentTestsOnString() {
        String subject = "testing";
        assertThat(subject).as("subject is not null").isNotNull()
            .as("subject is not null").isNotEmpty()
            .as("subject is not blank").isNotBlank()
            .as("subject contains 'ing'").contains("ing")
            .as("subject has size = 7").hasSize(7)
            .as("subject = 'testing'").isEqualTo("testing");
    }

    @Rule
    public final JUnitSoftAssertions softly = new JUnitSoftAssertions();

    @Test
    public void allChecksOnString() {
        String subject = "something";
        softly.assertThat(subject).as("subject is not null").isNotNull();
        softly.assertThat(subject).as("subject is not null").isNotEmpty();
        softly.assertThat(subject).as("subject is not blank").isNotBlank();
        softly.assertThat(subject).as("subject contains 'ung'").contains("ung");
        softly.assertThat(subject).as("subject has size = 7").hasSize(7);
        softly.assertThat(subject).as("subject = 'testing'").isEqualTo("testing");
    }

    @Test
    public void fluentAllChecksOnString() {
        String subject = "something";
        softly.assertThat(subject).as("subject is not null").isNotNull()
            .as("subject is not null").isNotEmpty()
            .as("subject is not blank").isNotBlank()
            .as("subject contains 'ung'").contains("ung")
            .as("subject has size = 7").hasSize(7)
            .as("subject = 'testing'").isEqualTo("testing");
    }
}
