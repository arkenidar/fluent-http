/**
 * Copyright (C) 2013 all@code-story.net
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
package net.codestory.http;

import net.codestory.http.testhelpers.*;

import org.junit.*;

@Ignore // works in the ide not in maven... wtf ?
public class StaticPageInDevTest extends AbstractDevWebServerTest {
  @Test
  public void honorCoffeeSource() {
    get("/js/script.coffee.source").produces("application/javascript", "console.log 'Hello'");
  }

  @Test
  public void honorCoffeeSourceEvenInJS() {
    get("/js/anotherscript.js.source").produces("application/javascript", "console.log 'foobar'");
  }

  @Test
  public void honorLessSource() {
    get("/assets/style.less.source").produces("text/css", "body {\n  h1 {\n    color: red;\n  }\n}");
  }

  @Test
  public void honorLessSourceEvenInCss() {
    get("/assets/anotherstyle.css.source").produces("text/css", "body { h1 { color: red; } }");
  }

  @Test
  public void fetchMapFile() {
    get("/assets/style.less.map").produces("text/plain", "\"file\":\"/assets/style.less.source\"");
  }
}
