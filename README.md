# demo-consumer

## STS Local deployment
Within STS, Select Run, Run Configurations.  Highlight Spring Boot and select New.  Name it, fill in the Project (demo-consumer), Main (RegistryConsumerApplication.java). Alternatively (> STS 3.7.1-ish), you can leverage the Spring Boot Dashboard (highly recommended).  Windows-> Show View -> Other.  Within the Spring folder there should be a Boot Dashboard.  Within the dashboard you can start/stop instances with ease.  

This repo assumes a Eureka registry is up on your local laptop listening on port 35000.  
https://github.com/twhite0/demo-registry

The service can be executed via.
http://localhost:33000/demo/v0/consumer

## Jersey vs CXF
Flipping back and forth....not ideal but here we go:
Update the gradle.build file
Update the com.example.RegistryConsumerApplication.java (comment or uncomment the cxf)
Comment/Uncomment the com.example.endpoint.config files

Refresh the dependencies and restart