package com.rossus.catalogmanager.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.rossus.catalogmanager.client.model.GetCategoryResponse;
import com.rossus.catalogmanager.client.model.ProductView;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GetCategoryResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-09T19:30:30.590+03:00")

public class GetCategoryResponse   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("subcategories")
  private List<GetCategoryResponse> subcategories = null;

  @JsonProperty("products")
  private List<ProductView> products = null;

  public GetCategoryResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Providers", required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetCategoryResponse subcategories(List<GetCategoryResponse> subcategories) {
    this.subcategories = subcategories;
    return this;
  }

  public GetCategoryResponse addSubcategoriesItem(GetCategoryResponse subcategoriesItem) {
    if (this.subcategories == null) {
      this.subcategories = new ArrayList<GetCategoryResponse>();
    }
    this.subcategories.add(subcategoriesItem);
    return this;
  }

   /**
   * Get subcategories
   * @return subcategories
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<GetCategoryResponse> getSubcategories() {
    return subcategories;
  }

  public void setSubcategories(List<GetCategoryResponse> subcategories) {
    this.subcategories = subcategories;
  }

  public GetCategoryResponse products(List<ProductView> products) {
    this.products = products;
    return this;
  }

  public GetCategoryResponse addProductsItem(ProductView productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<ProductView>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * Get products
   * @return products
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ProductView> getProducts() {
    return products;
  }

  public void setProducts(List<ProductView> products) {
    this.products = products;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCategoryResponse getCategoryResponse = (GetCategoryResponse) o;
    return Objects.equals(this.name, getCategoryResponse.name) &&
        Objects.equals(this.subcategories, getCategoryResponse.subcategories) &&
        Objects.equals(this.products, getCategoryResponse.products);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, subcategories, products);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCategoryResponse {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subcategories: ").append(toIndentedString(subcategories)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

