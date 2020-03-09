package org.gun.core.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 别名注解，使用此注解的字段、方法、参数等会有一个别名，用于Bean拷贝、Bean转Map等
 *
 * @author soloman
 * @since 5.1.1
 */

//表示该注解是否可以生成到 API文档中。在该注解使用后，如果导出API文档，会将该注解相关的信息可以被例如javadoc此类的工具文档化。 注意：Documented是一个标记注解，没有成员。
@Documented
//用于描述注解的生命周期，也就是说这个注解在什么范围内有效，注解的生命周期和三个阶段有关：源代码阶段、CLASS文件中有效、运行时有效，故其取值也就三个值，分别代表着三个阶段
@Retention(RetentionPolicy.RUNTIME)
//用于描述注解的使用范围，也就是说使用了@Target去定义一个注解，那么可以决定定义好的注解能用在什么地方
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
public @interface Alias {
	/**
	 * 别名值，即使用此注解要替换成的别名名称
	 * 
	 * @return 别明值
	 */
	String value();
}
