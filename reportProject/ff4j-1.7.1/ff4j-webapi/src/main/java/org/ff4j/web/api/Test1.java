//package org.ff4j.web.api;
//
///*
// * #%L
// * ff4j-webapi
// * %%
// * Copyright (C) 2013 - 2018 FF4J
// * %%
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// * 
// *      http://www.apache.org/licenses/LICENSE-2.0
// * 
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// * #L%
// */
//
//
//import io.swagger.annotations.Api;
//import io.swagger.annotations.Extension;
//import io.swagger.annotations.ExtensionProperty;
//import io.swagger.annotations.SwaggerDefinition;
//import io.swagger.annotations.Tag;
//import io.swagger.jaxrs.config.BeanConfig;
//@Api
//@SwaggerDefinition(tags = @Tag(name = "test",extensions=@Extension(name="test",properties = @ExtensionProperty(name = "test", value = ""))))
//public class Test1 {
//	public static void main(String[] args) {
//		BeanConfig beanConfig = FF4jSwaggerConfiguration.getBeanConfig();
//		beanConfig.setResourcePackage("org.ff4j.web.api");
//		beanConfig.setScan(true);
//	}
//}
