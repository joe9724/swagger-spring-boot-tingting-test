package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.InlineResponse20016;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-03T13:27:38.359Z")

@Controller
public class RecommendApiController implements RecommendApi {

    private static final Logger log = LoggerFactory.getLogger(RecommendApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public RecommendApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<InlineResponse20016> recommend(@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client,@ApiParam(value = "用户id") @Valid @RequestParam(value = "memberId", required = false) String memberId,@ApiParam(value = "位置Id") @Valid @RequestParam(value = "posId", required = false) String posId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20016>(objectMapper.readValue("{  \"recommend\" : {    \"resource\" : [ {      \"data\" : [ {        \"clipsNumber\" : 1,        \"summary\" : \"summary\",        \"playCount\" : 6,        \"subTitle\" : \"subTitle\",        \"authorName\" : \"authorName\",        \"name\" : \"name\",        \"icon\" : \"icon\",        \"subCategoryId\" : 0,        \"showIcon\" : true,        \"authorAvatar\" : \"authorAvatar\",        \"bookId\" : 5      }, {        \"clipsNumber\" : 1,        \"summary\" : \"summary\",        \"playCount\" : 6,        \"subTitle\" : \"subTitle\",        \"authorName\" : \"authorName\",        \"name\" : \"name\",        \"icon\" : \"icon\",        \"subCategoryId\" : 0,        \"showIcon\" : true,        \"authorAvatar\" : \"authorAvatar\",        \"bookId\" : 5      } ],      \"title\" : \"title\"    }, {      \"data\" : [ {        \"clipsNumber\" : 1,        \"summary\" : \"summary\",        \"playCount\" : 6,        \"subTitle\" : \"subTitle\",        \"authorName\" : \"authorName\",        \"name\" : \"name\",        \"icon\" : \"icon\",        \"subCategoryId\" : 0,        \"showIcon\" : true,        \"authorAvatar\" : \"authorAvatar\",        \"bookId\" : 5      }, {        \"clipsNumber\" : 1,        \"summary\" : \"summary\",        \"playCount\" : 6,        \"subTitle\" : \"subTitle\",        \"authorName\" : \"authorName\",        \"name\" : \"name\",        \"icon\" : \"icon\",        \"subCategoryId\" : 0,        \"showIcon\" : true,        \"authorAvatar\" : \"authorAvatar\",        \"bookId\" : 5      } ],      \"title\" : \"title\"    } ]  },  \"status\" : {    \"msg\" : \"msg\",    \"code\" : 0  }}", InlineResponse20016.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20016>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20016>(HttpStatus.NOT_IMPLEMENTED);
    }

}
