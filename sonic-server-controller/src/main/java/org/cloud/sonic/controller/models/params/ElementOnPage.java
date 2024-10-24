package org.cloud.sonic.controller.models.params;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 王腾飞11
 * @function
 * @date 2024-10-23 星期三 17:57:49
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ElementOnPage {
    private String element;
    private String type;
    private String detail;
    private String eleType;
    private String pwd;
}
