Test case: SPR-12018
================

This is a test case demonstrating that the Spring container will call the `@PostConstruct` method and
start invoking `@Bean` methods on an `@Configuration` superclass before it has finished constructing
the runtime object.

This test case can be run by invoking `Launcher` or from the repackaged jar. It crashes on startup.