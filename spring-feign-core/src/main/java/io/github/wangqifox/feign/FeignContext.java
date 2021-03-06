package io.github.wangqifox.feign;

/**
 * @author: wangqi
 * @description:
 * @date: Created in 2019-01-10 17:30
 */
public class FeignContext extends NamedContextFactory<FeignClientSpecification> {

    public FeignContext(Class<?> configClass) {
        super(configClass, "feign", "feign.client.name");
    }

}