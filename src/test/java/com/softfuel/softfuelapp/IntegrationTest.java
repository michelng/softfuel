package com.softfuel.softfuelapp;

import com.softfuel.softfuelapp.config.AsyncSyncConfiguration;
import com.softfuel.softfuelapp.config.EmbeddedElasticsearch;
import com.softfuel.softfuelapp.config.EmbeddedSQL;
import com.softfuel.softfuelapp.config.JacksonConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { SoftfuelappApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedSQL
public @interface IntegrationTest {
}