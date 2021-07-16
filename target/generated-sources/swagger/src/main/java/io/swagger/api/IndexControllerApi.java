/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.21).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Employee;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-07-16T12:33:46.914+05:30")

@Validated
@Api(value = "IndexController", description = "the IndexController API")
@RequestMapping(value = "")
public interface IndexControllerApi {

    @ApiOperation(value = "To post the employee", nickname = "deleteEmployeeUsingDELETE", notes = "", response = Employee.class, tags={ "index-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Employee.class),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/deleteEmployee/{id}",
        produces = "*/*", 
        method = RequestMethod.DELETE)
    ResponseEntity<Employee> deleteEmployeeUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") String id);


    @ApiOperation(value = "To get the employee", nickname = "getEmployeeUsingGET", notes = "", response = Employee.class, tags={ "index-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Employee.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/getEmployee",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<Employee> getEmployeeUsingGET();


    @ApiOperation(value = "To post the employee", nickname = "insertEmployeeUsingPOST", notes = "", response = Employee.class, tags={ "index-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Employee.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/insertEmployee/{id}/{name}",
        produces = "*/*", 
        consumes = "",
        method = RequestMethod.POST)
    ResponseEntity<Employee> insertEmployeeUsingPOST(@ApiParam(value = "id",required=true) @PathVariable("id") String id,@ApiParam(value = "name",required=true) @PathVariable("name") String name);


    @ApiOperation(value = "To post the employee", nickname = "updateEmployeeUsingPUT", notes = "", response = Employee.class, tags={ "index-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Employee.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/updateEmployee/{id}/{name}",
        produces = "*/*", 
        consumes = "",
        method = RequestMethod.PUT)
    ResponseEntity<Employee> updateEmployeeUsingPUT(@ApiParam(value = "id",required=true) @PathVariable("id") String id,@ApiParam(value = "name",required=true) @PathVariable("name") String name);

}