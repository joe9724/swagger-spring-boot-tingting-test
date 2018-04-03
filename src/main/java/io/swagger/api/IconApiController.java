package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.InlineResponse2004;
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
public class IconApiController implements IconApi {

    private static final Logger log = LoggerFactory.getLogger(IconApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public IconApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<InlineResponse2004> iconlist(@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client,@ApiParam(value = "用户id") @Valid @RequestParam(value = "memberId", required = false) String memberId,@ApiParam(value = "位置Id") @Valid @RequestParam(value = "posId", required = false) String posId,@ApiParam(value = "是否正常调用还是推荐调用 0=正常 1=推荐") @Valid @RequestParam(value = "isRecommend", required = false) Long isRecommend) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2004>(objectMapper.readValue("{  \"icons\" : [ {    \"cover\" : \"cover\",    \"webUrl\" : \"webUrl\",    \"icon\" : \"icon\",    \"name\" : \"name\",    \"id\" : 6,    \"type\" : 0,    \"order\" : 1  }, {    \"cover\" : \"cover\",    \"webUrl\" : \"webUrl\",    \"icon\" : \"icon\",    \"name\" : \"name\",    \"id\" : 6,    \"type\" : 0,    \"order\" : 1  } ],  \"status\" : {    \"msg\" : \"msg\",    \"code\" : 0  }}", InlineResponse2004.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2004>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2004>(HttpStatus.NOT_IMPLEMENTED);
    }

}
