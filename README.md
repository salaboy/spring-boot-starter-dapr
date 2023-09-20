# Testcontainers Modules for Dapr

Repository hosting the Testcontainers Dapr modules in Java, Go and .NET. 

## Java

If you are using Spring Boot, to get started with Dapr you just need to add the following dependency to your Maven or Graddle project: 

```xml
    <dependency>
        <groupId>github.com/salaboy/testcontainers-dapr-modules</groupId>
        <artifactId>spring-boot-starter-dapr</artifactId>
        <version>main</version>
    </dependency>    
```

You also need to add the Jitpack repository: 

```xml
    <repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```
