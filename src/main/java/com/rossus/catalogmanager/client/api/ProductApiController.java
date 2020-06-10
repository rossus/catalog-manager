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

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-09T19:30:30.590+03:00")

@Controller
public class ProductApiController implements ProductApi {



    public ResponseEntity<Void> addPrice(@ApiParam(value = "Name of the product",required=true ) @PathVariable("product") String product,
        @ApiParam(value = "Name of the price plan",required=true ) @PathVariable("plan") String plan,
        @ApiParam(value = "New price's parameters" ,required=true )  @Valid @RequestBody Price body) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> addPricePlan(@ApiParam(value = "Name of the product",required=true ) @PathVariable("product") String product,
        @ApiParam(value = "Name of the new price plan and it's parameters" ,required=true )  @Valid @RequestBody AddPricePlanRequest body) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> addProduct(@ApiParam(value = "Name of the new product and it's parameters (product will become uncategorized if category will be left undefined)" ,required=true )  @Valid @RequestBody AddProductRequest body) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> editPrice(@ApiParam(value = "Name of the product",required=true ) @PathVariable("product") String product,
        @ApiParam(value = "Name of the price plan",required=true ) @PathVariable("plan") String plan,
        @ApiParam(value = "Name of the price to edit",required=true ) @PathVariable("price") String price,
        @ApiParam(value = "Price parameters to edit" ,required=true )  @Valid @RequestBody EditPriceRequest body) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> editPricePlan(@ApiParam(value = "Name of the product",required=true ) @PathVariable("product") String product,
        @ApiParam(value = "Name of the price plan to edit",required=true ) @PathVariable("plan") String plan,
        @ApiParam(value = "Price plan parameters to edit" ,required=true )  @Valid @RequestBody EditPricePlanRequest body) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> editProduct(@ApiParam(value = "Name of the product to edit",required=true ) @PathVariable("product") String product,
        @ApiParam(value = "Product parameters to edit (product will become uncategorized if category will be defined as empty string)" ,required=true )  @Valid @RequestBody EditProductRequest body) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Price> getPrice(@ApiParam(value = "Name of the product",required=true ) @PathVariable("product") String product,
        @ApiParam(value = "Name of the price plan",required=true ) @PathVariable("plan") String plan,
        @ApiParam(value = "Name of the price to return",required=true ) @PathVariable("price") String price) {
        // do some magic!
        return new ResponseEntity<Price>(HttpStatus.OK);
    }

    public ResponseEntity<GetPricePlanResponse> getPricePlan(@ApiParam(value = "Name of the product",required=true ) @PathVariable("product") String product,
        @ApiParam(value = "Name of the price plan to return",required=true ) @PathVariable("plan") String plan) {
        // do some magic!
        return new ResponseEntity<GetPricePlanResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GetProductResponse> getProduct(@ApiParam(value = "Name of the product to return",required=true ) @PathVariable("product") String product) {
        // do some magic!
        return new ResponseEntity<GetProductResponse>(HttpStatus.OK);
    }

    public ResponseEntity<Void> removePriceP(@ApiParam(value = "Name of the product",required=true ) @PathVariable("product") String product,
        @ApiParam(value = "Name of the price plan",required=true ) @PathVariable("plan") String plan,
        @ApiParam(value = "Name of the price to remove",required=true ) @PathVariable("price") String price) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> removePricePlan(@ApiParam(value = "Name of the product",required=true ) @PathVariable("product") String product,
        @ApiParam(value = "Name of the price plan to remove",required=true ) @PathVariable("plan") String plan) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> removeProduct(@ApiParam(value = "Name of the product to remove",required=true ) @PathVariable("product") String product) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
