package org.data.common;

import java.sql.Connection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MultiDataSource {

    private static final Map<String, Connection> dataSources = new ConcurrentHashMap<>();
}
