/*
 * Copyright 2015 JetBrains s.r.o.
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
 * Generated on Jul 22, 2015.
 */

package org.schema;

class ProductOrOwnershipInfo {
  public Thing getThing() {
    if (myProduct != null) return myProduct;
    if (myOwnershipInfo != null) return myOwnershipInfo;
    return null;
  }
  public void setProduct(Product product) { clear(); myProduct = product; }
  public Product getProduct() { return myProduct; }
  private Product myProduct;
  public void setOwnershipInfo(OwnershipInfo ownershipInfo) { clear(); myOwnershipInfo = ownershipInfo; }
  public OwnershipInfo getOwnershipInfo() { return myOwnershipInfo; }
  private OwnershipInfo myOwnershipInfo;
  private void clear() {
    myProduct = null;
    myOwnershipInfo = null;
  }
}