package org.acme.observers;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.interceptor.InterceptorBinding;

@Documented
@Retention(RUNTIME)
@Target(FIELD)
@InterceptorBinding
public @interface Validated {

	int min() default 0;
	int max();
}
