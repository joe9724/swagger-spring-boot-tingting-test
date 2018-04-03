package io.swagger.api;

import io.swagger.model.Body;
import io.swagger.model.Body1;
import io.swagger.model.Body2;
import io.swagger.model.Body3;
import io.swagger.model.Error;
import io.swagger.model.InitModel;
import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse2001;
import io.swagger.model.InlineResponse20012;
import io.swagger.model.InlineResponse20013;
import io.swagger.model.InlineResponse20018;
import io.swagger.model.InlineResponse20019;
import io.swagger.model.InlineResponse2002;
import io.swagger.model.InlineResponse20024;
import io.swagger.model.InlineResponse2003;
import io.swagger.model.InlineResponse2004;
import org.springframework.core.io.Resource;
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
public class MemberApiController implements MemberApi {

    private static final Logger log = LoggerFactory.getLogger(MemberApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public MemberApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<InlineResponse20012> feedback(@ApiParam(value = "意见反馈"  )  @Valid @RequestBody Body2 body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20012>(objectMapper.readValue("{  \"return\" : {    \"msg\" : \"msg\",    \"code\" : 0  }}", InlineResponse20012.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20012>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20012>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse200> findPasseditPass(@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client,@ApiParam(value = "登录所用手机号") @Valid @RequestParam(value = "phoneNumber", required = false) String phoneNumber,@ApiParam(value = "加密串") @Valid @RequestParam(value = "val", required = false) String val,@ApiParam(value = "时间戳(加密串要用到,供服务端验证，简单防刷)") @Valid @RequestParam(value = "ts", required = false) Long ts,@ApiParam(value = "新密码") @Valid @RequestParam(value = "newPass", required = false) String newPass,@ApiParam(value = "老密码") @Valid @RequestParam(value = "oldPass", required = false) String oldPass,@ApiParam(value = "0=修改密码 1=找回密码") @Valid @RequestParam(value = "type", required = false) Long type,@ApiParam(value = "") @Valid @RequestParam(value = "extraInfo1", required = false) String extraInfo1) {
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

    public ResponseEntity<InlineResponse200> findPasssendSms(@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client,@ApiParam(value = "登录所用手机号") @Valid @RequestParam(value = "phoneNumber", required = false) String phoneNumber,@ApiParam(value = "加密串") @Valid @RequestParam(value = "val", required = false) String val,@ApiParam(value = "时间戳(加密串要用到,供服务端验证，简单防刷)") @Valid @RequestParam(value = "ts", required = false) Long ts) {
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

    public ResponseEntity<InlineResponse20024> login(@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client,@ApiParam(value = "登录名") @Valid @RequestParam(value = "phone", required = false) String phone,@ApiParam(value = "登录方式,0代表密码登陆,1代表快捷登录") @Valid @RequestParam(value = "loginType", required = false) Long loginType,@ApiParam(value = "登录密码,") @Valid @RequestParam(value = "password", required = false) String password,@ApiParam(value = "快捷登录时上传smsCode,password留空") @Valid @RequestParam(value = "smsCode", required = false) String smsCode) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20024>(objectMapper.readValue("{  \"data\" : {    \"gender\" : 6,    \"Membername\" : \"Membername\",    \"avatar\" : \"avatar\",    \"memberId\" : 0  },  \"status\" : {    \"msg\" : \"msg\",    \"code\" : 0  }}", InlineResponse20024.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20024>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20024>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2004> membercheckRecharge(@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client,@ApiParam(value = "用户id") @Valid @RequestParam(value = "memberId", required = false) String memberId,@ApiParam(value = "充值流水号") @Valid @RequestParam(value = "serialNumber", required = false) String serialNumber) {
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

    public ResponseEntity<InlineResponse20019> memberdetail(@ApiParam(value = "会员id,未登录 -1") @Valid @RequestParam(value = "memberId", required = false) Long memberId,@ApiParam(value = "时间戳") @Valid @RequestParam(value = "ts", required = false) Long ts,@ApiParam(value = "加密串") @Valid @RequestParam(value = "val", required = false) String val,@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20019>(objectMapper.readValue("{  \"data\" : {    \"area\" : \"area\",    \"gender\" : 6,    \"money\" : 1,    \"level\" : 5,    \"grade\" : \"grade\",    \"name\" : \"name\",    \"birth\" : \"birth\",    \"id\" : 0,    \"avatar\" : \"avatar\",    \"tags\" : \"tags\",    \"status\" : 5,    \"ts\" : 2  },  \"isFav\" : true,  \"status\" : {    \"msg\" : \"msg\",    \"code\" : 0  }}", InlineResponse20019.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20019>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20019>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse200> memberedit(@ApiParam(value = "版本号") @RequestPart(value="version", required=false)  String version,@ApiParam(value = "唯一识别号") @RequestPart(value="imei", required=false)  String imei,@ApiParam(value = "客户端类型") @RequestPart(value="client", required=false)  String client,@ApiParam(value = "登录名") @RequestPart(value="Membername", required=false)  String membername,@ApiParam(value = "密码") @RequestPart(value="password", required=false)  String password,@ApiParam(value = "短信验证码") @RequestPart(value="validateCode", required=false)  String validateCode,@ApiParam(value = "手机号") @RequestPart(value="phoneNumber", required=false)  String phoneNumber,@ApiParam(value = "出生年") @RequestPart(value="birth-year", required=false)  Long birthYear,@ApiParam(value = "出生月") @RequestPart(value="birth-month", required=false)  Long birthMonth,@ApiParam(value = "出生日") @RequestPart(value="birth-day", required=false)  Long birthDay,@ApiParam(value = "年级") @RequestPart(value="grade", required=false)  Long grade,@ApiParam(value = "file detail") @Valid @RequestPart("file") MultipartFile avatar,@ApiParam(value = "时间戳") @RequestPart(value="ts", required=false)  Long ts,@ApiParam(value = "加密串") @RequestPart(value="val", required=false)  String val) {
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

    public ResponseEntity<InlineResponse2001> memberloginByThirdParty(@ApiParam(value = "第三方登录"  )  @Valid @RequestBody Body body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2001>(objectMapper.readValue("{  \"data\" : {    \"msg\" : \"msg\",    \"order_no\" : \"order_no\",    \"code\" : 0,    \"serialNumber\" : \"serialNumber\",    \"time\" : 5,    \"type\" : 6,    \"value\" : 5,    \"memberId\" : \"memberId\",    \"status\" : 1  },  \"status\" : {    \"msg\" : \"msg\",    \"code\" : 0  }}", InlineResponse2001.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2001>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2001>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2002> memberrechargelist(@ApiParam(value = "分页索引") @Valid @RequestParam(value = "pageIndex", required = false) Long pageIndex,@ApiParam(value = "分页尺寸") @Valid @RequestParam(value = "pageSize", required = false) Long pageSize,@ApiParam(value = "支付类型 0是支付宝 1是微信 2是银联 3是applay 4是其他") @Valid @RequestParam(value = "payType", required = false) Long payType,@ApiParam(value = "流水号") @Valid @RequestParam(value = "orderNo", required = false) String orderNo,@ApiParam(value = "统计开始时间") @Valid @RequestParam(value = "startTime", required = false) Long startTime,@ApiParam(value = "统计结束时间") @Valid @RequestParam(value = "endTime", required = false) Long endTime,@ApiParam(value = "会员id") @Valid @RequestParam(value = "memberId", required = false) Long memberId,@ApiParam(value = "检索时模糊查询使用") @Valid @RequestParam(value = "albumName", required = false) String albumName,@ApiParam(value = "加密串") @Valid @RequestParam(value = "val", required = false) String val,@ApiParam(value = "时间戳(参与加密)") @Valid @RequestParam(value = "ts", required = false) Long ts) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2002>(objectMapper.readValue("{  \"recharges\" : [ {    \"msg\" : \"msg\",    \"order_no\" : \"order_no\",    \"code\" : 0,    \"serialNumber\" : \"serialNumber\",    \"time\" : 5,    \"type\" : 6,    \"value\" : 5,    \"memberId\" : \"memberId\",    \"status\" : 1  }, {    \"msg\" : \"msg\",    \"order_no\" : \"order_no\",    \"code\" : 0,    \"serialNumber\" : \"serialNumber\",    \"time\" : 5,    \"type\" : 6,    \"value\" : 5,    \"memberId\" : \"memberId\",    \"status\" : 1  } ],  \"status\" : {    \"msg\" : \"msg\",    \"code\" : 0  }}", InlineResponse2002.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2002>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2002>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse200> memberregister(@ApiParam(value = "版本号") @RequestPart(value="version", required=false)  String version,@ApiParam(value = "唯一识别号") @RequestPart(value="imei", required=false)  String imei,@ApiParam(value = "客户端类型") @RequestPart(value="client", required=false)  String client,@ApiParam(value = "登录名") @RequestPart(value="Membername", required=false)  String membername,@ApiParam(value = "密码") @RequestPart(value="password", required=false)  String password,@ApiParam(value = "短信验证码") @RequestPart(value="validateCode", required=false)  String validateCode,@ApiParam(value = "手机号") @RequestPart(value="phoneNumber", required=false)  String phoneNumber,@ApiParam(value = "出生年") @RequestPart(value="birth-year", required=false)  Long birthYear,@ApiParam(value = "出生月") @RequestPart(value="birth-month", required=false)  Long birthMonth,@ApiParam(value = "出生日") @RequestPart(value="birth-day", required=false)  Long birthDay,@ApiParam(value = "年级") @RequestPart(value="grade", required=false)  Long grade,@ApiParam(value = "file detail") @Valid @RequestPart("file") MultipartFile avatar) {
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

    public ResponseEntity<InlineResponse200> memberregistersendSms(@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client,@ApiParam(value = "登录所用手机号") @Valid @RequestParam(value = "phoneNumber", required = false) String phoneNumber,@ApiParam(value = "加密串") @Valid @RequestParam(value = "val", required = false) String val,@ApiParam(value = "时间戳(加密串要用到,供服务端验证，简单防刷)") @Valid @RequestParam(value = "ts", required = false) Long ts) {
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

    public ResponseEntity<InlineResponse20012> memberreportErr(@ApiParam(value = "report ERR to server"  )  @Valid @RequestBody Body3 body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20012>(objectMapper.readValue("{  \"return\" : {    \"msg\" : \"msg\",    \"code\" : 0  }}", InlineResponse20012.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20012>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20012>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse20013> memberscanCode(@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client,@ApiParam(value = "用户id") @Valid @RequestParam(value = "memberId", required = false) String memberId,@ApiParam(value = "二维码中的url") @Valid @RequestParam(value = "codeUrl", required = false) String codeUrl,@ApiParam(value = "额外信息") @Valid @RequestParam(value = "extraInfo", required = false) String extraInfo) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20013>(objectMapper.readValue("{  \"data\" : {    \"clipsNumber\" : 1,    \"summary\" : \"summary\",    \"playCount\" : 6,    \"subTitle\" : \"subTitle\",    \"authorName\" : \"authorName\",    \"name\" : \"name\",    \"icon\" : \"icon\",    \"subCategoryId\" : 0,    \"showIcon\" : true,    \"authorAvatar\" : \"authorAvatar\",    \"bookId\" : 5  },  \"status\" : {    \"msg\" : \"msg\",    \"code\" : 0  }}", InlineResponse20013.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20013>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20013>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InitModel> memberstartUp(@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InitModel>(objectMapper.readValue("{  \"data\" : {    \"msg\" : \"下载地址字段\",    \"number\" : 0,    \"downloadUrl\" : \"http://www.google.com/google.apk\",    \"force\" : 0,    \"extraInfo\" : {      \"specialUrl\" : \"specialUrl\",      \"aboutUsUrl\" : \"aboutUsUrl\",      \"versionUrl\" : \"versionUrl\"    }  },  \"status\" : {    \"msg\" : \"ok\",    \"code\" : 200  }}", InitModel.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InitModel>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InitModel>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse20012> memberuploadAvatar(@ApiParam(value = "file detail") @Valid @RequestPart("file") MultipartFile icon,@ApiParam(value = "会员id") @RequestPart(value="memberId", required=false)  Long memberId,@ApiParam(value = "file detail") @Valid @RequestPart("file") MultipartFile cover,@ApiParam(value = "手机号") @RequestPart(value="phoneNumber", required=false)  String phoneNumber,@ApiParam(value = "备用字段1") @RequestPart(value="extraInfo1", required=false)  String extraInfo1,@ApiParam(value = "备用字段2") @RequestPart(value="extraInfo2", required=false)  String extraInfo2,@ApiParam(value = "备用字段3") @RequestPart(value="extraInfo3", required=false)  String extraInfo3) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20012>(objectMapper.readValue("{  \"return\" : {    \"msg\" : \"msg\",    \"code\" : 0  }}", InlineResponse20012.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20012>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20012>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse20012> memberuploadRecord(@ApiParam(value = "file detail") @Valid @RequestPart("file") MultipartFile icon,@ApiParam(value = "Description of file contents.", required=true) @RequestPart(value="title", required=true)  String title,@ApiParam(value = "", required=true) @RequestPart(value="subTitle", required=true)  String subTitle,@ApiParam(value = "会员id") @RequestPart(value="memberId", required=false)  Long memberId,@ApiParam(value = "file detail") @Valid @RequestPart("file") MultipartFile cover,@ApiParam(value = "") @RequestPart(value="summary", required=false)  String summary,@ApiParam(value = "") @RequestPart(value="content", required=false)  String content,@ApiParam(value = "") @RequestPart(value="tag", required=false)  String tag,@ApiParam(value = "备用字段") @RequestPart(value="categoryId", required=false)  Long categoryId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20012>(objectMapper.readValue("{  \"return\" : {    \"msg\" : \"msg\",    \"code\" : 0  }}", InlineResponse20012.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20012>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20012>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2003> orderlist(@ApiParam(value = "分页索引") @Valid @RequestParam(value = "pageIndex", required = false) Long pageIndex,@ApiParam(value = "分页尺寸") @Valid @RequestParam(value = "pageSize", required = false) Long pageSize,@ApiParam(value = "支付类型 0是支付宝 1是微信 2是银联 3是applay 4是其他") @Valid @RequestParam(value = "payType", required = false) Long payType,@ApiParam(value = "订单编号") @Valid @RequestParam(value = "orderNo", required = false) String orderNo,@ApiParam(value = "统计开始时间") @Valid @RequestParam(value = "startTime", required = false) Long startTime,@ApiParam(value = "统计结束时间") @Valid @RequestParam(value = "endTime", required = false) Long endTime,@ApiParam(value = "买书人id") @Valid @RequestParam(value = "memberId", required = false) Long memberId,@ApiParam(value = "检索时模糊查询使用") @Valid @RequestParam(value = "albumName", required = false) String albumName,@ApiParam(value = "加密串") @Valid @RequestParam(value = "val", required = false) String val,@ApiParam(value = "时间戳(参与加密)") @Valid @RequestParam(value = "ts", required = false) Long ts) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2003>(objectMapper.readValue("{  \"orders\" : [ {    \"albumName\" : \"albumName\",    \"orderNo\" : \"orderNo\",    \"albumId\" : 1,    \"memberName\" : \"memberName\",    \"id\" : 0,    \"time\" : 5,    \"value\" : 5.962133916683182377482808078639209270477294921875,    \"memberId\" : 6,    \"status\" : 2  }, {    \"albumName\" : \"albumName\",    \"orderNo\" : \"orderNo\",    \"albumId\" : 1,    \"memberName\" : \"memberName\",    \"id\" : 0,    \"time\" : 5,    \"value\" : 5.962133916683182377482808078639209270477294921875,    \"memberId\" : 6,    \"status\" : 2  } ],  \"status\" : {    \"msg\" : \"msg\",    \"code\" : 0  }}", InlineResponse2003.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2003>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2003>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2001> orderserialNuber(@ApiParam(value = "充值订单产生流水号"  )  @Valid @RequestBody Body1 body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2001>(objectMapper.readValue("{  \"data\" : {    \"msg\" : \"msg\",    \"order_no\" : \"order_no\",    \"code\" : 0,    \"serialNumber\" : \"serialNumber\",    \"time\" : 5,    \"type\" : 6,    \"value\" : 5,    \"memberId\" : \"memberId\",    \"status\" : 1  },  \"status\" : {    \"msg\" : \"msg\",    \"code\" : 0  }}", InlineResponse2001.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2001>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2001>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse20018> recordlist(@ApiParam(value = "开始时间戳") @Valid @RequestParam(value = "startTs", required = false) Long startTs,@ApiParam(value = "结束时间戳") @Valid @RequestParam(value = "endTs", required = false) Long endTs,@ApiParam(value = "标签(如:文学|历史|卡通)") @Valid @RequestParam(value = "tags", required = false) String tags,@ApiParam(value = "年级(如:1-4)") @Valid @RequestParam(value = "grade", required = false) String grade,@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client,@ApiParam(value = "用户id") @Valid @RequestParam(value = "memberId", required = false) String memberId,@ApiParam(value = "分页索引") @Valid @RequestParam(value = "pageIndex", required = false) Long pageIndex,@ApiParam(value = "分页尺寸") @Valid @RequestParam(value = "pageSize", required = false) Long pageSize) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20018>(objectMapper.readValue("{  \"recordList\" : [ {    \"summary\" : \"summary\",    \"cover\" : \"cover\",    \"duration\" : 0,    \"playCount\" : 6,    \"subTitle\" : \"subTitle\",    \"title\" : \"title\",    \"url\" : \"url\"  }, {    \"summary\" : \"summary\",    \"cover\" : \"cover\",    \"duration\" : 0,    \"playCount\" : 6,    \"subTitle\" : \"subTitle\",    \"title\" : \"title\",    \"url\" : \"url\"  } ],  \"status\" : {    \"msg\" : \"msg\",    \"code\" : 0  }}", InlineResponse20018.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20018>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20018>(HttpStatus.NOT_IMPLEMENTED);
    }

}
