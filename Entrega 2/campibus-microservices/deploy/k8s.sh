# configuring k8s objects

kubectl apply -f ../campibus-core/deployment.yml 

kubectl apply -f ../campibus-payments/deployment.yml 

kubectl apply -f ../campibus-digital-wallet/deployment.yml 

kubectl apply -f services.yml

# configuring ingress

kubectl apply -f https://raw.githubusercontent.com/kubernetes/ingress-nginx/main/deploy/static/provider/kind/deploy.yaml

kubectl wait --namespace ingress-nginx \
  --for=condition=ready pod \
  --selector=app.kubernetes.io/component=controller \
  --timeout=90s

# waiting for ingress setup
sleep 300

kubectl apply -f ingress.yml

# show all ks8 objects created

kubectl get deployments

kubectl get services

kubectl get pods

kubectl get ingress

# payment service integration setup

#npm install -g json-server

#json-server --watch db.json --port 3004

