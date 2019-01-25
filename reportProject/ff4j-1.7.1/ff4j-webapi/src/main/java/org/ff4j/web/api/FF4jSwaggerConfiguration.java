package org.ff4j.web.api;

/*
 * #%L
 * ff4j-webapi
 * %%
 * Copyright (C) 2013 - 2015 FF4J
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import io.swagger.config.ScannerFactory;
import io.swagger.jaxrs.config.BeanConfig;

/**
 * Swagger configuration is shared between different JAXRS implementations.
 *
 * @author Cedrick Lunven (@clunven)</a>
 */
public final class FF4jSwaggerConfiguration {
    
    private static BeanConfig scanner =  new BeanConfig();
    
    private FF4jSwaggerConfiguration() {}
    
    static {
        scanner.setTitle("FF4J (ff4j.org) WebAPI");
        scanner.setDescription("Administrate and operate all tasks on your features through this api");
        scanner.setResourcePackage("org.ff4j.web.api.resources");
        scanner.setContact("@clunven");
        scanner.setLicense("Apache 2.0");
        scanner.setLicenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html");
        ScannerFactory.setScanner(scanner);
    }
    
    public static void setScan(boolean shouldScan) {
    	scanner.setScan(shouldScan);
    }
    /**
     * Allows to TODO
     * @return
     */
    public static BeanConfig getBeanConfig() {
        return scanner;
    }

}
