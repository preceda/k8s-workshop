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

## Useful tips
### How to apply file
If you have file with resource, for example deployment with name "my-app.yaml", you can deploy it to cluster with:
```kubectl apply -f path/to/file/my-app.yaml```

### kubectl commands
####kubectl get pod -A
Gives you all pods in cluster. If you want pods only in specific namespace, replace "-A" with "-n namespaceName"
#### kubectl describe pod POD_NAME -n NAMESPACE_NAME
Describe pod with name POD_NAME in namespace NAMESPACE_NAME. 
This gives you information about current state of pod, shows all containers in pod with container info and common info about pod. For example IP address of pod, labels etc.
#### kubectl logs POD_NAME -n NAMESPACE_NAME
Print out all logs from main container of pod POD_NAME in namespace NAMESPACE_NAME. 
If there is only one container it is always default, if there is more than one we can specify container with "-c" param.
We can use "-f" parameter for stream of logs.
#### kubectl delete pod/service/deployment/... RESOURCE_NAME -n NAMESPACE_NAME
This remove resource from cluster. 
For example:
```kubectl delete pod nginx -n workshop```
This command removes pod named nginx from namespace workshop.
#### kubectl edit deployment DEPLOYMENT_NAME -n NAMESPACE_NAME
With this command you can modify definition of resource, in this example deployment, but you can do it for every resource in cluster.

Some resources have limited subset of properties available for modification.
#### kubectl exec -it POD_NAME -n NAMESPACE_NAME -- bash
With this command we can execute command in pod default container. In this case open interactive terminal with bash.
Not every container has bash!