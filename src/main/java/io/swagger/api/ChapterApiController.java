package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse20020;
import io.swagger.model.InlineResponse20021;
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
public class ChapterApiController implements ChapterApi {

    private static final Logger log = LoggerFactory.getLogger(ChapterApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ChapterApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<InlineResponse200> chapterbuy(@ApiParam(value = "当前后台登录id") @Valid @RequestParam(value = "userid", required = false) Long userid,@ApiParam(value = "章节id") @Valid @RequestParam(value = "chapterId", required = false) String chapterId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse200>(objectMapper.readValue("{  \"status\" : {    \"msg\" : \"msg\",    \"code\" : 0  }}", InlineResponse200.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse200>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse200>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse20021> chapterdetail(@ApiParam(value = "当前后台登录id") @Valid @RequestParam(value = "userid", required = false) Long userid,@ApiParam(value = "章节id") @Valid @RequestParam(value = "chapterId", required = false) String chapterId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20021>(objectMapper.readValue("{  \"data\" : {    \"duration\" : 5,    \"summary\" : \"summary\",    \"playCount\" : 1,    \"subTitle\" : \"subTitle\",    \"name\" : \"name\",    \"icon\" : \"icon\",    \"mp3Url\" : \"mp3Url\",    \"updateTips\" : \"updateTips\",    \"showIcon\" : true,    \"bigCover\" : \"bigCover\",    \"hlsUrl\" : \"hlsUrl\",    \"order\" : 5  },  \"isFav\" : true,  \"status\" : {    \"msg\" : \"msg\",    \"code\" : 0  }}", InlineResponse20021.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20021>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20021>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse200> chapterfav(@ApiParam(value = "当前后台登录id") @Valid @RequestParam(value = "userid", required = false) Long userid,@ApiParam(value = "章节id") @Valid @RequestParam(value = "chapterId", required = false) String chapterId,@ApiParam(value = "fav/unfav") @Valid @RequestParam(value = "action", required = false) String action) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse200>(objectMapper.readValue("{  \"status\" : {    \"msg\" : \"msg\",    \"code\" : 0  }}", InlineResponse200.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse200>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse200>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse20020> chapterfavlist(@ApiParam(value = "开始时间戳") @Valid @RequestParam(value = "startTs", required = false) Long startTs,@ApiParam(value = "结束时间戳") @Valid @RequestParam(value = "endTs", required = false) Long endTs,@ApiParam(value = "标签(如:文学|历史|卡通)") @Valid @RequestParam(value = "tags", required = false) String tags,@ApiParam(value = "年级(如:1-4)") @Valid @RequestParam(value = "grade", required = false) String grade,@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client,@ApiParam(value = "用户id") @Valid @RequestParam(value = "memberId", required = false) String memberId,@ApiParam(value = "分页索引") @Valid @RequestParam(value = "pageIndex", required = false) Long pageIndex,@ApiParam(value = "分页尺寸") @Valid @RequestParam(value = "pageSize", required = false) Long pageSize) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20020>(objectMapper.readValue("{  \"books\" : [ {    \"duration\" : 5,    \"summary\" : \"summary\",    \"playCount\" : 1,    \"subTitle\" : \"subTitle\",    \"name\" : \"name\",    \"icon\" : \"icon\",    \"mp3Url\" : \"mp3Url\",    \"updateTips\" : \"updateTips\",    \"showIcon\" : true,    \"bigCover\" : \"bigCover\",    \"hlsUrl\" : \"hlsUrl\",    \"order\" : 5  }, {    \"duration\" : 5,    \"summary\" : \"summary\",    \"playCount\" : 1,    \"subTitle\" : \"subTitle\",    \"name\" : \"name\",    \"icon\" : \"icon\",    \"mp3Url\" : \"mp3Url\",    \"updateTips\" : \"updateTips\",    \"showIcon\" : true,    \"bigCover\" : \"bigCover\",    \"hlsUrl\" : \"hlsUrl\",    \"order\" : 5  } ],  \"status\" : {    \"msg\" : \"msg\",    \"code\" : 0  }}", InlineResponse20020.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20020>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20020>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse20020> chapterhistorylist(@ApiParam(value = "开始时间戳") @Valid @RequestParam(value = "startTs", required = false) Long startTs,@ApiParam(value = "结束时间戳") @Valid @RequestParam(value = "endTs", required = false) Long endTs,@ApiParam(value = "标签(如:文学|历史|卡通)") @Valid @RequestParam(value = "tags", required = false) String tags,@ApiParam(value = "年级(如:1-4)") @Valid @RequestParam(value = "grade", required = false) String grade,@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client,@ApiParam(value = "用户id") @Valid @RequestParam(value = "memberId", required = false) String memberId,@ApiParam(value = "分页索引") @Valid @RequestParam(value = "pageIndex", required = false) Long pageIndex,@ApiParam(value = "分页尺寸") @Valid @RequestParam(value = "pageSize", required = false) Long pageSize) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20020>(objectMapper.readValue("{  \"books\" : [ {    \"duration\" : 5,    \"summary\" : \"summary\",    \"playCount\" : 1,    \"subTitle\" : \"subTitle\",    \"name\" : \"name\",    \"icon\" : \"icon\",    \"mp3Url\" : \"mp3Url\",    \"updateTips\" : \"updateTips\",    \"showIcon\" : true,    \"bigCover\" : \"bigCover\",    \"hlsUrl\" : \"hlsUrl\",    \"order\" : 5  }, {    \"duration\" : 5,    \"summary\" : \"summary\",    \"playCount\" : 1,    \"subTitle\" : \"subTitle\",    \"name\" : \"name\",    \"icon\" : \"icon\",    \"mp3Url\" : \"mp3Url\",    \"updateTips\" : \"updateTips\",    \"showIcon\" : true,    \"bigCover\" : \"bigCover\",    \"hlsUrl\" : \"hlsUrl\",    \"order\" : 5  } ],  \"status\" : {    \"msg\" : \"msg\",    \"code\" : 0  }}", InlineResponse20020.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20020>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20020>(HttpStatus.NOT_IMPLEMENTED);
    }

}
