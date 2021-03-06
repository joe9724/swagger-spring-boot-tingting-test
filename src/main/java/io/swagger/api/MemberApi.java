/**
 * NOTE: This class is auto generated by the swagger code generator program (1.0.12).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-03T13:27:38.359Z")

@Api(value = "member", description = "the member API")
public interface MemberApi {

    @ApiOperation(value = "反馈", nickname = "feedback", notes = "反馈", response = InlineResponse20012.class, tags={ "Member", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "上报错误返回", response = InlineResponse20012.class),
        @ApiResponse(code = 200, message = "error", response = Error.class) })
    @RequestMapping(value = "/member/feedback",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse20012> feedback(@ApiParam(value = "意见反馈"  )  @Valid @RequestBody Body2 body);


    @ApiOperation(value = "修改密码", nickname = "findPasseditPass", notes = "修改密码", response = InlineResponse200.class, tags={ "Member", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "登录成功，返回登录信息", response = InlineResponse200.class),
        @ApiResponse(code = 200, message = "error", response = Error.class) })
    @RequestMapping(value = "/member/findPass/editPass",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse200> findPasseditPass(@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client,@ApiParam(value = "登录所用手机号") @Valid @RequestParam(value = "phoneNumber", required = false) String phoneNumber,@ApiParam(value = "加密串") @Valid @RequestParam(value = "val", required = false) String val,@ApiParam(value = "时间戳(加密串要用到,供服务端验证，简单防刷)") @Valid @RequestParam(value = "ts", required = false) Long ts,@ApiParam(value = "新密码") @Valid @RequestParam(value = "newPass", required = false) String newPass,@ApiParam(value = "老密码") @Valid @RequestParam(value = "oldPass", required = false) String oldPass,@ApiParam(value = "0=修改密码 1=找回密码") @Valid @RequestParam(value = "type", required = false) Long type,@ApiParam(value = "") @Valid @RequestParam(value = "extraInfo1", required = false) String extraInfo1);


    @ApiOperation(value = "下发找回密码时的验证码", nickname = "findPasssendSms", notes = "下发找回密码时的验证码", response = InlineResponse200.class, tags={ "Member", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "登录成功，返回登录信息", response = InlineResponse200.class),
        @ApiResponse(code = 200, message = "error", response = Error.class) })
    @RequestMapping(value = "/member/findPass/sendSms",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse200> findPasssendSms(@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client,@ApiParam(value = "登录所用手机号") @Valid @RequestParam(value = "phoneNumber", required = false) String phoneNumber,@ApiParam(value = "加密串") @Valid @RequestParam(value = "val", required = false) String val,@ApiParam(value = "时间戳(加密串要用到,供服务端验证，简单防刷)") @Valid @RequestParam(value = "ts", required = false) Long ts);


    @ApiOperation(value = "登录接口", nickname = "login", notes = "登录接口", response = InlineResponse20024.class, tags={ "Member", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "登录成功，返回登录信息", response = InlineResponse20024.class),
        @ApiResponse(code = 200, message = "error", response = Error.class) })
    @RequestMapping(value = "/member/login",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse20024> login(@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client,@ApiParam(value = "登录名") @Valid @RequestParam(value = "phone", required = false) String phone,@ApiParam(value = "登录方式,0代表密码登陆,1代表快捷登录") @Valid @RequestParam(value = "loginType", required = false) Long loginType,@ApiParam(value = "登录密码,") @Valid @RequestParam(value = "password", required = false) String password,@ApiParam(value = "快捷登录时上传smsCode,password留空") @Valid @RequestParam(value = "smsCode", required = false) String smsCode);


    @ApiOperation(value = "检查是否充值成功", nickname = "membercheckRecharge", notes = "检查是否充值成功", response = InlineResponse2004.class, tags={ "Member", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "登录成功，返回登录信息", response = InlineResponse2004.class),
        @ApiResponse(code = 200, message = "error", response = Error.class) })
    @RequestMapping(value = "/member/checkRecharge",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse2004> membercheckRecharge(@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client,@ApiParam(value = "用户id") @Valid @RequestParam(value = "memberId", required = false) String memberId,@ApiParam(value = "充值流水号") @Valid @RequestParam(value = "serialNumber", required = false) String serialNumber);


    @ApiOperation(value = "会员详情", nickname = "memberdetail", notes = "会员详情", response = InlineResponse20019.class, tags={ "Member", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "专辑详情", response = InlineResponse20019.class),
        @ApiResponse(code = 200, message = "error", response = Error.class) })
    @RequestMapping(value = "/member/detail",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse20019> memberdetail(@ApiParam(value = "会员id,未登录 -1") @Valid @RequestParam(value = "memberId", required = false) Long memberId,@ApiParam(value = "时间戳") @Valid @RequestParam(value = "ts", required = false) Long ts,@ApiParam(value = "加密串") @Valid @RequestParam(value = "val", required = false) String val,@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client);


    @ApiOperation(value = "修改用户资料", nickname = "memberedit", notes = "修改用户资料", response = InlineResponse200.class, tags={ "Member", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "操作成功", response = InlineResponse200.class),
        @ApiResponse(code = 200, message = "error", response = Error.class) })
    @RequestMapping(value = "/member/edit",
        produces = { "application/json" }, 
        consumes = { "multipart/form-data" },
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse200> memberedit(@ApiParam(value = "版本号") @RequestPart(value="version", required=false)  String version,@ApiParam(value = "唯一识别号") @RequestPart(value="imei", required=false)  String imei,@ApiParam(value = "客户端类型") @RequestPart(value="client", required=false)  String client,@ApiParam(value = "登录名") @RequestPart(value="Membername", required=false)  String membername,@ApiParam(value = "密码") @RequestPart(value="password", required=false)  String password,@ApiParam(value = "短信验证码") @RequestPart(value="validateCode", required=false)  String validateCode,@ApiParam(value = "手机号") @RequestPart(value="phoneNumber", required=false)  String phoneNumber,@ApiParam(value = "出生年") @RequestPart(value="birth-year", required=false)  Long birthYear,@ApiParam(value = "出生月") @RequestPart(value="birth-month", required=false)  Long birthMonth,@ApiParam(value = "出生日") @RequestPart(value="birth-day", required=false)  Long birthDay,@ApiParam(value = "年级") @RequestPart(value="grade", required=false)  Long grade,@ApiParam(value = "file detail") @Valid @RequestPart("file") MultipartFile avatar,@ApiParam(value = "时间戳") @RequestPart(value="ts", required=false)  Long ts,@ApiParam(value = "加密串") @RequestPart(value="val", required=false)  String val);


    @ApiOperation(value = "第三方登录", nickname = "memberloginByThirdParty", notes = "第三方登录", response = InlineResponse2001.class, tags={ "Member", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "上报错误返回", response = InlineResponse2001.class),
        @ApiResponse(code = 200, message = "error", response = Error.class) })
    @RequestMapping(value = "/member/loginByThirdParty",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse2001> memberloginByThirdParty(@ApiParam(value = "第三方登录"  )  @Valid @RequestBody Body body);


    @ApiOperation(value = "获取充值列表(含条件检索)", nickname = "memberrechargelist", notes = "获取充值列表", response = InlineResponse2002.class, tags={ "Member", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "获取反馈列表", response = InlineResponse2002.class),
        @ApiResponse(code = 200, message = "error", response = Error.class) })
    @RequestMapping(value = "/member/recharge/list",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse2002> memberrechargelist(@ApiParam(value = "分页索引") @Valid @RequestParam(value = "pageIndex", required = false) Long pageIndex,@ApiParam(value = "分页尺寸") @Valid @RequestParam(value = "pageSize", required = false) Long pageSize,@ApiParam(value = "支付类型 0是支付宝 1是微信 2是银联 3是applay 4是其他") @Valid @RequestParam(value = "payType", required = false) Long payType,@ApiParam(value = "流水号") @Valid @RequestParam(value = "orderNo", required = false) String orderNo,@ApiParam(value = "统计开始时间") @Valid @RequestParam(value = "startTime", required = false) Long startTime,@ApiParam(value = "统计结束时间") @Valid @RequestParam(value = "endTime", required = false) Long endTime,@ApiParam(value = "会员id") @Valid @RequestParam(value = "memberId", required = false) Long memberId,@ApiParam(value = "检索时模糊查询使用") @Valid @RequestParam(value = "albumName", required = false) String albumName,@ApiParam(value = "加密串") @Valid @RequestParam(value = "val", required = false) String val,@ApiParam(value = "时间戳(参与加密)") @Valid @RequestParam(value = "ts", required = false) Long ts);


    @ApiOperation(value = "注册接口", nickname = "memberregister", notes = "注册接口", response = InlineResponse200.class, tags={ "Member", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "登录成功，返回登录信息", response = InlineResponse200.class),
        @ApiResponse(code = 200, message = "error", response = Error.class) })
    @RequestMapping(value = "/member/register",
        produces = { "application/json" }, 
        consumes = { "multipart/form-data" },
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse200> memberregister(@ApiParam(value = "版本号") @RequestPart(value="version", required=false)  String version,@ApiParam(value = "唯一识别号") @RequestPart(value="imei", required=false)  String imei,@ApiParam(value = "客户端类型") @RequestPart(value="client", required=false)  String client,@ApiParam(value = "登录名") @RequestPart(value="Membername", required=false)  String membername,@ApiParam(value = "密码") @RequestPart(value="password", required=false)  String password,@ApiParam(value = "短信验证码") @RequestPart(value="validateCode", required=false)  String validateCode,@ApiParam(value = "手机号") @RequestPart(value="phoneNumber", required=false)  String phoneNumber,@ApiParam(value = "出生年") @RequestPart(value="birth-year", required=false)  Long birthYear,@ApiParam(value = "出生月") @RequestPart(value="birth-month", required=false)  Long birthMonth,@ApiParam(value = "出生日") @RequestPart(value="birth-day", required=false)  Long birthDay,@ApiParam(value = "年级") @RequestPart(value="grade", required=false)  Long grade,@ApiParam(value = "file detail") @Valid @RequestPart("file") MultipartFile avatar);


    @ApiOperation(value = "下发注册时的验证码", nickname = "memberregistersendSms", notes = "下发注册时的验证码", response = InlineResponse200.class, tags={ "Member", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "登录成功，返回登录信息", response = InlineResponse200.class),
        @ApiResponse(code = 200, message = "error", response = Error.class) })
    @RequestMapping(value = "/member/register/sendSms",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse200> memberregistersendSms(@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client,@ApiParam(value = "登录所用手机号") @Valid @RequestParam(value = "phoneNumber", required = false) String phoneNumber,@ApiParam(value = "加密串") @Valid @RequestParam(value = "val", required = false) String val,@ApiParam(value = "时间戳(加密串要用到,供服务端验证，简单防刷)") @Valid @RequestParam(value = "ts", required = false) Long ts);


    @ApiOperation(value = "页面报错(备用)", nickname = "memberreportErr", notes = "页面报错", response = InlineResponse20012.class, tags={ "Member", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "上报错误返回", response = InlineResponse20012.class),
        @ApiResponse(code = 200, message = "error", response = Error.class) })
    @RequestMapping(value = "/member/reportErr",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse20012> memberreportErr(@ApiParam(value = "report ERR to server"  )  @Valid @RequestBody Body3 body);


    @ApiOperation(value = "扫码", nickname = "memberscanCode", notes = "扫码", response = InlineResponse20013.class, tags={ "Member", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "扫码后服务端返回结果", response = InlineResponse20013.class),
        @ApiResponse(code = 200, message = "error", response = Error.class) })
    @RequestMapping(value = "/member/scanCode",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse20013> memberscanCode(@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client,@ApiParam(value = "用户id") @Valid @RequestParam(value = "memberId", required = false) String memberId,@ApiParam(value = "二维码中的url") @Valid @RequestParam(value = "codeUrl", required = false) String codeUrl,@ApiParam(value = "额外信息") @Valid @RequestParam(value = "extraInfo", required = false) String extraInfo);


    @ApiOperation(value = "启动页接口", nickname = "memberstartUp", notes = "启动页接口", response = InitModel.class, tags={ "Member", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = InitModel.class),
        @ApiResponse(code = 200, message = "error", response = Error.class) })
    @RequestMapping(value = "/member/startUp",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InitModel> memberstartUp(@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client);


    @ApiOperation(value = "添加/修改头像", nickname = "memberuploadAvatar", notes = "", response = InlineResponse20012.class, tags={ "Member", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "上传成功，返回成功信息", response = InlineResponse20012.class),
        @ApiResponse(code = 200, message = "error", response = Error.class) })
    @RequestMapping(value = "/member/uploadAvatar",
        produces = { "application/json" }, 
        consumes = { "multipart/form-data" },
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse20012> memberuploadAvatar(@ApiParam(value = "file detail") @Valid @RequestPart("file") MultipartFile icon,@ApiParam(value = "会员id") @RequestPart(value="memberId", required=false)  Long memberId,@ApiParam(value = "file detail") @Valid @RequestPart("file") MultipartFile cover,@ApiParam(value = "手机号") @RequestPart(value="phoneNumber", required=false)  String phoneNumber,@ApiParam(value = "备用字段1") @RequestPart(value="extraInfo1", required=false)  String extraInfo1,@ApiParam(value = "备用字段2") @RequestPart(value="extraInfo2", required=false)  String extraInfo2,@ApiParam(value = "备用字段3") @RequestPart(value="extraInfo3", required=false)  String extraInfo3);


    @ApiOperation(value = "添加一个大类", nickname = "memberuploadRecord", notes = "", response = InlineResponse20012.class, tags={ "Member", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "上传成功，返回成功信息", response = InlineResponse20012.class),
        @ApiResponse(code = 200, message = "error", response = Error.class) })
    @RequestMapping(value = "/member/uploadRecord",
        produces = { "application/json" }, 
        consumes = { "multipart/form-data" },
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse20012> memberuploadRecord(@ApiParam(value = "file detail") @Valid @RequestPart("file") MultipartFile icon,@ApiParam(value = "Description of file contents.", required=true) @RequestPart(value="title", required=true)  String title,@ApiParam(value = "", required=true) @RequestPart(value="subTitle", required=true)  String subTitle,@ApiParam(value = "会员id") @RequestPart(value="memberId", required=false)  Long memberId,@ApiParam(value = "file detail") @Valid @RequestPart("file") MultipartFile cover,@ApiParam(value = "") @RequestPart(value="summary", required=false)  String summary,@ApiParam(value = "") @RequestPart(value="content", required=false)  String content,@ApiParam(value = "") @RequestPart(value="tag", required=false)  String tag,@ApiParam(value = "备用字段") @RequestPart(value="categoryId", required=false)  Long categoryId);


    @ApiOperation(value = "获取订单列表(含条件检索)", nickname = "orderlist", notes = "获取订单列表", response = InlineResponse2003.class, tags={ "Member", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "获取反馈列表", response = InlineResponse2003.class),
        @ApiResponse(code = 200, message = "error", response = Error.class) })
    @RequestMapping(value = "/member/order/list",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse2003> orderlist(@ApiParam(value = "分页索引") @Valid @RequestParam(value = "pageIndex", required = false) Long pageIndex,@ApiParam(value = "分页尺寸") @Valid @RequestParam(value = "pageSize", required = false) Long pageSize,@ApiParam(value = "支付类型 0是支付宝 1是微信 2是银联 3是applay 4是其他") @Valid @RequestParam(value = "payType", required = false) Long payType,@ApiParam(value = "订单编号") @Valid @RequestParam(value = "orderNo", required = false) String orderNo,@ApiParam(value = "统计开始时间") @Valid @RequestParam(value = "startTime", required = false) Long startTime,@ApiParam(value = "统计结束时间") @Valid @RequestParam(value = "endTime", required = false) Long endTime,@ApiParam(value = "买书人id") @Valid @RequestParam(value = "memberId", required = false) Long memberId,@ApiParam(value = "检索时模糊查询使用") @Valid @RequestParam(value = "albumName", required = false) String albumName,@ApiParam(value = "加密串") @Valid @RequestParam(value = "val", required = false) String val,@ApiParam(value = "时间戳(参与加密)") @Valid @RequestParam(value = "ts", required = false) Long ts);


    @ApiOperation(value = "充值订单产生流水号", nickname = "orderserialNuber", notes = "充值订单产生流水号", response = InlineResponse2001.class, tags={ "Member", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "上报错误返回", response = InlineResponse2001.class),
        @ApiResponse(code = 200, message = "error", response = Error.class) })
    @RequestMapping(value = "/member/order/serialNuber",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse2001> orderserialNuber(@ApiParam(value = "充值订单产生流水号"  )  @Valid @RequestBody Body1 body);


    @ApiOperation(value = "获取录音列表", nickname = "recordlist", notes = "获取录音列表", response = InlineResponse20018.class, tags={ "Member", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "200信息", response = InlineResponse20018.class),
        @ApiResponse(code = 200, message = "error", response = Error.class) })
    @RequestMapping(value = "/member/record/list",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse20018> recordlist(@ApiParam(value = "开始时间戳") @Valid @RequestParam(value = "startTs", required = false) Long startTs,@ApiParam(value = "结束时间戳") @Valid @RequestParam(value = "endTs", required = false) Long endTs,@ApiParam(value = "标签(如:文学|历史|卡通)") @Valid @RequestParam(value = "tags", required = false) String tags,@ApiParam(value = "年级(如:1-4)") @Valid @RequestParam(value = "grade", required = false) String grade,@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client,@ApiParam(value = "用户id") @Valid @RequestParam(value = "memberId", required = false) String memberId,@ApiParam(value = "分页索引") @Valid @RequestParam(value = "pageIndex", required = false) Long pageIndex,@ApiParam(value = "分页尺寸") @Valid @RequestParam(value = "pageSize", required = false) Long pageSize);

}
