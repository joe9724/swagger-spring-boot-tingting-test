package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse20010;
import io.swagger.model.InlineResponse20011;
import io.swagger.model.InlineResponse2007;
import io.swagger.model.InlineResponse2008;
import io.swagger.model.InlineResponse2009;
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
public class AlbumApiController implements AlbumApi {

    private static final Logger log = LoggerFactory.getLogger(AlbumApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AlbumApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<InlineResponse2007> albumbookList(@ApiParam(value = "开始时间戳") @Valid @RequestParam(value = "startTs", required = false) Long startTs,@ApiParam(value = "结束时间戳") @Valid @RequestParam(value = "endTs", required = false) Long endTs,@ApiParam(value = "标签(如:文学|历史|卡通)") @Valid @RequestParam(value = "tags", required = false) String tags,@ApiParam(value = "年级(如:1-4)") @Valid @RequestParam(value = "grade", required = false) String grade,@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client,@ApiParam(value = "用户id") @Valid @RequestParam(value = "memberId", required = false) String memberId,@ApiParam(value = "专辑id") @Valid @RequestParam(value = "albumId", required = false) String albumId,@ApiParam(value = "分页索引") @Valid @RequestParam(value = "pageIndex", required = false) Long pageIndex,@ApiParam(value = "分页尺寸") @Valid @RequestParam(value = "pageSize", required = false) Long pageSize) {
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

    public ResponseEntity<InlineResponse20011> albumbuy(@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client,@ApiParam(value = "用户id") @Valid @RequestParam(value = "memberId", required = false) String memberId,@ApiParam(value = "专辑Id") @Valid @RequestParam(value = "albumId", required = false) Long albumId,@ApiParam(value = "加密串") @Valid @RequestParam(value = "val", required = false) String val,@ApiParam(value = "时间戳(参与加密)") @Valid @RequestParam(value = "ts", required = false) Long ts) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20011>(objectMapper.readValue("{  \"data\" : {    \"msg\" : \"msg\",    \"code\" : 0  },  \"status\" : {    \"msg\" : \"msg\",    \"code\" : 0  }}", InlineResponse20011.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20011>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20011>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse200> albumclick(@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client,@ApiParam(value = "用户id") @Valid @RequestParam(value = "memberId", required = false) String memberId,@ApiParam(value = "专辑Id") @Valid @RequestParam(value = "albumId", required = false) Long albumId,@ApiParam(value = "加密串") @Valid @RequestParam(value = "val", required = false) String val,@ApiParam(value = "时间戳(参与加密)") @Valid @RequestParam(value = "ts", required = false) Long ts,@ApiParam(value = "click/unclick") @Valid @RequestParam(value = "action", required = false) String action) {
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

    public ResponseEntity<InlineResponse2008> albumdetail(@ApiParam(value = "会员id,未登录 -1") @Valid @RequestParam(value = "memberId", required = false) Long memberId,@ApiParam(value = "专辑id") @Valid @RequestParam(value = "albumId", required = false) String albumId,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2008>(objectMapper.readValue("{  \"data\" : {    \"albumName\" : \"albumName\",    \"albumId\" : 0  },  \"isFav\" : true,  \"status\" : {    \"msg\" : \"msg\",    \"code\" : 0  }}", InlineResponse2008.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2008>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2008>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse20011> albumfav(@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client,@ApiParam(value = "用户id") @Valid @RequestParam(value = "memberId", required = false) String memberId,@ApiParam(value = "专辑Id") @Valid @RequestParam(value = "albumId", required = false) Long albumId,@ApiParam(value = "加密串") @Valid @RequestParam(value = "val", required = false) String val,@ApiParam(value = "时间戳(参与加密)") @Valid @RequestParam(value = "ts", required = false) Long ts,@ApiParam(value = "fav/unfav") @Valid @RequestParam(value = "action", required = false) String action) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20011>(objectMapper.readValue("{  \"data\" : {    \"msg\" : \"msg\",    \"code\" : 0  },  \"status\" : {    \"msg\" : \"msg\",    \"code\" : 0  }}", InlineResponse20011.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20011>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20011>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2009> albumlist(@ApiParam(value = "开始时间戳") @Valid @RequestParam(value = "startTs", required = false) Long startTs,@ApiParam(value = "结束时间戳") @Valid @RequestParam(value = "endTs", required = false) Long endTs,@ApiParam(value = "标签(如:文学|历史|卡通)") @Valid @RequestParam(value = "tags", required = false) String tags,@ApiParam(value = "年级(如:1-4)") @Valid @RequestParam(value = "grade", required = false) String grade,@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client,@ApiParam(value = "用户id") @Valid @RequestParam(value = "memberId", required = false) String memberId,@ApiParam(value = "密码") @Valid @RequestParam(value = "subCategoryId", required = false) String subCategoryId,@ApiParam(value = "分页索引") @Valid @RequestParam(value = "pageIndex", required = false) Long pageIndex,@ApiParam(value = "分页尺寸") @Valid @RequestParam(value = "pageSize", required = false) Long pageSize) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2009>(objectMapper.readValue("{  \"albumList\" : [ {    \"albumName\" : \"albumName\",    \"albumId\" : 0  }, {    \"albumName\" : \"albumName\",    \"albumId\" : 0  } ],  \"status\" : {    \"msg\" : \"msg\",    \"code\" : 0  }}", InlineResponse2009.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2009>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2009>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse20010> albumlistclick(@ApiParam(value = "开始时间戳") @Valid @RequestParam(value = "startTs", required = false) Long startTs,@ApiParam(value = "结束时间戳") @Valid @RequestParam(value = "endTs", required = false) Long endTs,@ApiParam(value = "标签(如:文学|历史|卡通)") @Valid @RequestParam(value = "tags", required = false) String tags,@ApiParam(value = "年级(如:1-4)") @Valid @RequestParam(value = "grade", required = false) String grade,@ApiParam(value = "加密串") @Valid @RequestParam(value = "val", required = false) String val,@ApiParam(value = "时间戳(参与加密)") @Valid @RequestParam(value = "ts", required = false) Long ts,@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client,@ApiParam(value = "用户id") @Valid @RequestParam(value = "memberId", required = false) String memberId,@ApiParam(value = "") @Valid @RequestParam(value = "albumId", required = false) Long albumId,@ApiParam(value = "分页索引") @Valid @RequestParam(value = "pageIndex", required = false) Long pageIndex,@ApiParam(value = "分页尺寸") @Valid @RequestParam(value = "pageSize", required = false) Long pageSize,@ApiParam(value = "是否正常调用还是推荐调用 0=正常 1=推荐") @Valid @RequestParam(value = "isRecommend", required = false) Long isRecommend) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20010>(objectMapper.readValue("{  \"albumList\" : [ {    \"area\" : \"area\",    \"gender\" : 6,    \"money\" : 1,    \"level\" : 5,    \"grade\" : \"grade\",    \"name\" : \"name\",    \"birth\" : \"birth\",    \"id\" : 0,    \"avatar\" : \"avatar\",    \"tags\" : \"tags\",    \"status\" : 5,    \"ts\" : 2  }, {    \"area\" : \"area\",    \"gender\" : 6,    \"money\" : 1,    \"level\" : 5,    \"grade\" : \"grade\",    \"name\" : \"name\",    \"birth\" : \"birth\",    \"id\" : 0,    \"avatar\" : \"avatar\",    \"tags\" : \"tags\",    \"status\" : 5,    \"ts\" : 2  } ],  \"status\" : {    \"msg\" : \"msg\",    \"code\" : 0  }}", InlineResponse20010.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20010>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20010>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2009> albumlistfav(@ApiParam(value = "开始时间戳") @Valid @RequestParam(value = "startTs", required = false) Long startTs,@ApiParam(value = "结束时间戳") @Valid @RequestParam(value = "endTs", required = false) Long endTs,@ApiParam(value = "标签(如:文学|历史|卡通)") @Valid @RequestParam(value = "tags", required = false) String tags,@ApiParam(value = "年级(如:1-4)") @Valid @RequestParam(value = "grade", required = false) String grade,@ApiParam(value = "加密串") @Valid @RequestParam(value = "val", required = false) String val,@ApiParam(value = "时间戳(参与加密)") @Valid @RequestParam(value = "ts", required = false) Long ts,@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client,@ApiParam(value = "用户id") @Valid @RequestParam(value = "memberId", required = false) String memberId,@ApiParam(value = "分页索引") @Valid @RequestParam(value = "pageIndex", required = false) Long pageIndex,@ApiParam(value = "分页尺寸") @Valid @RequestParam(value = "pageSize", required = false) Long pageSize,@ApiParam(value = "是否正常调用还是推荐调用 0=正常 1=推荐") @Valid @RequestParam(value = "isRecommend", required = false) Long isRecommend) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2009>(objectMapper.readValue("{  \"albumList\" : [ {    \"albumName\" : \"albumName\",    \"albumId\" : 0  }, {    \"albumName\" : \"albumName\",    \"albumId\" : 0  } ],  \"status\" : {    \"msg\" : \"msg\",    \"code\" : 0  }}", InlineResponse2009.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2009>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2009>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2009> albumlistmatch(@ApiParam(value = "开始时间戳") @Valid @RequestParam(value = "startTs", required = false) Long startTs,@ApiParam(value = "结束时间戳") @Valid @RequestParam(value = "endTs", required = false) Long endTs,@ApiParam(value = "标签(如:文学|历史|卡通)") @Valid @RequestParam(value = "tags", required = false) String tags,@ApiParam(value = "年级(如:1-4)") @Valid @RequestParam(value = "grade", required = false) String grade,@ApiParam(value = "加密串") @Valid @RequestParam(value = "val", required = false) String val,@ApiParam(value = "时间戳(参与加密)") @Valid @RequestParam(value = "ts", required = false) Long ts,@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client,@ApiParam(value = "用户id") @Valid @RequestParam(value = "memberId", required = false) String memberId,@ApiParam(value = "分页索引") @Valid @RequestParam(value = "pageIndex", required = false) Long pageIndex,@ApiParam(value = "分页尺寸") @Valid @RequestParam(value = "pageSize", required = false) Long pageSize,@ApiParam(value = "是否正常调用还是推荐调用 0=正常 1=推荐") @Valid @RequestParam(value = "isRecommend", required = false) Long isRecommend) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2009>(objectMapper.readValue("{  \"albumList\" : [ {    \"albumName\" : \"albumName\",    \"albumId\" : 0  }, {    \"albumName\" : \"albumName\",    \"albumId\" : 0  } ],  \"status\" : {    \"msg\" : \"msg\",    \"code\" : 0  }}", InlineResponse2009.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2009>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2009>(HttpStatus.NOT_IMPLEMENTED);
    }

}
