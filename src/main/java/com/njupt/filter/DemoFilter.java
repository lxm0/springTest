package com.njupt.filter;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class DemoFilter implements Filter {
    public boolean isLoggable(LogRecord record) {
        return false;
    }
}
