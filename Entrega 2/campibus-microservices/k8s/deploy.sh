kubectl apply -f ../campibus-core/deployment.yml 

kubectl apply -f ../campibus-payments/deployment.yml 

kubectl apply -f services.yml

kubectl apply -f ingress.yml

kubectl get deployments