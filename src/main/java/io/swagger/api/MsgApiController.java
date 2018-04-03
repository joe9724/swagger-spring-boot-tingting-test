package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.InlineResponse20017;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import io.swagger.model.Msg;
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
import java.util.ArrayList;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-03T13:27:38.359Z")

@Controller
public class MsgApiController implements MsgApi {

    private static final Logger log = LoggerFactory.getLogger(MsgApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public MsgApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<InlineResponse20017> msglist(@ApiParam(value = "开始时间戳") @Valid @RequestParam(value = "startTs", required = false) Long startTs,@ApiParam(value = "结束时间戳") @Valid @RequestParam(value = "endTs", required = false) Long endTs,@ApiParam(value = "标签(如:文学|历史|卡通)") @Valid @RequestParam(value = "tags", required = false) String tags,@ApiParam(value = "年级(如:1-4)") @Valid @RequestParam(value = "grade", required = false) String grade,@ApiParam(value = "版本号") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "唯一识别号") @Valid @RequestParam(value = "imei", required = false) String imei,@ApiParam(value = "客户端类型") @Valid @RequestParam(value = "client", required = false) String client,@ApiParam(value = "用户id") @Valid @RequestParam(value = "memberId", required = false) String memberId,@ApiParam(value = "分页索引") @Valid @RequestParam(value = "pageIndex", required = false) Long pageIndex,@ApiParam(value = "分页尺寸") @Valid @RequestParam(value = "pageSize", required = false) Long pageSize) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20017>(objectMapper.readValue("{  \"msgList\" : [ {    \"subTitle\" : \"subTitle\",    \"createTime\" : 0,    \"from\" : \"from\",    \"title\" : \"title\"  }, {    \"subTitle\" : \"subTitle\",    \"createTime\" : 0,    \"from\" : \"from\",    \"title\" : \"title\"  } ],  \"status\" : {    \"msg\" : \"msg\",    \"code\" : 0  }}", InlineResponse20017.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20017>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
        InlineResponse20017 in;
        in = new InlineResponse20017();
        List<Msg> msgList = new ArrayList<Msg>();
        Msg msg = new Msg();
        msg.setTitle("pf");
        msgList.add(msg);
        in.setMsgList(msgList);

        return ResponseEntity.ok(in);
        //return new ResponseEntity<InlineResponse20017>(HttpStatus.OK);
        //return new ResponseEntity<InlineResponse20017>(HttpStatus.NOT_IMPLEMENTED);
    }

}
