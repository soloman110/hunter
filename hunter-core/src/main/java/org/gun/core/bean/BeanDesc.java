package org.gun.core.bean;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;

public class BeanDesc implements Serializable{

	private static final long serialVersionUID = 1L;
	private final Class<?> beanClass;
	private final Map<String, PropDesc> propMap = new LinkedHashMap<>();
	
	public BeanDesc(Class<?> beanClass) {
		this.beanClass = beanClass;
		//
	}
	
	public static class PropDesc {
		private final Field field;
		private final Method getter;
		private final Method setter;
		public PropDesc(Field field, Method getter, Method setter) {
			super();
			this.field = field;
			this.getter = getter;
			this.setter = setter;
		}
	}
}
