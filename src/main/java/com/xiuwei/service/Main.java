package com.xiuwei.service;

//新建 Main 类（服务使用者，调用方），启动程序查看结果。
public class Main {
    public static void main(String[] args) {
        LoggerService service = LoggerService.getService();

        service.info("Hello SPI");
        service.debug("Hello SPI");
        /**
         * 打印：
         * info 中没有发现 Logger 服务提供者
         * debug 中没有发现 Logger 服务提供者
         * 因为还没有具体的实现类。
         *
         * 但是如果添加了spi-serviceProvider-1.0-SNAPSHOT.jar实现类的依赖，会打印：
         * Logback info 的输出：Hello SPI
         * Logback debug 的输出：Hello SPI
         */
    }
}
