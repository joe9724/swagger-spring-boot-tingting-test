package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse20022;
import io.swagger.model.InlineResponse20023;
import io.swagger.model.InlineResponse2005;
import io.swagger.model.InlineResponse2006;
import io.swagger.model.InlineResponse2007;
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
public class BookApiController implements BookApi {

    private static final Logger log = LoggerFactory.getLogger(BookApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public BookApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<InlineResponse2005> bookbuy(@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client,@ApiParam(value = "用户id") @Valid @RequestParam(value = "memberId", required = false) String memberId,@ApiParam(value = "书本Id") @Valid @RequestParam(value = "bookId", required = false) Long bookId,@ApiParam(value = "加密串") @Valid @RequestParam(value = "val", required = false) String val,@ApiParam(value = "时间戳(参与加密)") @Valid @RequestParam(value = "ts", required = false) Long ts) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2005>(objectMapper.readValue("{  \"data\" : {    \"msg\" : \"msg\",    \"code\" : 0  },  \"status\" : {    \"msg\" : \"msg\",    \"code\" : 0  }}", InlineResponse2005.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2005>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2005>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse20022> bookchapList(@ApiParam(value = "开始时间戳") @Valid @RequestParam(value = "startTs", required = false) Long startTs,@ApiParam(value = "结束时间戳") @Valid @RequestParam(value = "endTs", required = false) Long endTs,@ApiParam(value = "标签(如:文学|历史|卡通)") @Valid @RequestParam(value = "tags", required = false) String tags,@ApiParam(value = "年级(如:1-4)") @Valid @RequestParam(value = "grade", required = false) String grade,@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client,@ApiParam(value = "用户id") @Valid @RequestParam(value = "memberId", required = false) String memberId,@ApiParam(value = "书id") @Valid @RequestParam(value = "bookId", required = false) String bookId,@ApiParam(value = "分页索引") @Valid @RequestParam(value = "pageIndex", required = false) Long pageIndex,@ApiParam(value = "分页尺寸") @Valid @RequestParam(value = "pageSize", required = false) Long pageSize) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20022>(objectMapper.readValue("{  \"chapters\" : [ {    \"duration\" : 5,    \"summary\" : \"summary\",    \"playCount\" : 1,    \"subTitle\" : \"subTitle\",    \"name\" : \"name\",    \"icon\" : \"icon\",    \"mp3Url\" : \"mp3Url\",    \"updateTips\" : \"updateTips\",    \"showIcon\" : true,    \"bigCover\" : \"bigCover\",    \"hlsUrl\" : \"hlsUrl\",    \"order\" : 5  }, {    \"duration\" : 5,    \"summary\" : \"summary\",    \"playCount\" : 1,    \"subTitle\" : \"subTitle\",    \"name\" : \"name\",    \"icon\" : \"icon\",    \"mp3Url\" : \"mp3Url\",    \"updateTips\" : \"updateTips\",    \"showIcon\" : true,    \"bigCover\" : \"bigCover\",    \"hlsUrl\" : \"hlsUrl\",    \"order\" : 5  } ],  \"status\" : {    \"msg\" : \"msg\",    \"code\" : 0  }}", InlineResponse20022.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20022>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20022>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse200> bookclick(@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client,@ApiParam(value = "用户id") @Valid @RequestParam(value = "memberId", required = false) String memberId,@ApiParam(value = "书本Id") @Valid @RequestParam(value = "bookId", required = false) Long bookId,@ApiParam(value = "加密串") @Valid @RequestParam(value = "val", required = false) String val,@ApiParam(value = "时间戳(参与加密)") @Valid @RequestParam(value = "ts", required = false) Long ts,@ApiParam(value = "fav/unfav") @Valid @RequestParam(value = "action", required = false) String action) {
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

    public ResponseEntity<InlineResponse2007> bookdefault(@ApiParam(value = "开始时间戳") @Valid @RequestParam(value = "startTs", required = false) Long startTs,@ApiParam(value = "结束时间戳") @Valid @RequestParam(value = "endTs", required = false) Long endTs,@ApiParam(value = "标签(如:文学|历史|卡通)") @Valid @RequestParam(value = "tags", required = false) String tags,@ApiParam(value = "年级(如:1-4)") @Valid @RequestParam(value = "grade", required = false) String grade,@ApiParam(value = "加密串") @Valid @RequestParam(value = "val", required = false) String val,@ApiParam(value = "时间戳(参与加密)") @Valid @RequestParam(value = "ts", required = false) String ts,@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client,@ApiParam(value = "用户id") @Valid @RequestParam(value = "memberId", required = false) String memberId,@ApiParam(value = "分页索引") @Valid @RequestParam(value = "pageIndex", required = false) Long pageIndex,@ApiParam(value = "分页尺寸") @Valid @RequestParam(value = "pageSize", required = false) Long pageSize,@ApiParam(value = "是否正常调用还是推荐调用 0=正常 1=推荐") @Valid @RequestParam(value = "isRecommend", required = false) Long isRecommend) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2007>(objectMapper.readValue("{  \"books\" : [ {    \"clipsNumber\" : 1,    \"summary\" : \"summary\",    \"playCount\" : 6,    \"subTitle\" : \"subTitle\",    \"authorName\" : \"authorName\",    \"name\" : \"name\",    \"icon\" : \"icon\",    \"subCategoryId\" : 0,    \"showIcon\" : true,    \"authorAvatar\" : \"authorAvatar\",    \"bookId\" : 5  }, {    \"clipsNumber\" : 1,    \"summary\" : \"summary\",    \"playCount\" : 6,    \"subTitle\" : \"subTitle\",    \"authorName\" : \"authorName\",    \"name\" : \"name\",    \"icon\" : \"icon\",    \"subCategoryId\" : 0,    \"showIcon\" : true,    \"authorAvatar\" : \"authorAvatar\",    \"bookId\" : 5  } ],  \"status\" : {    \"msg\" : \"msg\",    \"code\" : 0  }}", InlineResponse2007.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2007>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2007>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse20023> bookdetail(@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client,@ApiParam(value = "登录名") @Valid @RequestParam(value = "Membername", required = false) String membername,@ApiParam(value = "书本id") @Valid @RequestParam(value = "bookId", required = false) String bookId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20023>(objectMapper.readValue("{  \"data\" : {    \"clipsNumber\" : 1,    \"summary\" : \"summary\",    \"playCount\" : 6,    \"subTitle\" : \"subTitle\",    \"authorName\" : \"authorName\",    \"name\" : \"name\",    \"icon\" : \"icon\",    \"subCategoryId\" : 0,    \"showIcon\" : true,    \"authorAvatar\" : \"authorAvatar\",    \"bookId\" : 5  },  \"isFav\" : true,  \"status\" : {    \"msg\" : \"msg\",    \"code\" : 0  }}", InlineResponse20023.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20023>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20023>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2005> bookfav(@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client,@ApiParam(value = "用户id") @Valid @RequestParam(value = "memberId", required = false) String memberId,@ApiParam(value = "书本Id") @Valid @RequestParam(value = "bookId", required = false) Long bookId,@ApiParam(value = "加密串") @Valid @RequestParam(value = "val", required = false) String val,@ApiParam(value = "时间戳(参与加密)") @Valid @RequestParam(value = "ts", required = false) Long ts,@ApiParam(value = "fav/unfav") @Valid @RequestParam(value = "action", required = false) String action) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2005>(objectMapper.readValue("{  \"data\" : {    \"msg\" : \"msg\",    \"code\" : 0  },  \"status\" : {    \"msg\" : \"msg\",    \"code\" : 0  }}", InlineResponse2005.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2005>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2005>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2006> booklist(@ApiParam(value = "开始时间戳") @Valid @RequestParam(value = "startTs", required = false) Long startTs,@ApiParam(value = "结束时间戳") @Valid @RequestParam(value = "endTs", required = false) Long endTs,@ApiParam(value = "标签(如:文学|历史|卡通)") @Valid @RequestParam(value = "tags", required = false) String tags,@ApiParam(value = "年级(如:1-4)") @Valid @RequestParam(value = "grade", required = false) String grade,@ApiParam(value = "加密串") @Valid @RequestParam(value = "val", required = false) String val,@ApiParam(value = "时间戳(参与加密)") @Valid @RequestParam(value = "ts", required = false) String ts,@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client,@ApiParam(value = "用户id") @Valid @RequestParam(value = "memberId", required = false) String memberId,@ApiParam(value = "分页索引") @Valid @RequestParam(value = "pageIndex", required = false) Long pageIndex,@ApiParam(value = "分页尺寸") @Valid @RequestParam(value = "pageSize", required = false) Long pageSize,@ApiParam(value = "是否正常调用还是推荐调用 0=正常 1=推荐") @Valid @RequestParam(value = "isRecommend", required = false) Long isRecommend) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2006>(objectMapper.readValue("{  \"albumList\" : [ {    \"clipsNumber\" : 1,    \"summary\" : \"summary\",    \"playCount\" : 6,    \"subTitle\" : \"subTitle\",    \"authorName\" : \"authorName\",    \"name\" : \"name\",    \"icon\" : \"icon\",    \"subCategoryId\" : 0,    \"showIcon\" : true,    \"authorAvatar\" : \"authorAvatar\",    \"bookId\" : 5  }, {    \"clipsNumber\" : 1,    \"summary\" : \"summary\",    \"playCount\" : 6,    \"subTitle\" : \"subTitle\",    \"authorName\" : \"authorName\",    \"name\" : \"name\",    \"icon\" : \"icon\",    \"subCategoryId\" : 0,    \"showIcon\" : true,    \"authorAvatar\" : \"authorAvatar\",    \"bookId\" : 5  } ],  \"status\" : {    \"msg\" : \"msg\",    \"code\" : 0  }}", InlineResponse2006.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2006>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2006>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2006> booklistclick(@ApiParam(value = "开始时间戳") @Valid @RequestParam(value = "startTs", required = false) Long startTs,@ApiParam(value = "结束时间戳") @Valid @RequestParam(value = "endTs", required = false) Long endTs,@ApiParam(value = "标签(如:文学|历史|卡通)") @Valid @RequestParam(value = "tags", required = false) String tags,@ApiParam(value = "年级(如:1-4)") @Valid @RequestParam(value = "grade", required = false) String grade,@ApiParam(value = "加密串") @Valid @RequestParam(value = "val", required = false) String val,@ApiParam(value = "时间戳(参与加密)") @Valid @RequestParam(value = "ts", required = false) String ts,@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client,@ApiParam(value = "用户id") @Valid @RequestParam(value = "memberId", required = false) String memberId,@ApiParam(value = "") @Valid @RequestParam(value = "bookId", required = false) Long bookId,@ApiParam(value = "分页索引") @Valid @RequestParam(value = "pageIndex", required = false) Long pageIndex,@ApiParam(value = "分页尺寸") @Valid @RequestParam(value = "pageSize", required = false) Long pageSize,@ApiParam(value = "是否正常调用还是推荐调用 0=正常 1=推荐") @Valid @RequestParam(value = "isRecommend", required = false) Long isRecommend) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2006>(objectMapper.readValue("{  \"albumList\" : [ {    \"clipsNumber\" : 1,    \"summary\" : \"summary\",    \"playCount\" : 6,    \"subTitle\" : \"subTitle\",    \"authorName\" : \"authorName\",    \"name\" : \"name\",    \"icon\" : \"icon\",    \"subCategoryId\" : 0,    \"showIcon\" : true,    \"authorAvatar\" : \"authorAvatar\",    \"bookId\" : 5  }, {    \"clipsNumber\" : 1,    \"summary\" : \"summary\",    \"playCount\" : 6,    \"subTitle\" : \"subTitle\",    \"authorName\" : \"authorName\",    \"name\" : \"name\",    \"icon\" : \"icon\",    \"subCategoryId\" : 0,    \"showIcon\" : true,    \"authorAvatar\" : \"authorAvatar\",    \"bookId\" : 5  } ],  \"status\" : {    \"msg\" : \"msg\",    \"code\" : 0  }}", InlineResponse2006.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2006>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2006>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2006> booklistfav(@ApiParam(value = "开始时间戳") @Valid @RequestParam(value = "startTs", required = false) Long startTs,@ApiParam(value = "结束时间戳") @Valid @RequestParam(value = "endTs", required = false) Long endTs,@ApiParam(value = "标签(如:文学|历史|卡通)") @Valid @RequestParam(value = "tags", required = false) String tags,@ApiParam(value = "年级(如:1-4)") @Valid @RequestParam(value = "grade", required = false) String grade,@ApiParam(value = "加密串") @Valid @RequestParam(value = "val", required = false) String val,@ApiParam(value = "时间戳(参与加密)") @Valid @RequestParam(value = "ts", required = false) String ts,@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client,@ApiParam(value = "用户id") @Valid @RequestParam(value = "memberId", required = false) String memberId,@ApiParam(value = "分页索引") @Valid @RequestParam(value = "pageIndex", required = false) Long pageIndex,@ApiParam(value = "分页尺寸") @Valid @RequestParam(value = "pageSize", required = false) Long pageSize,@ApiParam(value = "是否正常调用还是推荐调用 0=正常 1=推荐") @Valid @RequestParam(value = "isRecommend", required = false) Long isRecommend) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2006>(objectMapper.readValue("{  \"albumList\" : [ {    \"clipsNumber\" : 1,    \"summary\" : \"summary\",    \"playCount\" : 6,    \"subTitle\" : \"subTitle\",    \"authorName\" : \"authorName\",    \"name\" : \"name\",    \"icon\" : \"icon\",    \"subCategoryId\" : 0,    \"showIcon\" : true,    \"authorAvatar\" : \"authorAvatar\",    \"bookId\" : 5  }, {    \"clipsNumber\" : 1,    \"summary\" : \"summary\",    \"playCount\" : 6,    \"subTitle\" : \"subTitle\",    \"authorName\" : \"authorName\",    \"name\" : \"name\",    \"icon\" : \"icon\",    \"subCategoryId\" : 0,    \"showIcon\" : true,    \"authorAvatar\" : \"authorAvatar\",    \"bookId\" : 5  } ],  \"status\" : {    \"msg\" : \"msg\",    \"code\" : 0  }}", InlineResponse2006.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2006>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2006>(HttpStatus.NOT_IMPLEMENTED);
    }

}
