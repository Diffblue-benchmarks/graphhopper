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
package com.graphhopper.routing.util;

import com.graphhopper.routing.util.TraversalMode;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TraversalMode_DiffblueTest {

  @Rule public ExpectedException thrown = ExpectedException.none();

  /* testedClasses: TraversalMode */

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   *  - conditional line 108 branch to line 109
   *  - conditional line 109 branch to line 110
   */

  @Test
  public void createTraversalIdInputZeroZeroZeroFalseOutputZero() {

    // Arrange
    final TraversalMode objectUnderTest = TraversalMode.EDGE_BASED_1DIR;
    final int baseNode = 0;
    final int adjNode = 0;
    final int edgeId = 0;
    final boolean reverse = false;

    // Act
    final int retval = objectUnderTest.createTraversalId(baseNode, adjNode, edgeId, reverse);

    // Assert result
    Assert.assertEquals(0, retval);
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   *  - conditional line 119 branch to line 119
   *  - conditional line 119 branch to line 120
   */

  @Test
  public void reverseEdgeKeyInputPositiveOutputZero() {

    // Arrange
    final TraversalMode objectUnderTest = TraversalMode.EDGE_BASED_2DIR_UTURN;
    final int edgeKey = 1;

    // Act
    final int retval = objectUnderTest.reverseEdgeKey(edgeKey);

    // Assert result
    Assert.assertEquals(0, retval);
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   *  - conditional line 119 branch to line 121
   */

  @Test
  public void reverseEdgeKeyInputZeroOutputZero() {

    // Arrange
    final TraversalMode objectUnderTest = TraversalMode.NODE_BASED;
    final int edgeKey = 0;

    // Act
    final int retval = objectUnderTest.reverseEdgeKey(edgeKey);

    // Assert result
    Assert.assertEquals(0, retval);
  }
}
