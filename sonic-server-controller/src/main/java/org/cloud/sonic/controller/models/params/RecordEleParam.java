package org.cloud.sonic.controller.models.params;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author 王腾飞11
 * @function
 * @date 2024-10-19 星期六 20:47:36
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RecordEleParam {

    private List<ElementOnPage> elements;
    private int testCaseId;
    private int projectId;

}
