package testRunners;

import org.junit.platform.suite.api.*;

import io.cucumber.junit.platform.engine.Constants;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(
        key = Constants.GLUE_PROPERTY_NAME,
        value = "stepDefinitions"
)
@ConfigurationParameter(
        key = Constants.FILTER_TAGS_PROPERTY_NAME,
        value = "@activity6"
)
public class Activity6Runner {
}
