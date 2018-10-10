package com.log4j.demo;

import org.apache.log4j.Logger;

public class Log4jTest {

	private static Logger logger = Logger.getLogger(Log4jTest.class);

	public static void main(String[] args) {
		logger.debug("我是第一个日志debug");
		logger.info("我是第一个日志");
		logger.warn("我是第一个日志");
		logger.error("我是第一个日志error");
		logger.fatal("这个世界出事了");
	}
}
