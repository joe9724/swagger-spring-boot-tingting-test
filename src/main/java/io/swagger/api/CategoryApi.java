/**
 * NOTE: This class is auto generated by the swagger code generator program (1.0.12).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.InlineResponse20025;
import io.swagger.model.InlineResponse20026;
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

@Api(value = "category", description = "the category API")
public interface CategoryApi {

    @ApiOperation(value = "分类详情", nickname = "categorydetail", notes = "分类详情", response = InlineResponse20025.class, tags={ "Category", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "分类详情", response = InlineResponse20025.class),
        @ApiResponse(code = 200, message = "error", response = Error.class) })
    @RequestMapping(value = "/category/detail",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse20025> categorydetail(@ApiParam(value = "会员id") @Valid @RequestParam(value = "memberId", required = false) Long memberId,@ApiParam(value = "分类id") @Valid @RequestParam(value = "categoryId", required = false) String categoryId,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei);


    @ApiOperation(value = "获取分类列表", nickname = "categorylist", notes = "获取分类列表", response = InlineResponse20026.class, tags={ "Category", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "查询成功，返回组织机构列表信息", response = InlineResponse20026.class) })
    @RequestMapping(value = "/category/list",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse20026> categorylist(@ApiParam(value = "开始时间戳") @Valid @RequestParam(value = "startTs", required = false) Long startTs,@ApiParam(value = "结束时间戳") @Valid @RequestParam(value = "endTs", required = false) Long endTs,@ApiParam(value = "标签(如:文学|历史|卡通)") @Valid @RequestParam(value = "tags", required = false) String tags,@ApiParam(value = "年级(如:1-4)") @Valid @RequestParam(value = "grade", required = false) String grade,@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client,@ApiParam(value = "用户id") @Valid @RequestParam(value = "memberId", required = false) String memberId,@ApiParam(value = "分页索引") @Valid @RequestParam(value = "pageIndex", required = false) Long pageIndex,@ApiParam(value = "分页尺寸") @Valid @RequestParam(value = "pageSize", required = false) Long pageSize,@ApiParam(value = "-1表示根目录 其他表示获取子类") @Valid @RequestParam(value = "parentId", required = false) Long parentId);


    @ApiOperation(value = "获取子类列表", nickname = "categorysublist", notes = "获取子类列表", response = InlineResponse20026.class, tags={ "Category", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "查询成功，返回组织机构列表信息", response = InlineResponse20026.class) })
    @RequestMapping(value = "/category/sub/list",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse20026> categorysublist(@ApiParam(value = "开始时间戳") @Valid @RequestParam(value = "startTs", required = false) Long startTs,@ApiParam(value = "结束时间戳") @Valid @RequestParam(value = "endTs", required = false) Long endTs,@ApiParam(value = "标签(如:文学|历史|卡通)") @Valid @RequestParam(value = "tags", required = false) String tags,@ApiParam(value = "年级(如:1-4)") @Valid @RequestParam(value = "grade", required = false) String grade,@ApiParam(value = "") @Valid @RequestParam(value = "categoryId", required = false) Long categoryId,@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client,@ApiParam(value = "用户id") @Valid @RequestParam(value = "memberId", required = false) String memberId,@ApiParam(value = "分页索引") @Valid @RequestParam(value = "pageIndex", required = false) Long pageIndex,@ApiParam(value = "分页尺寸") @Valid @RequestParam(value = "pageSize", required = false) Long pageSize);

}