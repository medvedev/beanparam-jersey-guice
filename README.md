# jersey-guice-beanparam

This micro-project is purposed to show issue with Jersey @BeanParam and Guice DI framework.  
You need to open this project in IDE with gradle plug-in installed.  
To observe the issue, run main of GuiceApp and NoGuiceApp, then try `curl "http://localhost:8080?foo=test"`  
For GuiceApp "null" is returned in response, i.e. bean param is not populated with "test" value 
