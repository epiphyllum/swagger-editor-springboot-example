package io.swagger.api;

import io.swagger.model.Product;
import io.swagger.model.Error;

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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-23T01:21:37.800Z")

@Api(value = "products", description = "the products API")
public interface ProductsApi {

    @ApiOperation(value = "Product Types", notes = "The Products endpoint returns information about the *Uber* products offered at a given location. The response includes the display name and other details about each product, and lists the products in the proper display order. ", response = Product.class, responseContainer = "List", tags={ "Products", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array of products", response = Product.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Product.class) })
    @RequestMapping(value = "/products",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Product>> productsGet(@ApiParam(value = "Latitude component of location.", required = true) @RequestParam(value = "latitude", required = true) Double latitude,
        @ApiParam(value = "Longitude component of location.", required = true) @RequestParam(value = "longitude", required = true) Double longitude);

}
