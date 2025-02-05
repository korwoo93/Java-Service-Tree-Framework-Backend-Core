package com.arms.reqcomment.model;

import com.egovframework.javaservice.treeframework.model.TreeBaseDTO;
import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.Column;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ReqCommentDTO extends TreeBaseDTO {

    private Long c_pdservice_link;

    private Long c_version_link;

    private Long c_req_link;

    private String c_req_comment_sender;

    private String c_req_comment_date;

    private String c_req_comment_contents;

    private String c_req_comment_etc;

}
