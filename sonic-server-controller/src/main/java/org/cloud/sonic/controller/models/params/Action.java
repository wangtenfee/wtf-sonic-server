package org.cloud.sonic.controller.models.params;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author 王腾飞11
 * @function
 * @date 2024-10-16 星期三 14:19:50
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Action {
    private String type;
    private String detail;
}
