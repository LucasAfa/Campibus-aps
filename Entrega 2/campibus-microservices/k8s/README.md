## setup k8s environment with kind

### install kind

https://kind.sigs.k8s.io/docs/user/quick-start/

### create cluster:

```
cat <<EOF | ./kind create cluster --name campibus --config=-
kind: Cluster
apiVersion: kind.x-k8s.io/v1alpha4
nodes:
- role: control-plane
  kubeadmConfigPatches:
  - |
    kind: InitConfiguration
    nodeRegistration:
      kubeletExtraArgs:
        node-labels: "ingress-ready=true"
  extraPortMappings:
  - containerPort: 80
    hostPort: 80
    protocol: TCP
  - containerPort: 443
    hostPort: 443
    protocol: TCP
EOF
```
- check if it's working

```$ kubectl get nodes```

### run script:

```$ bash deploy.sh```
