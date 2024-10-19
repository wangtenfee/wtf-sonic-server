package org.cloud.sonic.controller.models.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.*;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlCharsetConstant;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlEngineConstant;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.cloud.sonic.controller.models.base.TypeConverter;
import org.cloud.sonic.controller.models.dto.ElementsDTO;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author JayWenStar
 * @since 2021-12-17
 */
@Schema(name ="Elements对象", description = "")
@Data
@Accessors(chain = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("elements")
@TableComment("控件元素表")
@TableCharset(MySqlCharsetConstant.DEFAULT)
@TableEngine(MySqlEngineConstant.InnoDB)
public class Elements implements Serializable, TypeConverter<Elements, ElementsDTO> {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Elements elements = (Elements) o;
        return Objects.equals(id, elements.id) && Objects.equals(eleName, elements.eleName) && Objects.equals(eleType, elements.eleType) && Objects.equals(eleValue, elements.eleValue) && Objects.equals(projectId, elements.projectId) && Objects.equals(moduleId, elements.moduleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, eleName, eleType, eleValue, projectId, moduleId);
    }

    @TableId(value = "id", type = IdType.AUTO)
    @IsAutoIncrement
    private Integer id;

    @TableField
    @Column(value = "ele_name", isNull = false, comment = "控件名称")
    private String eleName;

    @TableField
    @Column(value = "ele_type", isNull = false, comment = "控件类型")
    private String eleType;

    @TableField
    @Column(value = "ele_value", type = MySqlTypeConstant.LONGTEXT, comment = "控件内容")
    private String eleValue;

    @TableField
    @Column(value = "project_id", isNull = false, comment = "所属项目id")
    @Index(value = "IDX_PROJECT_ID", columns = {"project_id"})
    private Integer projectId;


    @TableField
    @Column(value = "module_id", isNull = true, comment = "所属项目id", defaultValue = "0")
    @Index(value = "IDX_MODULE_ID", columns = {"module_id"})
    private Integer moduleId;

    public static Elements newDeletedElement(int id) {
        String tips = "Element does not exist.";
        return new Elements()
                .setId(id)
                .setEleName(tips)
                .setModuleId(0)
                .setEleType("id")
                .setEleValue(tips)
                .setProjectId(0);
    }
}
