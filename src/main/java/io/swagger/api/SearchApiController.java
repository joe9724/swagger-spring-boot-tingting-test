package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.InlineResponse20014;
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
public class SearchApiController implements SearchApi {

    private static final Logger log = LoggerFactory.getLogger(SearchApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public SearchApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<InlineResponse20014> search(@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client,@ApiParam(value = "用户id") @Valid @RequestParam(value = "memberId", required = false) String memberId,@ApiParam(value = "关键词") @Valid @RequestParam(value = "keyword", required = false) String keyword) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20014>(objectMapper.readValue("{  \"chapterList\" : [ {    \"duration\" : 5,    \"summary\" : \"summary\",    \"playCount\" : 1,    \"subTitle\" : \"subTitle\",    \"name\" : \"name\",    \"icon\" : \"icon\",    \"mp3Url\" : \"mp3Url\",    \"updateTips\" : \"updateTips\",    \"showIcon\" : true,    \"bigCover\" : \"bigCover\",    \"hlsUrl\" : \"hlsUrl\",    \"order\" : 5  }, {    \"duration\" : 5,    \"summary\" : \"summary\",    \"playCount\" : 1,    \"subTitle\" : \"subTitle\",    \"name\" : \"name\",    \"icon\" : \"icon\",    \"mp3Url\" : \"mp3Url\",    \"updateTips\" : \"updateTips\",    \"showIcon\" : true,    \"bigCover\" : \"bigCover\",    \"hlsUrl\" : \"hlsUrl\",    \"order\" : 5  } ],  \"recordList\" : [ {    \"summary\" : \"summary\",    \"cover\" : \"cover\",    \"duration\" : 0,    \"playCount\" : 6,    \"subTitle\" : \"subTitle\",    \"title\" : \"title\",    \"url\" : \"url\"  }, {    \"summary\" : \"summary\",    \"cover\" : \"cover\",    \"duration\" : 0,    \"playCount\" : 6,    \"subTitle\" : \"subTitle\",    \"title\" : \"title\",    \"url\" : \"url\"  } ],  \"albumList\" : [ {    \"albumName\" : \"albumName\",    \"albumId\" : 0  }, {    \"albumName\" : \"albumName\",    \"albumId\" : 0  } ],  \"status\" : {    \"msg\" : \"msg\",    \"code\" : 0  },  \"bookList\" : [ {    \"clipsNumber\" : 1,    \"summary\" : \"summary\",    \"playCount\" : 6,    \"subTitle\" : \"subTitle\",    \"authorName\" : \"authorName\",    \"name\" : \"name\",    \"icon\" : \"icon\",    \"subCategoryId\" : 0,    \"showIcon\" : true,    \"authorAvatar\" : \"authorAvatar\",    \"bookId\" : 5  }, {    \"clipsNumber\" : 1,    \"summary\" : \"summary\",    \"playCount\" : 6,    \"subTitle\" : \"subTitle\",    \"authorName\" : \"authorName\",    \"name\" : \"name\",    \"icon\" : \"icon\",    \"subCategoryId\" : 0,    \"showIcon\" : true,    \"authorAvatar\" : \"authorAvatar\",    \"bookId\" : 5  } ]}", InlineResponse20014.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20014>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20014>(HttpStatus.NOT_IMPLEMENTED);
    }

}
