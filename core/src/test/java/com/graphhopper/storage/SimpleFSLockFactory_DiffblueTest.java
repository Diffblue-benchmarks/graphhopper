/*
 * Copyright 2018 Diffblue Limited
 *
 * Diffblue Limited licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.graphhopper.storage;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;

import com.diffblue.deeptestutils.Reflector;
import com.graphhopper.storage.SimpleFSLockFactory;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RunWith(PowerMockRunner.class)
public class SimpleFSLockFactory_DiffblueTest {

  @Rule public ExpectedException thrown = ExpectedException.none();

  /* testedClasses: SimpleFSLockFactory */

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   *  - conditional line 47 branch to line 48
   */

  @Test
  public void createInputNotNullFalseOutputRuntimeException() {

    // Arrange
    final SimpleFSLockFactory objectUnderTest = new SimpleFSLockFactory();
    final String fileName = "";
    final boolean writeAccess = false;

    // Act
    thrown.expect(RuntimeException.class);
    objectUnderTest.create(fileName, writeAccess);

    // Method is not expected to return due to exception thrown
  }
}
