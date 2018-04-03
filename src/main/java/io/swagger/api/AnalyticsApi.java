/**
 * NOTE: This class is auto generated by the swagger code generator program (1.0.12).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.InlineResponse200;
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

@Api(value = "analytics", description = "the analytics API")
public interface AnalyticsApi {

    @ApiOperation(value = "统计", nickname = "analyticsapp", notes = "统计", response = InlineResponse200.class, tags={ "Analytics", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "登录成功，返回登录信息", response = InlineResponse200.class),
        @ApiResponse(code = 200, message = "error", response = Error.class) })
    @RequestMapping(value = "/analytics/app",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse200> analyticsapp(@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client,@ApiParam(value = "用户id") @Valid @RequestParam(value = "memberId", required = false) String memberId,@ApiParam(value = "点赞/取消点赞 click/unclick") @Valid @RequestParam(value = "action", required = false) String action,@ApiParam(value = "被点赞内容类型") @Valid @RequestParam(value = "targetType", required = false) Long targetType,@ApiParam(value = "被点赞内容id") @Valid @RequestParam(value = "targetId", required = false) Long targetId);

}
