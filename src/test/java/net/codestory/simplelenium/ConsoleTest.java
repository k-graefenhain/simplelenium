/**
 * Copyright (C) 2013-2015 all@code-story.net
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */
package net.codestory.simplelenium;

import net.codestory.simplelenium.driver.CurrentWebDriver;
import org.junit.Test;

import static net.codestory.simplelenium.driver.Browser.PHANTOM_JS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assume.assumeThat;

public class ConsoleTest extends AbstractTest {
  @Test
  public void capture_console() {
    assumeThat(CurrentWebDriver.getTargetBrowser(), is(PHANTOM_JS));

    goTo("/console");

    assertThat(console()).containsExactly("Hello World");
  }
}
