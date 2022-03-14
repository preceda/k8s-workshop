# Kubernetes workshop for beginners

Repository contains resources for basic k8s workshop for beginners.

## k8s resources
Prepared set of basic k8s resources for workshop. 
Resources are mainly demonstrate on nginx container:
https://hub.docker.com/_/nginx
### Covered resources
- Namespace
- Pod
- Deployment
- Service
  - Cluster IP
  - Node port
- Ingress
- Persistence volume 
- Persistence volume claim
- Secret
- Configmap


## HelloWorld application
Simple Java web application running on port 8080 with greeting endpoint: /hello-world

Application returns value of env variable POD_NAME in greeting or "empty" if it isn't set 

Application is also available on docker hub:
https://hub.docker.com/repository/docker/tkadlecp/hello_world_app