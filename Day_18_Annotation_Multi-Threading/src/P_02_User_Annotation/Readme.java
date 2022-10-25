/**
*	@Author : Sagar_Pokale
*	@Date		 : 19-Oct-2022 2:54:43 PM
*/

package P_02_User_Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/***
 * Implement a Readme annotation that can be used on class-level or
 * method-level. It should provide information of developer and company who
 * written this code. If company name is not given then consider it as
 * "Sunbeam".
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE })
public @interface Readme {
	String Developer();

	String Company() default "Sunbeam";
}
