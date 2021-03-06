package com.yzhou.xraft.core.node.config;

import com.yzhou.xraft.core.log.Log;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Properties;

public class DefaultNodeConfigLoaderTest {

    @Test
    public void testLoad() throws IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        Properties p = new Properties();
        p.setProperty("replication.entries.max", "10");
        p.store(output, "");

        DefaultNodeConfigLoader loader = new DefaultNodeConfigLoader();
        NodeConfig config = loader.load(new ByteArrayInputStream(output.toByteArray()));
        Assert.assertEquals(10, config.getMaxReplicationEntries());
    }

    @Test
    public void testLoadIllegalValue() throws IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        Properties p = new Properties();
        p.setProperty("replication.entries.max", "foo");
        p.store(output, "");

        DefaultNodeConfigLoader loader = new DefaultNodeConfigLoader();
        NodeConfig config = loader.load(new ByteArrayInputStream(output.toByteArray()));
        Assert.assertEquals(Log.ALL_ENTRIES, config.getMaxReplicationEntries());
    }

}