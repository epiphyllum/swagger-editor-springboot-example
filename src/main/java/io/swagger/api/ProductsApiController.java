package io.swagger.api;

import io.swagger.model.Product;
import io.swagger.model.Error;

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


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-23T01:21:37.800Z")

@Controller
public class ProductsApiController implements ProductsApi {

    public ResponseEntity<List<Product>> productsGet(@ApiParam(value = "Latitude component of location.", required = true) @RequestParam(value = "latitude", required = true) Double latitude,
        @ApiParam(value = "Longitude component of location.", required = true) @RequestParam(value = "longitude", required = true) Double longitude) {
        // do some magic!
        return new ResponseEntity<List<Product>>(HttpStatus.OK);
    }

}
