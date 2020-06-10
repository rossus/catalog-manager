/**
 * NOTE: This class is auto generated by the swagger code generator program (2.2.3).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.rossus.catalogmanager.client.api;

import com.rossus.catalogmanager.client.model.AddPricePlanRequest;
import com.rossus.catalogmanager.client.model.AddProductRequest;
import com.rossus.catalogmanager.client.model.EditPricePlanRequest;
import com.rossus.catalogmanager.client.model.EditPriceRequest;
import com.rossus.catalogmanager.client.model.EditProductRequest;
import com.rossus.catalogmanager.client.model.GetPricePlanResponse;
import com.rossus.catalogmanager.client.model.GetProductResponse;
import com.rossus.catalogmanager.client.model.Price;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-09T19:30:30.590+03:00")

@Api(value = "product", description = "the product API")
public interface ProductApi {

    @ApiOperation(value = "Add new price", notes = "", response = Void.class, tags={ "products", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Bad Request", response = Void.class),
        @ApiResponse(code = 404, message = "Price plan not found", response = Void.class) })
    
    @RequestMapping(value = "/product/{product}/plans/{plan}/prices",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addPrice(@ApiParam(value = "Name of the product",required=true ) @PathVariable("product") String product,@ApiParam(value = "Name of the price plan",required=true ) @PathVariable("plan") String plan,@ApiParam(value = "New price's parameters" ,required=true )  @Valid @RequestBody Price body);


    @ApiOperation(value = "Add new price plan", notes = "", response = Void.class, tags={ "products", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Bad Request", response = Void.class),
        @ApiResponse(code = 404, message = "Product not found", response = Void.class) })
    
    @RequestMapping(value = "/product/{product}/plans",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addPricePlan(@ApiParam(value = "Name of the product",required=true ) @PathVariable("product") String product,@ApiParam(value = "Name of the new price plan and it's parameters" ,required=true )  @Valid @RequestBody AddPricePlanRequest body);


    @ApiOperation(value = "Add new product", notes = "", response = Void.class, tags={ "products", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Bad Request", response = Void.class),
        @ApiResponse(code = 404, message = "Category not found", response = Void.class) })
    
    @RequestMapping(value = "/product",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addProduct(@ApiParam(value = "Name of the new product and it's parameters (product will become uncategorized if category will be left undefined)" ,required=true )  @Valid @RequestBody AddProductRequest body);


    @ApiOperation(value = "Edit the price plan", notes = "", response = Void.class, tags={ "products", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Bad Request", response = Void.class),
        @ApiResponse(code = 404, message = "Not Found", response = Void.class) })
    
    @RequestMapping(value = "/product/{product}/plans/{plan}/prices/{price}",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> editPrice(@ApiParam(value = "Name of the product",required=true ) @PathVariable("product") String product,@ApiParam(value = "Name of the price plan",required=true ) @PathVariable("plan") String plan,@ApiParam(value = "Name of the price to edit",required=true ) @PathVariable("price") String price,@ApiParam(value = "Price parameters to edit" ,required=true )  @Valid @RequestBody EditPriceRequest body);


    @ApiOperation(value = "Edit the price plan", notes = "", response = Void.class, tags={ "products", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Bad Request", response = Void.class),
        @ApiResponse(code = 404, message = "Not Found", response = Void.class) })
    
    @RequestMapping(value = "/product/{product}/plans/{plan}",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> editPricePlan(@ApiParam(value = "Name of the product",required=true ) @PathVariable("product") String product,@ApiParam(value = "Name of the price plan to edit",required=true ) @PathVariable("plan") String plan,@ApiParam(value = "Price plan parameters to edit" ,required=true )  @Valid @RequestBody EditPricePlanRequest body);


    @ApiOperation(value = "Edit the product", notes = "", response = Void.class, tags={ "products", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Bad Request", response = Void.class),
        @ApiResponse(code = 404, message = "Not Found", response = Void.class) })
    
    @RequestMapping(value = "/product/{product}",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> editProduct(@ApiParam(value = "Name of the product to edit",required=true ) @PathVariable("product") String product,@ApiParam(value = "Product parameters to edit (product will become uncategorized if category will be defined as empty string)" ,required=true )  @Valid @RequestBody EditProductRequest body);


    @ApiOperation(value = "Get price info", notes = "", response = Price.class, tags={ "products", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Price info successfully returned", response = Price.class),
        @ApiResponse(code = 404, message = "Not Found", response = Void.class) })
    
    @RequestMapping(value = "/product/{product}/plans/{plan}/prices/{price}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Price> getPrice(@ApiParam(value = "Name of the product",required=true ) @PathVariable("product") String product,@ApiParam(value = "Name of the price plan",required=true ) @PathVariable("plan") String plan,@ApiParam(value = "Name of the price to return",required=true ) @PathVariable("price") String price);


    @ApiOperation(value = "Get price plan info", notes = "", response = GetPricePlanResponse.class, tags={ "products", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Price plan info successfully returned", response = GetPricePlanResponse.class),
        @ApiResponse(code = 404, message = "Not Found", response = Void.class) })
    
    @RequestMapping(value = "/product/{product}/plans/{plan}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<GetPricePlanResponse> getPricePlan(@ApiParam(value = "Name of the product",required=true ) @PathVariable("product") String product,@ApiParam(value = "Name of the price plan to return",required=true ) @PathVariable("plan") String plan);


    @ApiOperation(value = "Get product info", notes = "", response = GetProductResponse.class, tags={ "products", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Product info successfully returned", response = GetProductResponse.class),
        @ApiResponse(code = 404, message = "Not Found", response = Void.class) })
    
    @RequestMapping(value = "/product/{product}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<GetProductResponse> getProduct(@ApiParam(value = "Name of the product to return",required=true ) @PathVariable("product") String product);


    @ApiOperation(value = "Remove the price plan", notes = "", response = Void.class, tags={ "products", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No Content", response = Void.class) })
    
    @RequestMapping(value = "/product/{product}/plans/{plan}/prices/{price}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> removePriceP(@ApiParam(value = "Name of the product",required=true ) @PathVariable("product") String product,@ApiParam(value = "Name of the price plan",required=true ) @PathVariable("plan") String plan,@ApiParam(value = "Name of the price to remove",required=true ) @PathVariable("price") String price);


    @ApiOperation(value = "Remove the price plan", notes = "", response = Void.class, tags={ "products", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No Content", response = Void.class) })
    
    @RequestMapping(value = "/product/{product}/plans/{plan}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> removePricePlan(@ApiParam(value = "Name of the product",required=true ) @PathVariable("product") String product,@ApiParam(value = "Name of the price plan to remove",required=true ) @PathVariable("plan") String plan);


    @ApiOperation(value = "Remove the product", notes = "", response = Void.class, tags={ "products", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No Content", response = Void.class) })
    
    @RequestMapping(value = "/product/{product}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> removeProduct(@ApiParam(value = "Name of the product to remove",required=true ) @PathVariable("product") String product);

}
