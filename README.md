## This is base project Java Servlet API
- References:[Restful Web Services Tutorial in Java](https://www.journaldev.com/9170/restful-web-services-tutorial-java)
- Steps:
```
1. In porm.xml:
    - Add dependency: 
        + javax.servlet-api
        + jsp-api
        + asm-all
        + jersey-bundle
        + json
        + jackson-databind
    - In build tag:
        + add: <sourceDirectory>src</sourceDirectory>
2. In web.xml config Jersey Servlet
    - in web-app tag add:
        + <servlet>
              <servlet-name>Jersey REST Service</servlet-name>
              <servlet-class>com.sun.jersey.spi.container.servlet.ServletContainer</servlet-class>
              <init-param>
                <param-name>com.sun.jersey.config.property.packages</param-name>
                <param-value>main.vn.siten.backend (your package name)</param-value>
              </init-param>
              <load-on-startup>1</load-on-startup>
            </servlet>
            <servlet-mapping>
              <servlet-name>Jersey REST Service</servlet-name>
              <url-pattern>/*</url-pattern>
            </servlet-mapping>
        
        
```
