package com.GDocs.common.inputData;

import com.GDocs.utils.config.EnvConfig;
import com.GDocs.utils.config.properties.PropertiesReader;
import org.apache.log4j.Logger;

public class GenericData extends PropertiesReader {
    private static final Logger LOGGER = Logger.getLogger(GenericData.class);

    private GenericData() {
        super(EnvConfig.getTestConfigPath());
    }

    static GenericData genericData = new GenericData();

    public static final String HOMEPAGE_LINK = genericData.getProperty("frontend.url");
}
