/*
 * Copyright 2015-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * This is auto-generated file. Do not edit.
 */

package org.schema;

import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.*;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
class BooleanOrNumberOrStringOrStructuredValue {
  @JsonValue
  public Object getJsonLdValue() {
    if (myBoolean != null) return myBoolean;
    if (myNumber != null) return myNumber;
    if (myString != null) return myString;
    if (myStructuredValue != null) return myStructuredValue;
    return null;
  }
  public void setBoolean(Boolean value) { clear(); myBoolean = value; }
  public Boolean getBoolean() { return myBoolean; }
  public void setNumber(Number number) { clear(); myNumber = number; }
  public Number getNumber() { return myNumber; }
  public void setString(String value) { clear(); myString = value; }
  public String getString() { return myString; }
  public void setStructuredValue(StructuredValue structuredValue) { clear(); myStructuredValue = structuredValue; }
  public StructuredValue getStructuredValue() { return myStructuredValue; }
  private Boolean myBoolean;
  private Number myNumber;
  private String myString;
  private StructuredValue myStructuredValue;
  private void clear() {
    myBoolean = null;
    myNumber = null;
    myString = null;
    myStructuredValue = null;
  }
}
