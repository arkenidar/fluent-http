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

import java.util.*;

import org.simpleframework.http.*;

public class Context {
  private final Request request;
  private final Query query;

  public Context(Request request) {
    this.request = request;
    this.query = request.getQuery();
  }

  public Cookie getCookie(String name) {
    return request.getCookie(name);
  }

  public List<Cookie> getCookies() {
    return request.getCookies();
  }

  public String get(String name) {
    return query.get(name);
  }

  public List<String> getAll(String name) {
    return query.getAll(name);
  }

  public int getInteger(String name) {
    return query.getInteger(name);
  }

  public float getFloat(String name) {
    return query.getFloat(name);
  }

  public boolean getBoolean(String name) {
    return query.getBoolean(name);
  }

  public Map<String, String> getkeyValues() {
    return query;
  }

  public Request getRequest() {
    return request;
  }
}
