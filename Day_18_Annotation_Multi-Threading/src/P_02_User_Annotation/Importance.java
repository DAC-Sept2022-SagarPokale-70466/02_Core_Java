/**
*	@Author : Sagar_Pokale
*	@Date		 : 19-Oct-2022 3:00:27 PM
*/

package P_02_User_Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.TYPE, ElementType.PARAMETER, ElementType.METHOD})
public @interface Importance{
			int value() default 0;
		
	}

